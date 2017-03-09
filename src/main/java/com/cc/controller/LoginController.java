package com.cc.controller;

import com.cc.pojo.UserRole;
import com.cc.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cc on 2017/3/1.
 */
@Controller
public class LoginController {


    @Autowired
    private LoginService loginService;

    /*
     sign in
     */
    @RequestMapping(value = "/sign",method = RequestMethod.GET)
    @ResponseBody
    public String signIn(UserRole user){
        loginService.signIn(user);
        return "success";
    }
    /*
    log in
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(UserRole user){
        Subject subject = SecurityUtils.getSubject() ;
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword()) ;
        try {
            subject.login(token);
            return "login success" ;
        }catch (Exception e){
            //这里将异常打印关闭是因为如果登录失败的话会自动抛异常
//            e.printStackTrace();
            return "wrong pssword or username";
        }
    }

}
