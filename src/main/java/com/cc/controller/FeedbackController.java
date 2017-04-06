package com.cc.controller;

import com.cc.others.IdWorker;
import com.cc.pojo.*;
import com.cc.service.CustomerInfoService;
import com.cc.service.CustomerStatusService;
import com.cc.service.FeedbackService;
import com.cc.service.LoginService;
import com.google.gson.Gson;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by cc on 2017/3/9.
 */
@Controller
public class FeedbackController {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Resource
    private FeedbackService feedbackService;
    @Resource
    private LoginService loginService;
    @Resource
    private CustomerInfoService customerInfoService;
    @Resource
    private CustomerStatusService customerStatusService;

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

    /**
     * 提交表单
     * @param lastPurchasedate
     * @param customerId
     * @param failReasonType
     * @param remark
     * @return
     */
    @RequestMapping(value = "/postFeedback",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String postFeedback(
            @RequestParam("lastPurchasedate") String lastPurchasedate,
            @RequestParam("customerId") String customerId,
            @RequestParam("failReasonType") String failReasonType,
            @RequestParam("status") String status,
            @RequestParam("remark") String remark
    ){
        Feedback feedback = new Feedback();
        Gson gson = new Gson();
        Map<String,String> map = new HashMap<String, String>();
        Date lastdate;
        //判断日期是不是为空
        if(lastPurchasedate!=null){
            try {
                lastdate = dateFormat.parse(lastPurchasedate);
                feedback.setLastPurchasedate(lastdate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        IdWorker feedbackid = new IdWorker();
        feedback.setFeedbackId(Long.toString(feedbackid.nextId()));
        feedback.setSalesDate(new Date());
        Subject currentUser = SecurityUtils.getSubject();
        String username = currentUser.getPrincipal().toString();
        String user_id = loginService.findUserByUsername(username).getUserId();
        feedback.setUserId(user_id);
        feedback.setCustomerId(customerId);
        feedback.setFailReasonType(failReasonType);
        feedback. setRemark(remark);
        feedbackService.insertFeedback(feedback);

        // update table customer_info customer_status
        if(status.equals("one")){
            customerInfoService.updateCustomerStatus(1,customerId);
            customerStatusService.updateCustomerStatus(1,customerId);
        }else if (status.equals("two")){
            customerInfoService.updateCustomerStatus(2,customerId);
            customerStatusService.updateCustomerStatus(2,customerId);
        }else if (status.equals("three")){
            customerInfoService.updateCustomerStatus(3,customerId);
            customerStatusService.updateCustomerStatus(3,customerId);
        }

        map.put("message","success");
        String message = gson.toJson(map);
        return message;
    }


    @RequestMapping(value = "/getFeedbackByCustomerId",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public void getOneCustomer(String id,HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=utf-8");
        Gson gson = new Gson();
        PrintWriter pw = response.getWriter();
        FeedbackWithStatus a = feedbackService.getFeedbackByCustomerId(id);
        Date lastdate= a.getLastPurchasedate();
        String date2="";
        if (lastdate!=null){
             date2= dateFormat.format(lastdate);
        }
        FeedbackWithStatus2 feedbackWithStatus2 =new FeedbackWithStatus2(a.getUserId(),a.getCustomerId(),a.getFailReasonType(),
                date2,a.getRemark(),a.getStatus());

        String json = gson.toJson(feedbackWithStatus2);
        System.out.println(json);
        pw.print(json);
        pw.close();
    }



    @RequestMapping(value = "/updateFeedback",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String updateFeedback(
            @RequestParam("lastPurchasedate") String lastPurchasedate,
            @RequestParam("customerId") String customerId,
            @RequestParam("failReasonType") String failReasonType,
            @RequestParam("status") String status,
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
        feedback.setSalesDate(new Date());
        Subject currentUser = SecurityUtils.getSubject();
        String username = currentUser.getPrincipal().toString();
        String user_id = loginService.findUserByUsername(username).getUserId();
        feedback.setUserId(user_id);
        feedback.setCustomerId(customerId);
        feedback.setFailReasonType(failReasonType);
        feedback. setRemark(remark);
        feedbackService.updateFeedbackList(feedback);

        // update table customer_info customer_status
        if(status.equals("one")){
            customerInfoService.updateCustomerStatus(1,customerId);
            customerStatusService.updateCustomerStatus(1,customerId);
        }else if (status.equals("two")){
            customerInfoService.updateCustomerStatus(2,customerId);
            customerStatusService.updateCustomerStatus(2,customerId);
        }else if (status.equals("three")){
            customerInfoService.updateCustomerStatus(3,customerId);
            customerStatusService.updateCustomerStatus(3,customerId);
        }

        map.put("message","success");
        String message = gson.toJson(map);
        return message;
    }
}
