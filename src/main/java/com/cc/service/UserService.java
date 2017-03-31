package com.cc.service;

import com.cc.pojo.UserInfo;

import java.util.List;

/**
 * Created by cc on 2017/3/10.
 */
public interface UserService {
    List<UserInfo> getUserList();
    void addUser(UserInfo userInfo);
    void deleteUser(UserInfo userInfo);
    UserInfo findUserByUsername(String username);
}
