package com.cc.service;

import com.cc.pojo.UserInfo;
import com.cc.pojo.UserRole;

/**
 * Created by cc on 2017/3/1.
 */
public interface LoginService {
    void signIn(UserInfo user);
    UserInfo findUserByUsername(String username);
    String findUserType(String username);
}
