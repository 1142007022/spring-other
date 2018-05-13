package com.kaishengit.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketSaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TicketSaleExample() {
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

        public Criteria andCeateTimeIsNull() {
            addCriterion("ceate_time is null");
            return (Criteria) this;
        }

        public Criteria andCeateTimeIsNotNull() {
            addCriterion("ceate_time is not null");
            return (Criteria) this;
        }

        public Criteria andCeateTimeEqualTo(Date value) {
            addCriterion("ceate_time =", value, "ceateTime");
            return (Criteria) this;
        }

        public Criteria andCeateTimeNotEqualTo(Date value) {
            addCriterion("ceate_time <>", value, "ceateTime");
            return (Criteria) this;
        }

        public Criteria andCeateTimeGreaterThan(Date value) {
            addCriterion("ceate_time >", value, "ceateTime");
            return (Criteria) this;
        }

        public Criteria andCeateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ceate_time >=", value, "ceateTime");
            return (Criteria) this;
        }

        public Criteria andCeateTimeLessThan(Date value) {
            addCriterion("ceate_time <", value, "ceateTime");
            return (Criteria) this;
        }

        public Criteria andCeateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ceate_time <=", value, "ceateTime");
            return (Criteria) this;
        }

        public Criteria andCeateTimeIn(List<Date> values) {
            addCriterion("ceate_time in", values, "ceateTime");
            return (Criteria) this;
        }

        public Criteria andCeateTimeNotIn(List<Date> values) {
            addCriterion("ceate_time not in", values, "ceateTime");
            return (Criteria) this;
        }

        public Criteria andCeateTimeBetween(Date value1, Date value2) {
            addCriterion("ceate_time between", value1, value2, "ceateTime");
            return (Criteria) this;
        }

        public Criteria andCeateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ceate_time not between", value1, value2, "ceateTime");
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameIsNull() {
            addCriterion("ticketoffice_name is null");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameIsNotNull() {
            addCriterion("ticketoffice_name is not null");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameEqualTo(String value) {
            addCriterion("ticketoffice_name =", value, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameNotEqualTo(String value) {
            addCriterion("ticketoffice_name <>", value, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameGreaterThan(String value) {
            addCriterion("ticketoffice_name >", value, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ticketoffice_name >=", value, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameLessThan(String value) {
            addCriterion("ticketoffice_name <", value, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameLessThanOrEqualTo(String value) {
            addCriterion("ticketoffice_name <=", value, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameLike(String value) {
            addCriterion("ticketoffice_name like", value, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameNotLike(String value) {
            addCriterion("ticketoffice_name not like", value, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameIn(List<String> values) {
            addCriterion("ticketoffice_name in", values, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameNotIn(List<String> values) {
            addCriterion("ticketoffice_name not in", values, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameBetween(String value1, String value2) {
            addCriterion("ticketoffice_name between", value1, value2, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeNameNotBetween(String value1, String value2) {
            addCriterion("ticketoffice_name not between", value1, value2, "ticketofficeName");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdIsNull() {
            addCriterion("ticketoffice_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdIsNotNull() {
            addCriterion("ticketoffice_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdEqualTo(Integer value) {
            addCriterion("ticketoffice_id =", value, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdNotEqualTo(Integer value) {
            addCriterion("ticketoffice_id <>", value, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdGreaterThan(Integer value) {
            addCriterion("ticketoffice_id >", value, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticketoffice_id >=", value, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdLessThan(Integer value) {
            addCriterion("ticketoffice_id <", value, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdLessThanOrEqualTo(Integer value) {
            addCriterion("ticketoffice_id <=", value, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdIn(List<Integer> values) {
            addCriterion("ticketoffice_id in", values, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdNotIn(List<Integer> values) {
            addCriterion("ticketoffice_id not in", values, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdBetween(Integer value1, Integer value2) {
            addCriterion("ticketoffice_id between", value1, value2, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketofficeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ticketoffice_id not between", value1, value2, "ticketofficeId");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNull() {
            addCriterion("ticket_num is null");
            return (Criteria) this;
        }

        public Criteria andTicketNumIsNotNull() {
            addCriterion("ticket_num is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNumEqualTo(String value) {
            addCriterion("ticket_num =", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotEqualTo(String value) {
            addCriterion("ticket_num <>", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThan(String value) {
            addCriterion("ticket_num >", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_num >=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThan(String value) {
            addCriterion("ticket_num <", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThanOrEqualTo(String value) {
            addCriterion("ticket_num <=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLike(String value) {
            addCriterion("ticket_num like", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotLike(String value) {
            addCriterion("ticket_num not like", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumIn(List<String> values) {
            addCriterion("ticket_num in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotIn(List<String> values) {
            addCriterion("ticket_num not in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumBetween(String value1, String value2) {
            addCriterion("ticket_num between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotBetween(String value1, String value2) {
            addCriterion("ticket_num not between", value1, value2, "ticketNum");
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