package com.cc.service;

import com.cc.pojo.CustomerStatus;

/**
 * Created by cc on 2017/3/30.
 */
public interface CustomerStatusService {
    void deleteTable();
    void updateCustomerStatus(Integer status,String customer_id);
    void insert(CustomerStatus customerStatus);
}
