package com.cc.controller;

import com.cc.pojo.Admin;
import com.cc.pojo.UserRole;
import com.cc.service.LoginService;
import com.google.gson.Gson;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cc on 2017/3/1.
 */

@Controller
public class LoginController {


    @Autowired
    private LoginService loginService;

    /**
     * sign in
     *
     * @param user
     * @return
     */

    @RequestMapping(value = "/sign", method = RequestMethod.GET)
    @ResponseBody
    public String signIn(UserRole user) {
        loginService.signIn(user);
        return "success";
    }

    /**
     * log in
     *
     * @param user
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(UserRole user) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        try {
            subject.login(token);
            return "login success";
        } catch (Exception e) {
            //这里将异常打印关闭是因为如果登录失败的话会自动抛异常
//            e.printStackTrace();
            return "wrong pssword or username";
        }
    }

    /**
     * admin login
     *
     * @param admin
     * @return
     */


    @RequestMapping(value = "/adminLogin",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String adminLogin(Admin admin) {
        Map<String,String> map = new HashMap<String, String>();
        Gson gson = new Gson();
        if (admin != null) {
            System.out.println(admin.getName());
            System.out.println(admin.getPassword());
            if (admin.getName().equals("admin") && admin.getPassword().equals("admin")) {
                System.out.println("log in success");
                map.put("message","success");

            } else {
                System.out.println("wrong password or username");
                map.put("message","error");
                map.put("error","Wrong Password or username");

            }
        } else {
            System.out.println("error");
            map.put("error","ERROR!");
        }
        return gson.toJson(map);
    }


}