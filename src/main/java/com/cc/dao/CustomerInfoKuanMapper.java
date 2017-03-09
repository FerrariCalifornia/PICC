package com.cc.dao;

import com.cc.pojo.CustomerInfoKuan;
import com.cc.pojo.CustomerInfoKuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerInfoKuanMapper {
    int countByExample(CustomerInfoKuanExample example);

    int deleteByExample(CustomerInfoKuanExample example);

    int deleteByPrimaryKey(String customerId);

    int insert(CustomerInfoKuan record);

    int insertSelective(CustomerInfoKuan record);

    List<CustomerInfoKuan> selectByExample(CustomerInfoKuanExample example);

    CustomerInfoKuan selectByPrimaryKey(String customerId);

    int updateByExampleSelective(@Param("record") CustomerInfoKuan record, @Param("example") CustomerInfoKuanExample example);

    int updateByExample(@Param("record") CustomerInfoKuan record, @Param("example") CustomerInfoKuanExample example);

    int updateByPrimaryKeySelective(CustomerInfoKuan record);

    int updateByPrimaryKey(CustomerInfoKuan record);
}