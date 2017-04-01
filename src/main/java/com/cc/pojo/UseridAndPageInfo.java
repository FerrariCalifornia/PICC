package com.cc.pojo;

import com.cc.timeTask.InitalCustomerStatusTable;

/**
 * Created by cc on 2017/4/1.
 */
public class UseridAndPageInfo {
    private String user_id;
    private Integer page_num;
    private Integer page_size;

    public UseridAndPageInfo() {
    }

    public UseridAndPageInfo(String user_id, Integer page_num, Integer page_size) {
        this.user_id = user_id;
        this.page_num = page_num;
        this.page_size = page_size;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getPage_num() {
        return page_num;
    }

    public void setPage_num(Integer page_num) {
        this.page_num = page_num;
    }

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }
}
