package com.cc.service;

import com.cc.pojo.CustomerInfo;

import java.util.List;

/**
 * Created by cc on 2017/3/9.
 */
public interface CustomerInfoService {
    List<CustomerInfo> getAllCustomerInfo();
    void insertCustomerInfo(CustomerInfo customerInfo);
}
