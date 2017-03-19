package com.cc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cc on 2017/3/19.
 */

@Controller
public class RouteController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("rhis is test");
        return  "index2";
    }
}
