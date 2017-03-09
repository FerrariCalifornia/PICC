package com.cc.service;

import com.cc.pojo.Feedback;

import java.util.List;

/**
 * Created by cc on 2017/3/9.
 */
public interface FeedbackService {
    List<Feedback> getFeedback();
    void insertFeedback(Feedback feedback);
}
