package com.cc.timeTask;

import com.cc.dao.CustomerInfoMapper;
import com.cc.dao.CustomerStatusMapper;
import com.cc.dao.TaskMapper;
import com.cc.pojo.Task;
import com.cc.service.CustomerInfoService;
import com.cc.service.CustomerStatusNotZeroService;
import com.cc.service.CustomerStatusService;
import com.cc.service.UserService;
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
    @Resource
    private UserService userService;
    @Resource
    private CustomerStatusNotZeroService customerStatusNotZeroService;
    @Resource
    private TaskMapper taskMapper;


    @Scheduled(cron="0 0 2 * * ?")   //每天凌晨两点执行一次
//    @Scheduled(cron="0/9 * * * * ?")   //

    @Override
    public void clear_customer_status_table() {
        customerStatusService.deleteTable();
        customerStatusNotZeroService.deleteTable();
        System.out.println("删除表");
    }

    @Override
    public void assign_task() {
        Task task = taskMapper.findTask();

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
    }
}
