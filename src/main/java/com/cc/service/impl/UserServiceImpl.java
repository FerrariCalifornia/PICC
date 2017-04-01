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
}
