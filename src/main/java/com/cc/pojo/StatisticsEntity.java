package com.cc.pojo;

import sun.jvm.hotspot.jdi.IntegerTypeImpl;

/**
 * Created by cc on 2017/4/5.
 */
public class StatisticsEntity {
    private Integer visitedCustomers;
    private Integer totalCustomers;
    private Integer successCustomers;
    private String successRate;

    public StatisticsEntity() {
    }

    public StatisticsEntity(Integer visitedCustomers, Integer totalCustomers, Integer asuccessCustomers, String successRate) {
        this.visitedCustomers = visitedCustomers;
        this.totalCustomers = totalCustomers;
        this.successCustomers = asuccessCustomers;
        this.successRate = successRate;
    }

    public Integer getVisitedCustomers() {
        return visitedCustomers;
    }

    public void setVisitedCustomers(Integer visitedCustomers) {
        this.visitedCustomers = visitedCustomers;
    }

    public Integer getTotalCustomers() {
        return totalCustomers;
    }

    public void setTotalCustomers(Integer totalCustomers) {
        this.totalCustomers = totalCustomers;
    }

    public Integer getAsuccessCustomers() {
        return successCustomers;
    }

    public void setAsuccessCustomers(Integer asuccessCustomers) {
        this.successCustomers = asuccessCustomers;
    }

    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }
}
