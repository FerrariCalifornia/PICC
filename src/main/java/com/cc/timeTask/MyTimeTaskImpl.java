package com.cc.timeTask;

import com.cc.dao.CustomerInfoMapper;
import com.cc.dao.CustomerStatusMapper;
import com.cc.service.CustomerInfoService;
import com.cc.service.CustomerStatusService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by cc on 2017/3/30.
 */
@Component
public class MyTimeTaskImpl implements MyTimeTask {
    @Resource
    private CustomerStatusService customerStatusService;



    @Scheduled(cron="0 0 2 * * ?")   //每天凌晨两点执行一次
//    @Scheduled(cron="0/9 * * * * ?")   //

    @Override
    public void clear_customer_status_table() {
        customerStatusService.deleteTable();
        System.out.println("删除表");
    }
}
