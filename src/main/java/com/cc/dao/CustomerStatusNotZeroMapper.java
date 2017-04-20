package com.cc.dao;

import com.cc.pojo.CustomerStatusNotZero;
import com.cc.pojo.CustomerStatusNotZeroExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerStatusNotZeroMapper {
    int countByExample(CustomerStatusNotZeroExample example);

    int deleteByExample(CustomerStatusNotZeroExample example);

    int deleteByPrimaryKey(String customerId);

    int insert(CustomerStatusNotZero record);
    void updateCustomerStatus(Integer status, String customer_id);
    void deleteTable();
    int insertSelective(CustomerStatusNotZero record);

    List<CustomerStatusNotZero> selectByExample(CustomerStatusNotZeroExample example);

    CustomerStatusNotZero selectByPrimaryKey(String customerId);

    int updateByExampleSelective(@Param("record") CustomerStatusNotZero record, @Param("example") CustomerStatusNotZeroExample example);

    int updateByExample(@Param("record") CustomerStatusNotZero record, @Param("example") CustomerStatusNotZeroExample example);

    int updateByPrimaryKeySelective(CustomerStatusNotZero record);

    int updateByPrimaryKey(CustomerStatusNotZero record);
}