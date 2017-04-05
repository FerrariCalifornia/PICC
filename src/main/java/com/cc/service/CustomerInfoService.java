package com.cc.service;

import com.cc.pojo.CustomerInfo;
import com.cc.pojo.Page;
import com.cc.pojo.UserInfo;
import com.cc.pojo.UseridAndPageInfo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by cc on 2017/3/9.
 */
public interface CustomerInfoService {
    List<CustomerInfo> getAllCustomerInfo(Page page);
    List<CustomerInfo> getAllCustomerList();
    List<CustomerInfo> getCustomer20();
    List<CustomerInfo> getAllCustomerListFromStatusTable(String user_id);
    List<CustomerInfo> getCustomerListFromStatusTable(UseridAndPageInfo useridAndPageInfo);
    CustomerInfo getOneCustomer(Integer id);
    PageInfo<CustomerInfo> queryByPage(Integer pageNo, Integer pageSize);
    void insertCustomerInfo(CustomerInfo customerInfo);
    void updateCustomerStatus(Integer status,String cusomer_id);
}
