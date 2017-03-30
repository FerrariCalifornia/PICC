package com.cc.dao;

import com.cc.pojo.CustomerStatus;
import com.cc.pojo.CustomerStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerStatusMapper {
    int countByExample(CustomerStatusExample example);

    int deleteByExample(CustomerStatusExample example);

    int insert(CustomerStatus record);

    int insertSelective(CustomerStatus record);
    void deleteTable();

    List<CustomerStatus> selectByExample(CustomerStatusExample example);

    int updateByExampleSelective(@Param("record") CustomerStatus record, @Param("example") CustomerStatusExample example);

    int updateByExample(@Param("record") CustomerStatus record, @Param("example") CustomerStatusExample example);
}