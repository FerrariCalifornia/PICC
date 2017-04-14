package com.cc.timeTask;

import com.cc.dao.TaskMapper;
import com.cc.pojo.CustomerStatusNotZero;
import com.cc.pojo.Task;
import com.cc.service.CustomerStatusNotZeroService;
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
    @Resource
    private CustomerStatusNotZeroService customerStatusNotZeroService;

    @Resource
    private TaskMapper taskMapper;


    public void init() throws Exception {
        customerStatusService.deleteTable();
        customerStatusNotZeroService.deleteTable();
//        userService.assign_task();
        Task task = taskMapper.findTask();
        System.err.printf(task.toString());
        if (task.getTaskType()==1){
            userService.assign_task_by_random();
        }else if (task.getTaskType()==0){
            userService.assign_task();
        }

        if (task.getFollowTaskType()==1){
            userService.assign_follow_up_task_by_random();
        }else if (task.getFollowTaskType()==0){
            userService.assign_follow_up_task();
        }
        System.out.println("initialize customer status table..........");
    }


}
