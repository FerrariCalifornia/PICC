package com.cc.pojo;

public class Task {
    private Integer id;

    private Integer taskNum;

    private Integer taskType;

    private Integer followTaskNum;

    private Integer followTaskType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Integer getFollowTaskNum() {
        return followTaskNum;
    }

    public void setFollowTaskNum(Integer followTaskNum) {
        this.followTaskNum = followTaskNum;
    }

    public Integer getFollowTaskType() {
        return followTaskType;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskNum=" + taskNum +
                ", taskType=" + taskType +
                ", followTaskNum=" + followTaskNum +
                ", followTaskType=" + followTaskType +
                '}';
    }

    public void setFollowTaskType(Integer followTaskType) {
        this.followTaskType = followTaskType;
    }
}