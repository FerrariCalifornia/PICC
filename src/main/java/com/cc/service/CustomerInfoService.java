package com.cc.service;

import com.cc.pojo.CustomerInfo;

/**
 * Created by cc on 2017/3/9.
 */
public interface CustomerInfoService {
    CustomerInfo getAllCustomerInfo();
    void insertCustomerInfo(CustomerInfo customerInfo);
}
