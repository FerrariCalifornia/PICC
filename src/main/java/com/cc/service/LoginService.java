package com.cc.service;

import com.cc.pojo.UserRole;

/**
 * Created by cc on 2017/3/1.
 */
public interface LoginService {
    void signIn(UserRole user);
    UserRole findUserByUsername(String username);
}
