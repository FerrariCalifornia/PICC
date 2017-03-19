package com.cc.controller;

import com.cc.pojo.UserInfo;
import com.cc.service.UserService;
import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by cc on 2017/3/10.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUserList", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getUserList() {

        Gson gson = new Gson();
        String json = gson.toJson(userService.getUserList());
        return json;
    }


    /**
     * add user
     *
     * @param user
     * @return
     */

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public String addUser(UserInfo user) {
        userService.addUser(user);
        return "success";
    }

    /**
     * delete user
     *
     * @param user
     * @return
     */

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    @ResponseBody
    public String deleteUser(UserInfo user) {
        userService.deleteUser(user);
        return "success";
    }
}
