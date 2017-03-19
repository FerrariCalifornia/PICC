package com.cc.dao;

import com.cc.pojo.Feedback;
import com.cc.pojo.FeedbackExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FeedbackMapper {
    int countByExample(FeedbackExample example);

    int deleteByExample(FeedbackExample example);

    int deleteByPrimaryKey(String feedbackId);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    List<Feedback> selectByExample(FeedbackExample example);
    List<Feedback> selectAll();
    Feedback selectByPrimaryKey(String feedbackId);

    int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);
}