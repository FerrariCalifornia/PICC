package com.cc.service.impl;

import com.cc.dao.FeedbackMapper;
import com.cc.pojo.Feedback;
import com.cc.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cc on 2017/3/1.
 */
@Service("feedbackService")
public class FeedbcakServiceImpl implements FeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;


    @Override
    public List<Feedback> getFeedback() {
        return feedbackMapper.selectAll();
    }

    @Override
    public void insertFeedback(Feedback feedback) {
        feedbackMapper.insert(feedback);
    }
}
