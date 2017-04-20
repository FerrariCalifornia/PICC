package com.cc.controller;

import com.cc.pojo.CustomerInfo;
import com.cc.pojo.CustomerStatus;
import com.cc.pojo.Page;
import com.cc.pojo.UseridAndPageInfo;
import com.cc.service.CustomerInfoService;
import com.cc.service.CustomerStatusService;
import com.cc.service.LoginService;
import com.cc.service.UserService;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by cc on 2017/3/9.
 */
@Controller
public class CustomerInfoController {
    private static String json;


    @Resource
    private CustomerInfoService customerInfoService;
    @Resource
    private CustomerStatusService customerStatusService;
    @Resource
    private UserService userService;
    @Resource
    private LoginService loginService;
    /*
     get customer list 带分页
 */

    @RequestMapping(value = "/getCustomerList",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getFeedbackList(@RequestParam(required = false, defaultValue = "0") int pageNum,
                                  @RequestParam(required = false, defaultValue = "10") int pageSize){
        Gson gson = new Gson();
        Subject currentUser = SecurityUtils.getSubject();
        String username = currentUser.getPrincipal().toString();
        String user_id = loginService.findUserByUsername(username).getUserId();
        UseridAndPageInfo useridAndPageInfo = new UseridAndPageInfo();
        useridAndPageInfo.setUser_id(user_id);
        useridAndPageInfo.setPage_num(pageNum*pageSize);
        useridAndPageInfo.setPage_size(pageSize);
        List<CustomerInfo> customerInfoList = customerInfoService.getCustomerListFromStatusTable(useridAndPageInfo);
        json=gson.toJson(customerInfoList);
        return json;
    }

    /**
     * 返回所有根据用户名查到的客户信息，不进行分页。
     * @return
     */


    @RequestMapping(value = "/getCustomerListByUserName",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getCustomerListByUserName(){
        Gson gson = new Gson();
        Subject currentUser = SecurityUtils.getSubject();
        String username = currentUser.getPrincipal().toString();
        String user_id = loginService.findUserByUsername(username).getUserId();
        List<CustomerInfo> customerInfoList = customerInfoService.getAllCustomerListFromStatusTable(user_id);
        json=gson.toJson(customerInfoList);
        return json;
    }


    @RequestMapping(value = "/getAllCustomerList",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getAllCustomerList(){
        Gson gson = new Gson();
        List<CustomerInfo> customerInfoList = customerInfoService.getAllCustomerList();
        json=gson.toJson(customerInfoList);
        return json;
    }

//    @RequestMapping(value = "/getOneCustomer",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public String getOneCustomer(Integer id,HttpServletResponse response){
//        response.setContentType("application/json;charset=utf-8");
//        Gson gson = new Gson();
//        List<CustomerInfo> one = new ArrayList<CustomerInfo>();
//        if(id ==null){
//            id =3;
//        }
//            one.add(customerInfoService.getOneCustomer(id));
//        json = gson.toJson(one);
//        System.out.println(json);
//        return json;
//    }


    @RequestMapping(value = "/getOneCustomer",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public void getOneCustomer(Integer id,HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        Gson gson = new Gson();
        PrintWriter pw = response.getWriter();
        List<CustomerInfo> one = new ArrayList<CustomerInfo>();
        if(id ==null){
            pw.print("呵呵");
        }
        one.add(customerInfoService.getOneCustomer(id));
        json = gson.toJson(one);
//        System.out.println(json);
        pw.print(json);

        pw.close();
    }


    /**
     * 从customer status not zero 表关联反馈表和用户表中取出待跟进客户名单
     * @return
     */
    @RequestMapping(value = "/getCustomerNotZeroByUserName",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getCustomerNotZeroByUserName(@RequestParam(defaultValue = "0")int type){
        String s = null;
        if (type==1){
            s="未打通";
        }else if (type==2){
            s="无人接听";
        }else if (type==3){
            s="保险未到期";
        }

        Gson gson = new Gson();
        Subject currentUser = SecurityUtils.getSubject();
        String username = currentUser.getPrincipal().toString();
        String user_id = loginService.findUserByUsername(username).getUserId();
        List<CustomerInfo> customerInfoList = customerInfoService.getCustomerStatusNotZero(user_id,s);
        json=gson.toJson(customerInfoList);
        return json;
    }

}
