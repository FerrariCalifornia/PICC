package com.cc.controller;

import com.cc.pojo.CustomerInfo;
import com.cc.pojo.Page;
import com.cc.service.CustomerInfoService;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cc on 2017/3/9.
 */
@Controller
public class CustomerInfoController {
    private static String json;


    @Autowired
    private CustomerInfoService customerInfoService;
    /*
     get customer list
 */

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/getCustomerList",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getFeedbackList(@RequestParam(required = false, defaultValue = "0") int pageNum,
                                  @RequestParam(required = false, defaultValue = "5") int pageSize){

        Page page = new Page();
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);
        Gson gson = new Gson();
        json = gson.toJson(customerInfoService.getAllCustomerInfo(page));
        return json;
    }

    @RequestMapping(value = "/getOneCustomer",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getOneCustomer(Integer id){
        Gson gson = new Gson();
        List<CustomerInfo> one = new ArrayList<CustomerInfo>();
        if(id ==null){
            id =3;
        }
            one.add(customerInfoService.getOneCustomer(id));
        json = gson.toJson(one);
        System.out.println(json);
        return json;
    }
}
