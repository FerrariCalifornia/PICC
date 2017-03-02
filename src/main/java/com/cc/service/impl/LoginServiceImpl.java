package com.cc.service.impl;

import com.cc.dao.UserRoleMapper;
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
    private UserRoleMapper userRoleMapper;


    @Override
    public void signIn(UserRole user) {
        userRoleMapper.insert(user);

    }

    @Override
    public UserRole findUserByUsername(String username) {
        return userRoleMapper.findUserByUsername(username);
    }
}
