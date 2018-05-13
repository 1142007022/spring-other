package com.kaishengit.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PowerExample() {
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

        public Criteria andPowerNameIsNull() {
            addCriterion("power_name is null");
            return (Criteria) this;
        }

        public Criteria andPowerNameIsNotNull() {
            addCriterion("power_name is not null");
            return (Criteria) this;
        }

        public Criteria andPowerNameEqualTo(String value) {
            addCriterion("power_name =", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotEqualTo(String value) {
            addCriterion("power_name <>", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThan(String value) {
            addCriterion("power_name >", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("power_name >=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThan(String value) {
            addCriterion("power_name <", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLessThanOrEqualTo(String value) {
            addCriterion("power_name <=", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameLike(String value) {
            addCriterion("power_name like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotLike(String value) {
            addCriterion("power_name not like", value, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameIn(List<String> values) {
            addCriterion("power_name in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotIn(List<String> values) {
            addCriterion("power_name not in", values, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameBetween(String value1, String value2) {
            addCriterion("power_name between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerNameNotBetween(String value1, String value2) {
            addCriterion("power_name not between", value1, value2, "powerName");
            return (Criteria) this;
        }

        public Criteria andPowerTypeIsNull() {
            addCriterion("power_type is null");
            return (Criteria) this;
        }

        public Criteria andPowerTypeIsNotNull() {
            addCriterion("power_type is not null");
            return (Criteria) this;
        }

        public Criteria andPowerTypeEqualTo(String value) {
            addCriterion("power_type =", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotEqualTo(String value) {
            addCriterion("power_type <>", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeGreaterThan(String value) {
            addCriterion("power_type >", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("power_type >=", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeLessThan(String value) {
            addCriterion("power_type <", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeLessThanOrEqualTo(String value) {
            addCriterion("power_type <=", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeLike(String value) {
            addCriterion("power_type like", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotLike(String value) {
            addCriterion("power_type not like", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeIn(List<String> values) {
            addCriterion("power_type in", values, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotIn(List<String> values) {
            addCriterion("power_type not in", values, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeBetween(String value1, String value2) {
            addCriterion("power_type between", value1, value2, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotBetween(String value1, String value2) {
            addCriterion("power_type not between", value1, value2, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerCodeIsNull() {
            addCriterion("power_code is null");
            return (Criteria) this;
        }

        public Criteria andPowerCodeIsNotNull() {
            addCriterion("power_code is not null");
            return (Criteria) this;
        }

        public Criteria andPowerCodeEqualTo(String value) {
            addCriterion("power_code =", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeNotEqualTo(String value) {
            addCriterion("power_code <>", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeGreaterThan(String value) {
            addCriterion("power_code >", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("power_code >=", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeLessThan(String value) {
            addCriterion("power_code <", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeLessThanOrEqualTo(String value) {
            addCriterion("power_code <=", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeLike(String value) {
            addCriterion("power_code like", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeNotLike(String value) {
            addCriterion("power_code not like", value, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeIn(List<String> values) {
            addCriterion("power_code in", values, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeNotIn(List<String> values) {
            addCriterion("power_code not in", values, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeBetween(String value1, String value2) {
            addCriterion("power_code between", value1, value2, "powerCode");
            return (Criteria) this;
        }

        public Criteria andPowerCodeNotBetween(String value1, String value2) {
            addCriterion("power_code not between", value1, value2, "powerCode");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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