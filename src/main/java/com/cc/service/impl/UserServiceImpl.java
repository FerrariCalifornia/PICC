package com.cc.service.impl;

import com.cc.dao.CustomerInfoMapper;
import com.cc.dao.TaskMapper;
import com.cc.dao.UserInfoMapper;
import com.cc.pojo.*;
import com.cc.service.CustomerStatusNotZeroService;
import com.cc.service.CustomerStatusService;
import com.cc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cc on 2017/3/17.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserInfoMapper userInfoMapper;
    @Resource
    private CustomerInfoMapper customerInfoMapper;
    @Resource
    private CustomerStatusService customerStatusService;
    @Resource
    private CustomerStatusNotZeroService customerStatusNotZeroService;
    @Resource
    private TaskMapper taskMapper;



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

    @Override
    public UserInfo findUserByUsername(String username) {
        return userInfoMapper.findUserByUsername(username);
    }

    @Override
    public void assign_task() {

        Task task =taskMapper.findTask();
        int task_num =task.getTaskNum();
        List<UserInfo> normalUserList= userInfoMapper.findNormalUser();
        Integer task_amount=task_num*normalUserList.size();
        List<CustomerInfo> customerInfoList = customerInfoMapper.getCustomerList(task_amount);
        int count = 0;
        int k = 1;
        for (CustomerInfo c:customerInfoList) {
            if (normalUserList.size()!=0){
                if (normalUserList.size()!=0){
                    if (count<k*task_num){
                        String user_id =normalUserList.get(k-1).getUserId();
                        CustomerStatus customerStatus = new CustomerStatus();
                        customerStatus.setStatus(c.getStatus());
                        customerStatus.setUserId(user_id);
                        customerStatus.setCustomerId(c.getCustomerId());
                        customerStatusService.insert(customerStatus);
                    }else {
                        k++;
                        String user_id =normalUserList.get(k-1).getUserId();
                        CustomerStatus customerStatus = new CustomerStatus();
                        customerStatus.setStatus(c.getStatus());
                        customerStatus.setUserId(user_id);
                        customerStatus.setCustomerId(c.getCustomerId());
                        customerStatusService.insert(customerStatus);
                    }
                }
            }
            count++;
        }

    }

    @Override
    public void assign_task_by_random() {
        Task task =taskMapper.findTask();
        int task_num =task.getTaskNum();
        List<UserInfo> normalUserList= userInfoMapper.findNormalUser();
        Integer task_amount=task_num*normalUserList.size();
        List<CustomerInfo> customerInfoList = customerInfoMapper.getCustomerListByRandom(task_amount);
        int count = 0;
        int k = 1;
        for (CustomerInfo c:customerInfoList) {
            if (normalUserList.size()!=0){
                    if (normalUserList.size()!=0){
                        if (count<k*task_num){
                            String user_id =normalUserList.get(k-1).getUserId();
                            CustomerStatus customerStatus = new CustomerStatus();
                            customerStatus.setStatus(c.getStatus());
                            customerStatus.setUserId(user_id);
                            customerStatus.setCustomerId(c.getCustomerId());
                            customerStatusService.insert(customerStatus);
                        }else {
                            k++;
                            String user_id =normalUserList.get(k-1).getUserId();
                            CustomerStatus customerStatus = new CustomerStatus();
                            customerStatus.setStatus(c.getStatus());
                            customerStatus.setUserId(user_id);
                            customerStatus.setCustomerId(c.getCustomerId());
                            customerStatusService.insert(customerStatus);
                        }
                    }
            }
            count++;
        }
    }

    /**
     * 顺序分配待沟通客户
     */
    @Override
    public void assign_follow_up_task() {
        Task task =taskMapper.findTask();
        int task_num =task.getFollowTaskNum();
        List<UserInfo> normalUserList= userInfoMapper.findNormalUser();
        Integer task_amount=task_num*normalUserList.size();
        List<CustomerInfo> customerInfoList = customerInfoMapper.getCustomerListNeq0(task_amount);
        int count = 0;
        int k = 1;
        for (CustomerInfo c:customerInfoList) {
            if (normalUserList.size()!=0){
                if (normalUserList.size()!=0){
                    if (count<k*task_num){
                        System.err.println("k="+k*task_num);
                        System.err.println("count="+count);
                        String user_id =normalUserList.get(k-1).getUserId();
                        CustomerStatusNotZero customerStatus = new CustomerStatusNotZero();
                        customerStatus.setStatus(c.getStatus());
                        customerStatus.setUserId(user_id);
                        customerStatus.setCustomerId(c.getCustomerId());
                        customerStatusNotZeroService.insert(customerStatus);
                    }else {
                        System.err.println("k==========================================");
                        k++;
                        System.err.println("k="+k*task_num);
                        System.err.println("count="+count);
                        String user_id =normalUserList.get(k-1).getUserId();
                        CustomerStatusNotZero customerStatus = new CustomerStatusNotZero();
                        customerStatus.setStatus(c.getStatus());
                        customerStatus.setUserId(user_id);
                        customerStatus.setCustomerId(c.getCustomerId());
                        customerStatusNotZeroService.insert(customerStatus);
                    }
                }
            }
            count++;
        }

    }
    /**
     * 随机分配待沟通客户
     */
    @Override
    public void assign_follow_up_task_by_random() {
        Task task =taskMapper.findTask();
        int task_num =task.getFollowTaskNum();
        List<UserInfo> normalUserList= userInfoMapper.findNormalUser();
        Integer task_amount=task_num*normalUserList.size();
        List<CustomerInfo> customerInfoList = customerInfoMapper.getCustomerListNeq0ByRandom(task_amount);
        int count = 0;
        int k = 1;
        for (CustomerInfo c:customerInfoList) {
            if (normalUserList.size()!=0){
                if (normalUserList.size()!=0){
                    if (count<k*task_num){
                        System.err.println("k="+k);
                        System.err.println("count="+count);
                        String user_id =normalUserList.get(k-1).getUserId();
                        CustomerStatusNotZero customerStatus = new CustomerStatusNotZero();
                        customerStatus.setStatus(c.getStatus());
                        customerStatus.setUserId(user_id);
                        customerStatus.setCustomerId(c.getCustomerId());
                        customerStatusNotZeroService.insert(customerStatus);
                    }else {
                        System.err.println("==========================================");
                        k++;
                        System.err.println("k="+k);
                        System.err.println("count="+count);
                        String user_id =normalUserList.get(k-1).getUserId();
                        CustomerStatusNotZero customerStatus = new CustomerStatusNotZero();
                        customerStatus.setStatus(c.getStatus());
                        customerStatus.setUserId(user_id);
                        customerStatus.setCustomerId(c.getCustomerId());
                        customerStatusNotZeroService.insert(customerStatus);
                    }
                }
            }
            count++;
        }
    }
}
