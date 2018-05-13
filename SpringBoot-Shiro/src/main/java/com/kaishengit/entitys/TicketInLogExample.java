package com.kaishengit.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketInLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TicketInLogExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStartNumIsNull() {
            addCriterion("start_num is null");
            return (Criteria) this;
        }

        public Criteria andStartNumIsNotNull() {
            addCriterion("start_num is not null");
            return (Criteria) this;
        }

        public Criteria andStartNumEqualTo(String value) {
            addCriterion("start_num =", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotEqualTo(String value) {
            addCriterion("start_num <>", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumGreaterThan(String value) {
            addCriterion("start_num >", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumGreaterThanOrEqualTo(String value) {
            addCriterion("start_num >=", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumLessThan(String value) {
            addCriterion("start_num <", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumLessThanOrEqualTo(String value) {
            addCriterion("start_num <=", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumLike(String value) {
            addCriterion("start_num like", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotLike(String value) {
            addCriterion("start_num not like", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumIn(List<String> values) {
            addCriterion("start_num in", values, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotIn(List<String> values) {
            addCriterion("start_num not in", values, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumBetween(String value1, String value2) {
            addCriterion("start_num between", value1, value2, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotBetween(String value1, String value2) {
            addCriterion("start_num not between", value1, value2, "startNum");
            return (Criteria) this;
        }

        public Criteria andEndNumIsNull() {
            addCriterion("end_num is null");
            return (Criteria) this;
        }

        public Criteria andEndNumIsNotNull() {
            addCriterion("end_num is not null");
            return (Criteria) this;
        }

        public Criteria andEndNumEqualTo(String value) {
            addCriterion("end_num =", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumNotEqualTo(String value) {
            addCriterion("end_num <>", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumGreaterThan(String value) {
            addCriterion("end_num >", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumGreaterThanOrEqualTo(String value) {
            addCriterion("end_num >=", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumLessThan(String value) {
            addCriterion("end_num <", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumLessThanOrEqualTo(String value) {
            addCriterion("end_num <=", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumLike(String value) {
            addCriterion("end_num like", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumNotLike(String value) {
            addCriterion("end_num not like", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumIn(List<String> values) {
            addCriterion("end_num in", values, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumNotIn(List<String> values) {
            addCriterion("end_num not in", values, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumBetween(String value1, String value2) {
            addCriterion("end_num between", value1, value2, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumNotBetween(String value1, String value2) {
            addCriterion("end_num not between", value1, value2, "endNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andInAccountNameIsNull() {
            addCriterion("in_account_name is null");
            return (Criteria) this;
        }

        public Criteria andInAccountNameIsNotNull() {
            addCriterion("in_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andInAccountNameEqualTo(String value) {
            addCriterion("in_account_name =", value, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameNotEqualTo(String value) {
            addCriterion("in_account_name <>", value, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameGreaterThan(String value) {
            addCriterion("in_account_name >", value, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("in_account_name >=", value, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameLessThan(String value) {
            addCriterion("in_account_name <", value, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameLessThanOrEqualTo(String value) {
            addCriterion("in_account_name <=", value, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameLike(String value) {
            addCriterion("in_account_name like", value, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameNotLike(String value) {
            addCriterion("in_account_name not like", value, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameIn(List<String> values) {
            addCriterion("in_account_name in", values, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameNotIn(List<String> values) {
            addCriterion("in_account_name not in", values, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameBetween(String value1, String value2) {
            addCriterion("in_account_name between", value1, value2, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andInAccountNameNotBetween(String value1, String value2) {
            addCriterion("in_account_name not between", value1, value2, "inAccountName");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    /**
     */
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