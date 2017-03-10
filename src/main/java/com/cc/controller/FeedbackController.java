package com.cc.controller;

import com.cc.pojo.UserRole;
import com.cc.service.FeedbackService;
import com.cc.service.LoginService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cc on 2017/3/9.
 */
@Controller
public class FeedbackController {


    @Autowired
    private FeedbackService feedbackService;

    /*
     get feedback list
 */
    @RequestMapping(value = "/getFeedbackList",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getFeedbackList(){

        Gson gson = new Gson();
        String json = gson.toJson(feedbackService.getFeedback());
        return json;
    }
}
