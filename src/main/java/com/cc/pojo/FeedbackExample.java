package com.cc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedbackExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andFeedbackIdIsNull() {
            addCriterion("feedback_id is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIsNotNull() {
            addCriterion("feedback_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdEqualTo(String value) {
            addCriterion("feedback_id =", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotEqualTo(String value) {
            addCriterion("feedback_id <>", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThan(String value) {
            addCriterion("feedback_id >", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_id >=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThan(String value) {
            addCriterion("feedback_id <", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThanOrEqualTo(String value) {
            addCriterion("feedback_id <=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLike(String value) {
            addCriterion("feedback_id like", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotLike(String value) {
            addCriterion("feedback_id not like", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIn(List<String> values) {
            addCriterion("feedback_id in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotIn(List<String> values) {
            addCriterion("feedback_id not in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdBetween(String value1, String value2) {
            addCriterion("feedback_id between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotBetween(String value1, String value2) {
            addCriterion("feedback_id not between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeIsNull() {
            addCriterion("fail_reason_type is null");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeIsNotNull() {
            addCriterion("fail_reason_type is not null");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeEqualTo(String value) {
            addCriterion("fail_reason_type =", value, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeNotEqualTo(String value) {
            addCriterion("fail_reason_type <>", value, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeGreaterThan(String value) {
            addCriterion("fail_reason_type >", value, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fail_reason_type >=", value, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeLessThan(String value) {
            addCriterion("fail_reason_type <", value, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeLessThanOrEqualTo(String value) {
            addCriterion("fail_reason_type <=", value, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeLike(String value) {
            addCriterion("fail_reason_type like", value, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeNotLike(String value) {
            addCriterion("fail_reason_type not like", value, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeIn(List<String> values) {
            addCriterion("fail_reason_type in", values, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeNotIn(List<String> values) {
            addCriterion("fail_reason_type not in", values, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeBetween(String value1, String value2) {
            addCriterion("fail_reason_type between", value1, value2, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andFailReasonTypeNotBetween(String value1, String value2) {
            addCriterion("fail_reason_type not between", value1, value2, "failReasonType");
            return (Criteria) this;
        }

        public Criteria andSalesDateIsNull() {
            addCriterion("sales_date is null");
            return (Criteria) this;
        }

        public Criteria andSalesDateIsNotNull() {
            addCriterion("sales_date is not null");
            return (Criteria) this;
        }

        public Criteria andSalesDateEqualTo(Date value) {
            addCriterionForJDBCDate("sales_date =", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sales_date <>", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sales_date >", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sales_date >=", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateLessThan(Date value) {
            addCriterionForJDBCDate("sales_date <", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sales_date <=", value, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateIn(List<Date> values) {
            addCriterionForJDBCDate("sales_date in", values, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sales_date not in", values, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sales_date between", value1, value2, "salesDate");
            return (Criteria) this;
        }

        public Criteria andSalesDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sales_date not between", value1, value2, "salesDate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateIsNull() {
            addCriterion("last_purchasedate is null");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateIsNotNull() {
            addCriterion("last_purchasedate is not null");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateEqualTo(Date value) {
            addCriterionForJDBCDate("last_purchasedate =", value, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_purchasedate <>", value, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_purchasedate >", value, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_purchasedate >=", value, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateLessThan(Date value) {
            addCriterionForJDBCDate("last_purchasedate <", value, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_purchasedate <=", value, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateIn(List<Date> values) {
            addCriterionForJDBCDate("last_purchasedate in", values, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_purchasedate not in", values, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_purchasedate between", value1, value2, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andLastPurchasedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_purchasedate not between", value1, value2, "lastPurchasedate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}