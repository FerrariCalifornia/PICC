package com.cc.service;

import com.cc.pojo.CustomerInfo;
import com.cc.pojo.Page;
import com.cc.pojo.UserInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by cc on 2017/3/9.
 */
public interface CustomerInfoService {
    List<CustomerInfo> getAllCustomerInfo(Page page);
    List<CustomerInfo> getCustomer20();
    List<CustomerInfo> getCustomerListFromStatusTable(String user_id);
    CustomerInfo getOneCustomer(Integer id);
    PageInfo<CustomerInfo> queryByPage(Integer pageNo, Integer pageSize);
    void insertCustomerInfo(CustomerInfo customerInfo);
}
