package com.kaishengit.entitys;

import java.util.ArrayList;
import java.util.List;

public class RolesPowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RolesPowerExample() {
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

        public Criteria andRolesIdIsNull() {
            addCriterion("roles_id is null");
            return (Criteria) this;
        }

        public Criteria andRolesIdIsNotNull() {
            addCriterion("roles_id is not null");
            return (Criteria) this;
        }

        public Criteria andRolesIdEqualTo(Integer value) {
            addCriterion("roles_id =", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdNotEqualTo(Integer value) {
            addCriterion("roles_id <>", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdGreaterThan(Integer value) {
            addCriterion("roles_id >", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roles_id >=", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdLessThan(Integer value) {
            addCriterion("roles_id <", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdLessThanOrEqualTo(Integer value) {
            addCriterion("roles_id <=", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdIn(List<Integer> values) {
            addCriterion("roles_id in", values, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdNotIn(List<Integer> values) {
            addCriterion("roles_id not in", values, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdBetween(Integer value1, Integer value2) {
            addCriterion("roles_id between", value1, value2, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roles_id not between", value1, value2, "rolesId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNull() {
            addCriterion("power_id is null");
            return (Criteria) this;
        }

        public Criteria andPowerIdIsNotNull() {
            addCriterion("power_id is not null");
            return (Criteria) this;
        }

        public Criteria andPowerIdEqualTo(Integer value) {
            addCriterion("power_id =", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotEqualTo(Integer value) {
            addCriterion("power_id <>", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThan(Integer value) {
            addCriterion("power_id >", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("power_id >=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThan(Integer value) {
            addCriterion("power_id <", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdLessThanOrEqualTo(Integer value) {
            addCriterion("power_id <=", value, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdIn(List<Integer> values) {
            addCriterion("power_id in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotIn(List<Integer> values) {
            addCriterion("power_id not in", values, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdBetween(Integer value1, Integer value2) {
            addCriterion("power_id between", value1, value2, "powerId");
            return (Criteria) this;
        }

        public Criteria andPowerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("power_id not between", value1, value2, "powerId");
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