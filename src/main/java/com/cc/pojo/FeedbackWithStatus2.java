package com.cc.pojo;

import java.util.Date;

/**
 * Created by cc on 2017/4/5.
 */
public class FeedbackWithStatus2 {

    private String userId;

    private String customerId;

    private String failReasonType;

    private String salesDate;

    private String lastPurchasedate;

    public FeedbackWithStatus2() {
    }

    public FeedbackWithStatus2(String userId, String customerId, String failReasonType,String lastPurchasedate, String remark, Integer status) {
        this.userId = userId;
        this.customerId = customerId;
        this.failReasonType = failReasonType;
        this.salesDate = salesDate;
        this.lastPurchasedate = lastPurchasedate;
        this.remark = remark;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFailReasonType() {
        return failReasonType;
    }

    public void setFailReasonType(String failReasonType) {
        this.failReasonType = failReasonType;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public String getLastPurchasedate() {
        return lastPurchasedate;
    }

    public void setLastPurchasedate(String lastPurchasedate) {
        this.lastPurchasedate = lastPurchasedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private String remark;
    private Integer status;
}
