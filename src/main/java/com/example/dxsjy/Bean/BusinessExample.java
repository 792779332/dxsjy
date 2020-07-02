package com.example.dxsjy.Bean;

import java.util.ArrayList;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Integer value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Integer value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Integer value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Integer value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Integer value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Integer> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Integer> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Integer value1, Integer value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("b_id not between", value1, value2, "bId");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBNameIsNull() {
            addCriterion("b_name is null");
            return (Criteria) this;
        }

        public Criteria andBNameIsNotNull() {
            addCriterion("b_name is not null");
            return (Criteria) this;
        }

        public Criteria andBNameEqualTo(String value) {
            addCriterion("b_name =", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotEqualTo(String value) {
            addCriterion("b_name <>", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThan(String value) {
            addCriterion("b_name >", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThanOrEqualTo(String value) {
            addCriterion("b_name >=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThan(String value) {
            addCriterion("b_name <", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThanOrEqualTo(String value) {
            addCriterion("b_name <=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLike(String value) {
            addCriterion("b_name like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotLike(String value) {
            addCriterion("b_name not like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameIn(List<String> values) {
            addCriterion("b_name in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotIn(List<String> values) {
            addCriterion("b_name not in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameBetween(String value1, String value2) {
            addCriterion("b_name between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotBetween(String value1, String value2) {
            addCriterion("b_name not between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBAddressIsNull() {
            addCriterion("b_address is null");
            return (Criteria) this;
        }

        public Criteria andBAddressIsNotNull() {
            addCriterion("b_address is not null");
            return (Criteria) this;
        }

        public Criteria andBAddressEqualTo(String value) {
            addCriterion("b_address =", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressNotEqualTo(String value) {
            addCriterion("b_address <>", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressGreaterThan(String value) {
            addCriterion("b_address >", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressGreaterThanOrEqualTo(String value) {
            addCriterion("b_address >=", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressLessThan(String value) {
            addCriterion("b_address <", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressLessThanOrEqualTo(String value) {
            addCriterion("b_address <=", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressLike(String value) {
            addCriterion("b_address like", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressNotLike(String value) {
            addCriterion("b_address not like", value, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressIn(List<String> values) {
            addCriterion("b_address in", values, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressNotIn(List<String> values) {
            addCriterion("b_address not in", values, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressBetween(String value1, String value2) {
            addCriterion("b_address between", value1, value2, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBAddressNotBetween(String value1, String value2) {
            addCriterion("b_address not between", value1, value2, "bAddress");
            return (Criteria) this;
        }

        public Criteria andBTelIsNull() {
            addCriterion("b_tel is null");
            return (Criteria) this;
        }

        public Criteria andBTelIsNotNull() {
            addCriterion("b_tel is not null");
            return (Criteria) this;
        }

        public Criteria andBTelEqualTo(String value) {
            addCriterion("b_tel =", value, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelNotEqualTo(String value) {
            addCriterion("b_tel <>", value, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelGreaterThan(String value) {
            addCriterion("b_tel >", value, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelGreaterThanOrEqualTo(String value) {
            addCriterion("b_tel >=", value, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelLessThan(String value) {
            addCriterion("b_tel <", value, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelLessThanOrEqualTo(String value) {
            addCriterion("b_tel <=", value, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelLike(String value) {
            addCriterion("b_tel like", value, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelNotLike(String value) {
            addCriterion("b_tel not like", value, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelIn(List<String> values) {
            addCriterion("b_tel in", values, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelNotIn(List<String> values) {
            addCriterion("b_tel not in", values, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelBetween(String value1, String value2) {
            addCriterion("b_tel between", value1, value2, "bTel");
            return (Criteria) this;
        }

        public Criteria andBTelNotBetween(String value1, String value2) {
            addCriterion("b_tel not between", value1, value2, "bTel");
            return (Criteria) this;
        }

        public Criteria andBPeopleIsNull() {
            addCriterion("b_people is null");
            return (Criteria) this;
        }

        public Criteria andBPeopleIsNotNull() {
            addCriterion("b_people is not null");
            return (Criteria) this;
        }

        public Criteria andBPeopleEqualTo(String value) {
            addCriterion("b_people =", value, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleNotEqualTo(String value) {
            addCriterion("b_people <>", value, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleGreaterThan(String value) {
            addCriterion("b_people >", value, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("b_people >=", value, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleLessThan(String value) {
            addCriterion("b_people <", value, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleLessThanOrEqualTo(String value) {
            addCriterion("b_people <=", value, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleLike(String value) {
            addCriterion("b_people like", value, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleNotLike(String value) {
            addCriterion("b_people not like", value, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleIn(List<String> values) {
            addCriterion("b_people in", values, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleNotIn(List<String> values) {
            addCriterion("b_people not in", values, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleBetween(String value1, String value2) {
            addCriterion("b_people between", value1, value2, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBPeopleNotBetween(String value1, String value2) {
            addCriterion("b_people not between", value1, value2, "bPeople");
            return (Criteria) this;
        }

        public Criteria andBEmailIsNull() {
            addCriterion("b_email is null");
            return (Criteria) this;
        }

        public Criteria andBEmailIsNotNull() {
            addCriterion("b_email is not null");
            return (Criteria) this;
        }

        public Criteria andBEmailEqualTo(String value) {
            addCriterion("b_email =", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailNotEqualTo(String value) {
            addCriterion("b_email <>", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailGreaterThan(String value) {
            addCriterion("b_email >", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailGreaterThanOrEqualTo(String value) {
            addCriterion("b_email >=", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailLessThan(String value) {
            addCriterion("b_email <", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailLessThanOrEqualTo(String value) {
            addCriterion("b_email <=", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailLike(String value) {
            addCriterion("b_email like", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailNotLike(String value) {
            addCriterion("b_email not like", value, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailIn(List<String> values) {
            addCriterion("b_email in", values, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailNotIn(List<String> values) {
            addCriterion("b_email not in", values, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailBetween(String value1, String value2) {
            addCriterion("b_email between", value1, value2, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBEmailNotBetween(String value1, String value2) {
            addCriterion("b_email not between", value1, value2, "bEmail");
            return (Criteria) this;
        }

        public Criteria andBWebsiteIsNull() {
            addCriterion("b_website is null");
            return (Criteria) this;
        }

        public Criteria andBWebsiteIsNotNull() {
            addCriterion("b_website is not null");
            return (Criteria) this;
        }

        public Criteria andBWebsiteEqualTo(String value) {
            addCriterion("b_website =", value, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteNotEqualTo(String value) {
            addCriterion("b_website <>", value, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteGreaterThan(String value) {
            addCriterion("b_website >", value, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("b_website >=", value, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteLessThan(String value) {
            addCriterion("b_website <", value, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteLessThanOrEqualTo(String value) {
            addCriterion("b_website <=", value, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteLike(String value) {
            addCriterion("b_website like", value, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteNotLike(String value) {
            addCriterion("b_website not like", value, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteIn(List<String> values) {
            addCriterion("b_website in", values, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteNotIn(List<String> values) {
            addCriterion("b_website not in", values, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteBetween(String value1, String value2) {
            addCriterion("b_website between", value1, value2, "bWebsite");
            return (Criteria) this;
        }

        public Criteria andBWebsiteNotBetween(String value1, String value2) {
            addCriterion("b_website not between", value1, value2, "bWebsite");
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