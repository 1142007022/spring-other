package com.kaishengit.entitys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TicketExample() {
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

        public Criteria andOutTimeIsNull() {
            addCriterion("out_time is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("out_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(Date value) {
            addCriterion("out_time =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(Date value) {
            addCriterion("out_time <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(Date value) {
            addCriterion("out_time >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("out_time >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(Date value) {
            addCriterion("out_time <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("out_time <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<Date> values) {
            addCriterion("out_time in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<Date> values) {
            addCriterion("out_time not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(Date value1, Date value2) {
            addCriterion("out_time between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("out_time not between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("in_time is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("in_time is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(Date value) {
            addCriterion("in_time =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(Date value) {
            addCriterion("in_time <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(Date value) {
            addCriterion("in_time >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("in_time >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(Date value) {
            addCriterion("in_time <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(Date value) {
            addCriterion("in_time <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<Date> values) {
            addCriterion("in_time in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<Date> values) {
            addCriterion("in_time not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(Date value1, Date value2) {
            addCriterion("in_time between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(Date value1, Date value2) {
            addCriterion("in_time not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andTicketInLogIdIsNull() {
            addCriterion("ticket_in_log_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdIsNotNull() {
            addCriterion("ticket_in_log_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdEqualTo(Integer value) {
            addCriterion("ticket_in_log_id =", value, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdNotEqualTo(Integer value) {
            addCriterion("ticket_in_log_id <>", value, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdGreaterThan(Integer value) {
            addCriterion("ticket_in_log_id >", value, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_in_log_id >=", value, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdLessThan(Integer value) {
            addCriterion("ticket_in_log_id <", value, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_in_log_id <=", value, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdIn(List<Integer> values) {
            addCriterion("ticket_in_log_id in", values, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdNotIn(List<Integer> values) {
            addCriterion("ticket_in_log_id not in", values, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdBetween(Integer value1, Integer value2) {
            addCriterion("ticket_in_log_id between", value1, value2, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andTicketInLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_in_log_id not between", value1, value2, "ticketInLogId");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeIsNull() {
            addCriterion("over_data_time is null");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeIsNotNull() {
            addCriterion("over_data_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeEqualTo(Date value) {
            addCriterion("over_data_time =", value, "overDataTime");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeNotEqualTo(Date value) {
            addCriterion("over_data_time <>", value, "overDataTime");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeGreaterThan(Date value) {
            addCriterion("over_data_time >", value, "overDataTime");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("over_data_time >=", value, "overDataTime");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeLessThan(Date value) {
            addCriterion("over_data_time <", value, "overDataTime");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("over_data_time <=", value, "overDataTime");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeIn(List<Date> values) {
            addCriterion("over_data_time in", values, "overDataTime");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeNotIn(List<Date> values) {
            addCriterion("over_data_time not in", values, "overDataTime");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeBetween(Date value1, Date value2) {
            addCriterion("over_data_time between", value1, value2, "overDataTime");
            return (Criteria) this;
        }

        public Criteria andOverDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("over_data_time not between", value1, value2, "overDataTime");
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