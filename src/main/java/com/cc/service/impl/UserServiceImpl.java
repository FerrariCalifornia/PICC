package com.cc.service.impl;

import com.cc.dao.CustomerInfoMapper;
import com.cc.dao.UserInfoMapper;
import com.cc.pojo.CustomerInfo;
import com.cc.pojo.CustomerStatus;
import com.cc.pojo.Page;
import com.cc.pojo.UserInfo;
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
        List<UserInfo> normalUserList= userInfoMapper.findNormalUser();
        for (int i = 0; i <normalUserList.size() ; i++) {
            String user_id =normalUserList.get(i).getUserId();
            Page page= new Page();
            //每人分配三十个客户，
            page.setPageNum(i*30);
            page.setPageSize(30);
            List<CustomerInfo> customerInfoList = customerInfoMapper.getCustomerList(page);
            for (CustomerInfo c:customerInfoList
                 ) {
                CustomerStatus customerStatus = new CustomerStatus();
                customerStatus.setStatus(c.getStatus());
                customerStatus.setUserId(user_id);
                customerStatus.setCustomerId(c.getCustomerId());
                customerStatusService.insert(customerStatus);
            }
        }
    }

    @Override
    public void assign_task_by_random() {
        int task_num =30;
        List<UserInfo> normalUserList= userInfoMapper.findNormalUser();
        Integer task_amount=task_num*normalUserList.size();
        List<CustomerInfo> customerInfoList = customerInfoMapper.getCustomerListByRandom(task_amount);
        int count = 0;
        int k = 1;
        for (CustomerInfo c:customerInfoList) {
            if (normalUserList.size()!=0){
                    if (normalUserList.size()!=0){
                        if (count<k*task_num){
                            System.err.println("k="+k*task_num);
                            System.err.println("count="+count);
                            String user_id =normalUserList.get(k-1).getUserId();
                            CustomerStatus customerStatus = new CustomerStatus();
                            customerStatus.setStatus(c.getStatus());
                            customerStatus.setUserId(user_id);
                            customerStatus.setCustomerId(c.getCustomerId());
                            customerStatusService.insert(customerStatus);
                        }else {
                            System.err.println("k===================================================");
                            k++;
                        }
                    }
            }
            count++;
        }
    }

    @Override
    public void assign_follow_up_task() {

    }

    @Override
    public void assign_follow_up_task_by_random() {

    }
}
