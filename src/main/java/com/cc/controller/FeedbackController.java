package com.cc.controller;

import com.cc.others.IdWorker;
import com.cc.pojo.Feedback;
import com.cc.pojo.UserRole;
import com.cc.service.FeedbackService;
import com.cc.service.LoginService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cc on 2017/3/9.
 */
@Controller
public class FeedbackController {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

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
    @RequestMapping(value = "/postFeedback",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String postFeedback(
            @RequestParam("lastPurchasedate") String lastPurchasedate,
            @RequestParam("customerId") String customerId,
            @RequestParam("failReasonType") String failReasonType,
            @RequestParam("remark") String remark
    ){
        Feedback feedback = new Feedback();
        Gson gson = new Gson();
        Map<String,String> map = new HashMap<String, String>();
        Date lastdate;
        try {
             lastdate = dateFormat.parse(lastPurchasedate);
             feedback.setLastPurchasedate(lastdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        IdWorker feedbackid = new IdWorker();
        feedback.setFeedbackId(Long.toString(feedbackid.nextId()));
        feedback.setSalesDate(new Date());
        feedback.setUserId("1");
        feedback.setCustomerId(customerId);
        feedback.setFailReasonType(failReasonType);
        feedback. setRemark(remark);
        feedbackService.insertFeedback(feedback);
        String json = gson.toJson(feedback);
        System.out.println(lastPurchasedate);
        map.put("message","success");
        String message = gson.toJson(map);
        return message;
    }
}
