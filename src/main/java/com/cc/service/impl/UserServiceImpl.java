package com.cc.service.impl;

import com.cc.dao.UserInfoMapper;
import com.cc.dao.UserRoleMapper;
import com.cc.pojo.UserInfo;
import com.cc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cc on 2017/3/17.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getUserList() {
        return userInfoMapper.getUserList();
    }

    @Override
    public void addUser(UserInfo userInfo) {
            userInfoMapper.insert(userInfo);
    }

    @Override
    public void deleteUser(UserInfo userInfo) {
            userInfoMapper.deleteByPrimaryKey(userInfo.getUserId());
    }
}
