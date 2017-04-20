package com.cc.dao;

import com.cc.pojo.CallFailCustomer;
import com.cc.pojo.CallFailCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallFailCustomerMapper {
    int countByExample(CallFailCustomerExample example);

    int deleteByExample(CallFailCustomerExample example);

    int deleteByPrimaryKey(String customerId);

    int insert(CallFailCustomer record);

    int insertSelective(CallFailCustomer record);

    List<CallFailCustomer> selectByExample(CallFailCustomerExample example);

    CallFailCustomer selectByPrimaryKey(String customerId);

    int updateByExampleSelective(@Param("record") CallFailCustomer record, @Param("example") CallFailCustomerExample example);

    int updateByExample(@Param("record") CallFailCustomer record, @Param("example") CallFailCustomerExample example);

    int updateByPrimaryKeySelective(CallFailCustomer record);

    int updateByPrimaryKey(CallFailCustomer record);
}