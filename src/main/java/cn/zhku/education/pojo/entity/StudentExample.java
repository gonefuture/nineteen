package cn.zhku.education.pojo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andCollegeClassIsNull() {
            addCriterion("college_class is null");
            return (Criteria) this;
        }

        public Criteria andCollegeClassIsNotNull() {
            addCriterion("college_class is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeClassEqualTo(String value) {
            addCriterion("college_class =", value, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassNotEqualTo(String value) {
            addCriterion("college_class <>", value, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassGreaterThan(String value) {
            addCriterion("college_class >", value, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassGreaterThanOrEqualTo(String value) {
            addCriterion("college_class >=", value, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassLessThan(String value) {
            addCriterion("college_class <", value, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassLessThanOrEqualTo(String value) {
            addCriterion("college_class <=", value, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassLike(String value) {
            addCriterion("college_class like", value, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassNotLike(String value) {
            addCriterion("college_class not like", value, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassIn(List<String> values) {
            addCriterion("college_class in", values, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassNotIn(List<String> values) {
            addCriterion("college_class not in", values, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassBetween(String value1, String value2) {
            addCriterion("college_class between", value1, value2, "collegeClass");
            return (Criteria) this;
        }

        public Criteria andCollegeClassNotBetween(String value1, String value2) {
            addCriterion("college_class not between", value1, value2, "collegeClass");
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

        public Criteria andPlaytimesIsNull() {
            addCriterion("playtimes is null");
            return (Criteria) this;
        }

        public Criteria andPlaytimesIsNotNull() {
            addCriterion("playtimes is not null");
            return (Criteria) this;
        }

        public Criteria andPlaytimesEqualTo(Integer value) {
            addCriterion("playtimes =", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesNotEqualTo(Integer value) {
            addCriterion("playtimes <>", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesGreaterThan(Integer value) {
            addCriterion("playtimes >", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("playtimes >=", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesLessThan(Integer value) {
            addCriterion("playtimes <", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesLessThanOrEqualTo(Integer value) {
            addCriterion("playtimes <=", value, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesIn(List<Integer> values) {
            addCriterion("playtimes in", values, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesNotIn(List<Integer> values) {
            addCriterion("playtimes not in", values, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesBetween(Integer value1, Integer value2) {
            addCriterion("playtimes between", value1, value2, "playtimes");
            return (Criteria) this;
        }

        public Criteria andPlaytimesNotBetween(Integer value1, Integer value2) {
            addCriterion("playtimes not between", value1, value2, "playtimes");
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

        public Criteria andLastRankIsNull() {
            addCriterion("last_rank is null");
            return (Criteria) this;
        }

        public Criteria andLastRankIsNotNull() {
            addCriterion("last_rank is not null");
            return (Criteria) this;
        }

        public Criteria andLastRankEqualTo(Integer value) {
            addCriterion("last_rank =", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankNotEqualTo(Integer value) {
            addCriterion("last_rank <>", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankGreaterThan(Integer value) {
            addCriterion("last_rank >", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_rank >=", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankLessThan(Integer value) {
            addCriterion("last_rank <", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankLessThanOrEqualTo(Integer value) {
            addCriterion("last_rank <=", value, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankIn(List<Integer> values) {
            addCriterion("last_rank in", values, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankNotIn(List<Integer> values) {
            addCriterion("last_rank not in", values, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankBetween(Integer value1, Integer value2) {
            addCriterion("last_rank between", value1, value2, "lastRank");
            return (Criteria) this;
        }

        public Criteria andLastRankNotBetween(Integer value1, Integer value2) {
            addCriterion("last_rank not between", value1, value2, "lastRank");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNull() {
            addCriterion("enter_time is null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIsNotNull() {
            addCriterion("enter_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnterTimeEqualTo(Date value) {
            addCriterion("enter_time =", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotEqualTo(Date value) {
            addCriterion("enter_time <>", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThan(Date value) {
            addCriterion("enter_time >", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_time >=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThan(Date value) {
            addCriterion("enter_time <", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeLessThanOrEqualTo(Date value) {
            addCriterion("enter_time <=", value, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeIn(List<Date> values) {
            addCriterion("enter_time in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotIn(List<Date> values) {
            addCriterion("enter_time not in", values, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeBetween(Date value1, Date value2) {
            addCriterion("enter_time between", value1, value2, "enterTime");
            return (Criteria) this;
        }

        public Criteria andEnterTimeNotBetween(Date value1, Date value2) {
            addCriterion("enter_time not between", value1, value2, "enterTime");
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