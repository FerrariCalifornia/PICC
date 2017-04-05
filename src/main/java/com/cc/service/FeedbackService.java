package com.cc.service;

import com.cc.pojo.Feedback;
import com.cc.pojo.FeedbackWithStatus;

import java.util.List;

/**
 * Created by cc on 2017/3/9.
 */
public interface FeedbackService {
    List<Feedback> getFeedback();
    void updateFeedbackList(Feedback feedback);
    void insertFeedback(Feedback feedback);
    FeedbackWithStatus getFeedbackByCustomerId(String customer_id);
}
