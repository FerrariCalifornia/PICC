package com.cc.service.impl;

import com.cc.dao.UserInfoMapper;
import com.cc.dao.UserRoleMapper;
import com.cc.pojo.UserInfo;
import com.cc.pojo.UserRole;
import com.cc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cc on 2017/3/1.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public void signIn(UserInfo user) {
        userInfoMapper.insert(user);

    }

    @Override
    public UserInfo findUserByUsername(String username) {
        return userInfoMapper.findUserByUsername(username);
    }

    @Override
    public String findUserType(String username) {
        return userInfoMapper.findRoles(username);
    }
}
