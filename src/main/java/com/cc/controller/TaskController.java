package com.cc.controller;

import com.cc.dao.TaskMapper;
import com.cc.pojo.Task;
import com.cc.service.UserService;
import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by cc on 2017/4/14.
 */

@Controller
public class TaskController {


    @Resource
    private TaskMapper taskMapper;


    /**
     * 查看任务
     * @return
     */
    @RequestMapping(value = "/findTask", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String findTask() {

        Gson gson = new Gson();
        String json = gson.toJson(taskMapper.findTask());
        return json;
    }


    /**
     * 更新任务
     * @param task
     * @return
     */
    @RequestMapping(value = "/updateTask", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String updateTask(Task task) {

        taskMapper.updateTask(task);
        return "success";
    }
}
