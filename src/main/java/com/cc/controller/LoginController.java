package com.cc.controller;

import com.cc.dao.CustomerStatusMapper;
import com.cc.pojo.Admin;
import com.cc.pojo.UserInfo;
import com.cc.service.LoginService;
import com.google.gson.Gson;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cc on 2017/3/1.
 */

@Controller
public class LoginController {


    @Autowired
    private LoginService loginService;
    private CustomerStatusMapper customerStatusMapper;


    /**
     * log in
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    @ResponseBody
    public String login(UserInfo user) {
        System.out.println("正在登录.......");
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        Session session = subject.getSession();
        System.out.println(session.getHost());
        System.out.println(session.getId());
        try {
            subject.login(token);
            if (subject.hasRole("admin")) {
                System.out.println("管理员正在登录");
                System.out.println("admin long in  success");
                return "adminsuccess";
            } else if (subject.hasRole("user")) {
                System.out.println("用户登录成功!");
                return "success";
            } else {
                return "呵呵 你是谁？";
            }
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


    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String adminLogin(Admin admin, HttpSession session) {
        Map<String, String> map = new HashMap<String, String>();
        Gson gson = new Gson();
        if (admin != null) {
            System.out.println(admin.getUsername());
            System.out.println(admin.getPassword());
            if (admin.getUsername().equals("admin") && admin.getPassword().equals("admin")) {
                System.out.println("log in success");
                map.put("message", "success");
                session.setAttribute("admin", admin);


            } else {
                System.out.println("wrong password or username");
                map.put("message", "error");
                map.put("error", "Wrong Password or username");

            }
        } else {
            System.out.println("error");
            map.put("error", "ERROR!");
        }
        return gson.toJson(map);
    }


    @RequestMapping(value = "/logout", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

    public String logout() {
        System.out.println("this is log out");
        Subject currentUser = SecurityUtils.getSubject();
        String username = currentUser.getPrincipal().toString();
        System.out.println(username + " logout");
        currentUser.logout();
        System.out.println("log out success");

        return "login";
    }

}
