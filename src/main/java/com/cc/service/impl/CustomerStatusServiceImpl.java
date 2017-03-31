package com.cc.service.impl;

import com.cc.dao.CustomerStatusMapper;
import com.cc.pojo.CustomerStatus;
import com.cc.service.CustomerStatusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cc on 2017/3/30.
 */
@Service("customerStatusService")
public class CustomerStatusServiceImpl implements CustomerStatusService {
    @Resource
    private  CustomerStatusMapper customerStatusMapper;
    @Override
    public void deleteTable() {
        customerStatusMapper.deleteTable();
    }

    @Override
    public void insert(CustomerStatus customerStatus) {
        customerStatusMapper.insert(customerStatus);
    }
}
