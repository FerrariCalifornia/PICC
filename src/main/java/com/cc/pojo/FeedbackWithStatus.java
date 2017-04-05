package com.cc.pojo;

import java.util.Date;

/**
 * Created by cc on 2017/4/5.
 */
public class FeedbackWithStatus {
    private String userId;

    private String customerId;

    private String failReasonType;

    private Date salesDate;

    private Date lastPurchasedate;

    private String remark;
    private Integer status;

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

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public Date getLastPurchasedate() {
        return lastPurchasedate;
    }

    public void setLastPurchasedate(Date lastPurchasedate) {
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

    @Override
    public String toString() {
        return "FeedbackWithStatus{" +
                "userId='" + userId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", failReasonType='" + failReasonType + '\'' +
                ", salesDate=" + salesDate +
                ", lastPurchasedate=" + lastPurchasedate +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                '}';
    }
}
