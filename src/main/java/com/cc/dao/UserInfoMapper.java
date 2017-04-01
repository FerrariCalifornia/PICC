package com.cc.dao;

import com.cc.pojo.UserInfo;
import com.cc.pojo.UserInfoExample;

import java.util.List;

import com.cc.pojo.UserRole;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);
    List<UserInfo> getUserList();
    List<UserInfo> findNormalUser();
    UserInfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);
    UserInfo findUserByUsername(String username);
    int updateByPrimaryKey(UserInfo record);
    String findRoles(String username);
}