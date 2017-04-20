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
    //分配任务。
    void assign_task();
    void assign_task_by_random();
    //分配带跟进任务。
    void assign_follow_up_task();
    void assign_follow_up_task_by_random();
}
