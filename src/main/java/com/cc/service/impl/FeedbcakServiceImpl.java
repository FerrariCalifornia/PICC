package com.cc.service.impl;

import com.cc.dao.FeedbackMapper;
import com.cc.pojo.FeedbackWithStatus;
import com.cc.service.FeedbackService;
import com.cc.pojo.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cc on 2017/3/1.
 */
@Service("feedbackService")
public class FeedbcakServiceImpl implements FeedbackService {
    @Resource
    private FeedbackMapper feedbackMapper;


    @Override
    public List<Feedback> getFeedback() {
        return feedbackMapper.selectAll();
    }

    @Override
    public void updateFeedbackList(Feedback feedback) {
        feedbackMapper.updateFeedbackList(feedback);
    }

    @Override
    public void insertFeedback(Feedback feedback) {
        feedbackMapper.insert(feedback);
    }

    @Override
    public FeedbackWithStatus getFeedbackByCustomerId(String customer_id) {
        return feedbackMapper.getFeedbackByCustomerId(customer_id);
    }
}
