package cn.zhku.education.pojo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryExample() {
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

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(String value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(String value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(String value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(String value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(String value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(String value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLike(String value) {
            addCriterion("hid like", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotLike(String value) {
            addCriterion("hid not like", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<String> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<String> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(String value1, String value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(String value1, String value2) {
            addCriterion("hid not between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFirstScoreIsNull() {
            addCriterion("first_score is null");
            return (Criteria) this;
        }

        public Criteria andFirstScoreIsNotNull() {
            addCriterion("first_score is not null");
            return (Criteria) this;
        }

        public Criteria andFirstScoreEqualTo(Integer value) {
            addCriterion("first_score =", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreNotEqualTo(Integer value) {
            addCriterion("first_score <>", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreGreaterThan(Integer value) {
            addCriterion("first_score >", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_score >=", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreLessThan(Integer value) {
            addCriterion("first_score <", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreLessThanOrEqualTo(Integer value) {
            addCriterion("first_score <=", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreIn(List<Integer> values) {
            addCriterion("first_score in", values, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreNotIn(List<Integer> values) {
            addCriterion("first_score not in", values, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreBetween(Integer value1, Integer value2) {
            addCriterion("first_score between", value1, value2, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("first_score not between", value1, value2, "firstScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreIsNull() {
            addCriterion("second_score is null");
            return (Criteria) this;
        }

        public Criteria andSecondScoreIsNotNull() {
            addCriterion("second_score is not null");
            return (Criteria) this;
        }

        public Criteria andSecondScoreEqualTo(Integer value) {
            addCriterion("second_score =", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreNotEqualTo(Integer value) {
            addCriterion("second_score <>", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreGreaterThan(Integer value) {
            addCriterion("second_score >", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_score >=", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreLessThan(Integer value) {
            addCriterion("second_score <", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreLessThanOrEqualTo(Integer value) {
            addCriterion("second_score <=", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreIn(List<Integer> values) {
            addCriterion("second_score in", values, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreNotIn(List<Integer> values) {
            addCriterion("second_score not in", values, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreBetween(Integer value1, Integer value2) {
            addCriterion("second_score between", value1, value2, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("second_score not between", value1, value2, "secondScore");
            return (Criteria) this;
        }

        public Criteria andHtimeIsNull() {
            addCriterion("htime is null");
            return (Criteria) this;
        }

        public Criteria andHtimeIsNotNull() {
            addCriterion("htime is not null");
            return (Criteria) this;
        }

        public Criteria andHtimeEqualTo(Date value) {
            addCriterion("htime =", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeNotEqualTo(Date value) {
            addCriterion("htime <>", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeGreaterThan(Date value) {
            addCriterion("htime >", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("htime >=", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeLessThan(Date value) {
            addCriterion("htime <", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeLessThanOrEqualTo(Date value) {
            addCriterion("htime <=", value, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeIn(List<Date> values) {
            addCriterion("htime in", values, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeNotIn(List<Date> values) {
            addCriterion("htime not in", values, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeBetween(Date value1, Date value2) {
            addCriterion("htime between", value1, value2, "htime");
            return (Criteria) this;
        }

        public Criteria andHtimeNotBetween(Date value1, Date value2) {
            addCriterion("htime not between", value1, value2, "htime");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andHrateIsNull() {
            addCriterion("hrate is null");
            return (Criteria) this;
        }

        public Criteria andHrateIsNotNull() {
            addCriterion("hrate is not null");
            return (Criteria) this;
        }

        public Criteria andHrateEqualTo(Integer value) {
            addCriterion("hrate =", value, "hrate");
            return (Criteria) this;
        }

        public Criteria andHrateNotEqualTo(Integer value) {
            addCriterion("hrate <>", value, "hrate");
            return (Criteria) this;
        }

        public Criteria andHrateGreaterThan(Integer value) {
            addCriterion("hrate >", value, "hrate");
            return (Criteria) this;
        }

        public Criteria andHrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hrate >=", value, "hrate");
            return (Criteria) this;
        }

        public Criteria andHrateLessThan(Integer value) {
            addCriterion("hrate <", value, "hrate");
            return (Criteria) this;
        }

        public Criteria andHrateLessThanOrEqualTo(Integer value) {
            addCriterion("hrate <=", value, "hrate");
            return (Criteria) this;
        }

        public Criteria andHrateIn(List<Integer> values) {
            addCriterion("hrate in", values, "hrate");
            return (Criteria) this;
        }

        public Criteria andHrateNotIn(List<Integer> values) {
            addCriterion("hrate not in", values, "hrate");
            return (Criteria) this;
        }

        public Criteria andHrateBetween(Integer value1, Integer value2) {
            addCriterion("hrate between", value1, value2, "hrate");
            return (Criteria) this;
        }

        public Criteria andHrateNotBetween(Integer value1, Integer value2) {
            addCriterion("hrate not between", value1, value2, "hrate");
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