package com.cc.service;

import com.cc.pojo.CustomerStatusNotZero;

/**
 * Created by cc on 2017/4/14.
 */

public interface CustomerStatusNotZeroService {

    void deleteTable();
    void updateCustomerStatus(Integer status,String customer_id);
    void insert(CustomerStatusNotZero customerStatus);


}
