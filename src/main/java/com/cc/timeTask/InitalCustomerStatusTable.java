package com.cc.timeTask;

import com.cc.service.CustomerStatusService;
import com.cc.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

/**
 * Created by cc on 2017/4/1.
 */

@Component
public class InitalCustomerStatusTable {
    @Resource
    private UserService userService;
    @Resource
    private CustomerStatusService customerStatusService;
    public void init() throws Exception {
        customerStatusService.deleteTable();
//        userService.assign_task();
        userService.assign_task_by_random();
        System.out.println("initialize customer status table..........");
    }


}
