package com.kaishengit.entitys;

import java.util.ArrayList;
import java.util.List;

public class TicketofficeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TicketofficeExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdIsNull() {
            addCriterion("sale_account_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdIsNotNull() {
            addCriterion("sale_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdEqualTo(Integer value) {
            addCriterion("sale_account_id =", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdNotEqualTo(Integer value) {
            addCriterion("sale_account_id <>", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdGreaterThan(Integer value) {
            addCriterion("sale_account_id >", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_account_id >=", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdLessThan(Integer value) {
            addCriterion("sale_account_id <", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_account_id <=", value, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdIn(List<Integer> values) {
            addCriterion("sale_account_id in", values, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdNotIn(List<Integer> values) {
            addCriterion("sale_account_id not in", values, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_account_id between", value1, value2, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andSaleAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_account_id not between", value1, value2, "saleAccountId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andTicketNumEqualTo(Integer value) {
            addCriterion("ticket_num =", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotEqualTo(Integer value) {
            addCriterion("ticket_num <>", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThan(Integer value) {
            addCriterion("ticket_num >", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_num >=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThan(Integer value) {
            addCriterion("ticket_num <", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_num <=", value, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumIn(List<Integer> values) {
            addCriterion("ticket_num in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotIn(List<Integer> values) {
            addCriterion("ticket_num not in", values, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumBetween(Integer value1, Integer value2) {
            addCriterion("ticket_num between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andTicketNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_num not between", value1, value2, "ticketNum");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyIsNull() {
            addCriterion("id_card_key is null");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyIsNotNull() {
            addCriterion("id_card_key is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyEqualTo(String value) {
            addCriterion("id_card_key =", value, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyNotEqualTo(String value) {
            addCriterion("id_card_key <>", value, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyGreaterThan(String value) {
            addCriterion("id_card_key >", value, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_key >=", value, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyLessThan(String value) {
            addCriterion("id_card_key <", value, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyLessThanOrEqualTo(String value) {
            addCriterion("id_card_key <=", value, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyLike(String value) {
            addCriterion("id_card_key like", value, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyNotLike(String value) {
            addCriterion("id_card_key not like", value, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyIn(List<String> values) {
            addCriterion("id_card_key in", values, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyNotIn(List<String> values) {
            addCriterion("id_card_key not in", values, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyBetween(String value1, String value2) {
            addCriterion("id_card_key between", value1, value2, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andIdCardKeyNotBetween(String value1, String value2) {
            addCriterion("id_card_key not between", value1, value2, "idCardKey");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("place is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("place is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("place =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("place <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("place >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("place >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("place <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("place <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("place like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("place not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("place in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("place not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("place between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("place not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyIsNull() {
            addCriterion("business_licence_key is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyIsNotNull() {
            addCriterion("business_licence_key is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyEqualTo(String value) {
            addCriterion("business_licence_key =", value, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyNotEqualTo(String value) {
            addCriterion("business_licence_key <>", value, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyGreaterThan(String value) {
            addCriterion("business_licence_key >", value, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence_key >=", value, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyLessThan(String value) {
            addCriterion("business_licence_key <", value, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyLessThanOrEqualTo(String value) {
            addCriterion("business_licence_key <=", value, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyLike(String value) {
            addCriterion("business_licence_key like", value, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyNotLike(String value) {
            addCriterion("business_licence_key not like", value, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyIn(List<String> values) {
            addCriterion("business_licence_key in", values, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyNotIn(List<String> values) {
            addCriterion("business_licence_key not in", values, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyBetween(String value1, String value2) {
            addCriterion("business_licence_key between", value1, value2, "businessLicenceKey");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceKeyNotBetween(String value1, String value2) {
            addCriterion("business_licence_key not between", value1, value2, "businessLicenceKey");
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