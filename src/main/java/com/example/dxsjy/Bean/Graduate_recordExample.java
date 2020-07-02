package com.example.dxsjy.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Graduate_recordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Graduate_recordExample() {
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

        public Criteria andGraduateId1IsNull() {
            addCriterion("graduate_id1 is null");
            return (Criteria) this;
        }

        public Criteria andGraduateId1IsNotNull() {
            addCriterion("graduate_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateId1EqualTo(Integer value) {
            addCriterion("graduate_id1 =", value, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andGraduateId1NotEqualTo(Integer value) {
            addCriterion("graduate_id1 <>", value, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andGraduateId1GreaterThan(Integer value) {
            addCriterion("graduate_id1 >", value, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andGraduateId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("graduate_id1 >=", value, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andGraduateId1LessThan(Integer value) {
            addCriterion("graduate_id1 <", value, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andGraduateId1LessThanOrEqualTo(Integer value) {
            addCriterion("graduate_id1 <=", value, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andGraduateId1In(List<Integer> values) {
            addCriterion("graduate_id1 in", values, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andGraduateId1NotIn(List<Integer> values) {
            addCriterion("graduate_id1 not in", values, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andGraduateId1Between(Integer value1, Integer value2) {
            addCriterion("graduate_id1 between", value1, value2, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andGraduateId1NotBetween(Integer value1, Integer value2) {
            addCriterion("graduate_id1 not between", value1, value2, "graduateId1");
            return (Criteria) this;
        }

        public Criteria andTrainningIsNull() {
            addCriterion("trainning is null");
            return (Criteria) this;
        }

        public Criteria andTrainningIsNotNull() {
            addCriterion("trainning is not null");
            return (Criteria) this;
        }

        public Criteria andTrainningEqualTo(String value) {
            addCriterion("trainning =", value, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningNotEqualTo(String value) {
            addCriterion("trainning <>", value, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningGreaterThan(String value) {
            addCriterion("trainning >", value, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningGreaterThanOrEqualTo(String value) {
            addCriterion("trainning >=", value, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningLessThan(String value) {
            addCriterion("trainning <", value, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningLessThanOrEqualTo(String value) {
            addCriterion("trainning <=", value, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningLike(String value) {
            addCriterion("trainning like", value, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningNotLike(String value) {
            addCriterion("trainning not like", value, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningIn(List<String> values) {
            addCriterion("trainning in", values, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningNotIn(List<String> values) {
            addCriterion("trainning not in", values, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningBetween(String value1, String value2) {
            addCriterion("trainning between", value1, value2, "trainning");
            return (Criteria) this;
        }

        public Criteria andTrainningNotBetween(String value1, String value2) {
            addCriterion("trainning not between", value1, value2, "trainning");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(Date value) {
            addCriterionForJDBCDate("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(Date value) {
            addCriterionForJDBCDate("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<Date> values) {
            addCriterionForJDBCDate("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stop_time not between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeIsNull() {
            addCriterion("all_time is null");
            return (Criteria) this;
        }

        public Criteria andAllTimeIsNotNull() {
            addCriterion("all_time is not null");
            return (Criteria) this;
        }

        public Criteria andAllTimeEqualTo(Integer value) {
            addCriterion("all_time =", value, "allTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeNotEqualTo(Integer value) {
            addCriterion("all_time <>", value, "allTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeGreaterThan(Integer value) {
            addCriterion("all_time >", value, "allTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_time >=", value, "allTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeLessThan(Integer value) {
            addCriterion("all_time <", value, "allTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeLessThanOrEqualTo(Integer value) {
            addCriterion("all_time <=", value, "allTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeIn(List<Integer> values) {
            addCriterion("all_time in", values, "allTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeNotIn(List<Integer> values) {
            addCriterion("all_time not in", values, "allTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeBetween(Integer value1, Integer value2) {
            addCriterion("all_time between", value1, value2, "allTime");
            return (Criteria) this;
        }

        public Criteria andAllTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("all_time not between", value1, value2, "allTime");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartIsNull() {
            addCriterion("trainning_depart is null");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartIsNotNull() {
            addCriterion("trainning_depart is not null");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartEqualTo(String value) {
            addCriterion("trainning_depart =", value, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartNotEqualTo(String value) {
            addCriterion("trainning_depart <>", value, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartGreaterThan(String value) {
            addCriterion("trainning_depart >", value, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartGreaterThanOrEqualTo(String value) {
            addCriterion("trainning_depart >=", value, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartLessThan(String value) {
            addCriterion("trainning_depart <", value, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartLessThanOrEqualTo(String value) {
            addCriterion("trainning_depart <=", value, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartLike(String value) {
            addCriterion("trainning_depart like", value, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartNotLike(String value) {
            addCriterion("trainning_depart not like", value, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartIn(List<String> values) {
            addCriterion("trainning_depart in", values, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartNotIn(List<String> values) {
            addCriterion("trainning_depart not in", values, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartBetween(String value1, String value2) {
            addCriterion("trainning_depart between", value1, value2, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningDepartNotBetween(String value1, String value2) {
            addCriterion("trainning_depart not between", value1, value2, "trainningDepart");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyIsNull() {
            addCriterion("trainning_money is null");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyIsNotNull() {
            addCriterion("trainning_money is not null");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyEqualTo(Integer value) {
            addCriterion("trainning_money =", value, "trainningMoney");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyNotEqualTo(Integer value) {
            addCriterion("trainning_money <>", value, "trainningMoney");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyGreaterThan(Integer value) {
            addCriterion("trainning_money >", value, "trainningMoney");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainning_money >=", value, "trainningMoney");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyLessThan(Integer value) {
            addCriterion("trainning_money <", value, "trainningMoney");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("trainning_money <=", value, "trainningMoney");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyIn(List<Integer> values) {
            addCriterion("trainning_money in", values, "trainningMoney");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyNotIn(List<Integer> values) {
            addCriterion("trainning_money not in", values, "trainningMoney");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyBetween(Integer value1, Integer value2) {
            addCriterion("trainning_money between", value1, value2, "trainningMoney");
            return (Criteria) this;
        }

        public Criteria andTrainningMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("trainning_money not between", value1, value2, "trainningMoney");
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