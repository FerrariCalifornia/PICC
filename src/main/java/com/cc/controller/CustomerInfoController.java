package com.cc.controller;

import com.cc.pojo.CustomerInfo;
import com.cc.pojo.CustomerStatus;
import com.cc.pojo.Page;
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
     get customer list
 */

    @RequestMapping(value = "/getCustomerList",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getFeedbackList(@RequestParam(required = false, defaultValue = "0") int pageNum,
                                  @RequestParam(required = false, defaultValue = "10") int pageSize){

        Gson gson = new Gson();
        Subject currentUser = SecurityUtils.getSubject();
        String username = currentUser.getPrincipal().toString();

        String user_id = loginService.findUserByUsername(username).getUserId();
        List<CustomerInfo> customerInfoList = customerInfoService.getCustomerListFromStatusTable(username);
        if (customerInfoList.size()==0){
            Page page = new Page();
            page.setPageNum(0);
            page.setPageSize(20);
            List<CustomerInfo> customerInfoList2=customerInfoService.getAllCustomerInfo(page);
            for (CustomerInfo customerInfo:customerInfoList2 //注意此处的名字 和上面很像，后面多了个2
                 ) {
                CustomerStatus customerStatus = new CustomerStatus();
                customerStatus.setCustomerId(customerInfo.getCustomerId());
                customerStatus.setUserId(user_id);
                customerStatus.setStatus(customerInfo.getStatus());
                customerStatusService.insert(customerStatus);
            }
            json=gson.toJson(customerInfoList2);

        }else {
            json=gson.toJson(customerInfoService.getCustomerListFromStatusTable(username));

        }

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
}
