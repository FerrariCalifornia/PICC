package com.cc.dao;

import com.cc.pojo.UnexpiredInsurance;
import com.cc.pojo.UnexpiredInsuranceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnexpiredInsuranceMapper {
    int countByExample(UnexpiredInsuranceExample example);

    int deleteByExample(UnexpiredInsuranceExample example);

    int deleteByPrimaryKey(String customerId);

    int insert(UnexpiredInsurance record);

    int insertSelective(UnexpiredInsurance record);

    List<UnexpiredInsurance> selectByExample(UnexpiredInsuranceExample example);

    UnexpiredInsurance selectByPrimaryKey(String customerId);

    int updateByExampleSelective(@Param("record") UnexpiredInsurance record, @Param("example") UnexpiredInsuranceExample example);

    int updateByExample(@Param("record") UnexpiredInsurance record, @Param("example") UnexpiredInsuranceExample example);

    int updateByPrimaryKeySelective(UnexpiredInsurance record);

    int updateByPrimaryKey(UnexpiredInsurance record);
}