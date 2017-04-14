package com.cc.service.impl;

import com.cc.dao.CustomerStatusNotZeroMapper;
import com.cc.pojo.CustomerStatusNotZero;
import com.cc.service.CustomerStatusNotZeroService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cc on 2017/4/14.
 */

@Service("customerInfoNotZeroService")
public class CustomerStatusNotZeroServiceImpl implements CustomerStatusNotZeroService {

    @Resource
    private CustomerStatusNotZeroMapper customerStatusNotZeroMapper;
    @Override
    public void deleteTable() {
        customerStatusNotZeroMapper.deleteTable();
    }

    @Override
    public void updateCustomerStatus(Integer status, String customer_id) {
        customerStatusNotZeroMapper.updateCustomerStatus(status,customer_id);
    }

    @Override
    public void insert(CustomerStatusNotZero customerStatus) {
        customerStatusNotZeroMapper.insert(customerStatus);
    }
}
