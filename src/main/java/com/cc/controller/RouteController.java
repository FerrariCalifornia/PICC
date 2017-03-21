package com.cc.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cc on 2017/3/19.
 */

@Controller
public class RouteController {
    @RequestMapping("/user")
    public String test(){
        return  "form-elements";
    }
    @RequestMapping("/admin")
    public String test2(){
        return  "admintable";
    }
}
