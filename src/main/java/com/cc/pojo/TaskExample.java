package com.cc.pojo;

import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskNumIsNull() {
            addCriterion("task_num is null");
            return (Criteria) this;
        }

        public Criteria andTaskNumIsNotNull() {
            addCriterion("task_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNumEqualTo(Integer value) {
            addCriterion("task_num =", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumNotEqualTo(Integer value) {
            addCriterion("task_num <>", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumGreaterThan(Integer value) {
            addCriterion("task_num >", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_num >=", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumLessThan(Integer value) {
            addCriterion("task_num <", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumLessThanOrEqualTo(Integer value) {
            addCriterion("task_num <=", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumIn(List<Integer> values) {
            addCriterion("task_num in", values, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumNotIn(List<Integer> values) {
            addCriterion("task_num not in", values, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumBetween(Integer value1, Integer value2) {
            addCriterion("task_num between", value1, value2, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumNotBetween(Integer value1, Integer value2) {
            addCriterion("task_num not between", value1, value2, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(Integer value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(Integer value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(Integer value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(Integer value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(Integer value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<Integer> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<Integer> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(Integer value1, Integer value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumIsNull() {
            addCriterion("follow_task_num is null");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumIsNotNull() {
            addCriterion("follow_task_num is not null");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumEqualTo(Integer value) {
            addCriterion("follow_task_num =", value, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumNotEqualTo(Integer value) {
            addCriterion("follow_task_num <>", value, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumGreaterThan(Integer value) {
            addCriterion("follow_task_num >", value, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_task_num >=", value, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumLessThan(Integer value) {
            addCriterion("follow_task_num <", value, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumLessThanOrEqualTo(Integer value) {
            addCriterion("follow_task_num <=", value, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumIn(List<Integer> values) {
            addCriterion("follow_task_num in", values, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumNotIn(List<Integer> values) {
            addCriterion("follow_task_num not in", values, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumBetween(Integer value1, Integer value2) {
            addCriterion("follow_task_num between", value1, value2, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskNumNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_task_num not between", value1, value2, "followTaskNum");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeIsNull() {
            addCriterion("follow_task_type is null");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeIsNotNull() {
            addCriterion("follow_task_type is not null");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeEqualTo(Integer value) {
            addCriterion("follow_task_type =", value, "followTaskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeNotEqualTo(Integer value) {
            addCriterion("follow_task_type <>", value, "followTaskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeGreaterThan(Integer value) {
            addCriterion("follow_task_type >", value, "followTaskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_task_type >=", value, "followTaskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeLessThan(Integer value) {
            addCriterion("follow_task_type <", value, "followTaskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeLessThanOrEqualTo(Integer value) {
            addCriterion("follow_task_type <=", value, "followTaskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeIn(List<Integer> values) {
            addCriterion("follow_task_type in", values, "followTaskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeNotIn(List<Integer> values) {
            addCriterion("follow_task_type not in", values, "followTaskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeBetween(Integer value1, Integer value2) {
            addCriterion("follow_task_type between", value1, value2, "followTaskType");
            return (Criteria) this;
        }

        public Criteria andFollowTaskTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_task_type not between", value1, value2, "followTaskType");
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