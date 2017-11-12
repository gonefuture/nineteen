package cn.zhku.education.pojo.entity;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQtypeIsNull() {
            addCriterion("qtype is null");
            return (Criteria) this;
        }

        public Criteria andQtypeIsNotNull() {
            addCriterion("qtype is not null");
            return (Criteria) this;
        }

        public Criteria andQtypeEqualTo(String value) {
            addCriterion("qtype =", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotEqualTo(String value) {
            addCriterion("qtype <>", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThan(String value) {
            addCriterion("qtype >", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeGreaterThanOrEqualTo(String value) {
            addCriterion("qtype >=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThan(String value) {
            addCriterion("qtype <", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLessThanOrEqualTo(String value) {
            addCriterion("qtype <=", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeLike(String value) {
            addCriterion("qtype like", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotLike(String value) {
            addCriterion("qtype not like", value, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeIn(List<String> values) {
            addCriterion("qtype in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotIn(List<String> values) {
            addCriterion("qtype not in", values, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeBetween(String value1, String value2) {
            addCriterion("qtype between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQtypeNotBetween(String value1, String value2) {
            addCriterion("qtype not between", value1, value2, "qtype");
            return (Criteria) this;
        }

        public Criteria andQcontentIsNull() {
            addCriterion("qcontent is null");
            return (Criteria) this;
        }

        public Criteria andQcontentIsNotNull() {
            addCriterion("qcontent is not null");
            return (Criteria) this;
        }

        public Criteria andQcontentEqualTo(String value) {
            addCriterion("qcontent =", value, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentNotEqualTo(String value) {
            addCriterion("qcontent <>", value, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentGreaterThan(String value) {
            addCriterion("qcontent >", value, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentGreaterThanOrEqualTo(String value) {
            addCriterion("qcontent >=", value, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentLessThan(String value) {
            addCriterion("qcontent <", value, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentLessThanOrEqualTo(String value) {
            addCriterion("qcontent <=", value, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentLike(String value) {
            addCriterion("qcontent like", value, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentNotLike(String value) {
            addCriterion("qcontent not like", value, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentIn(List<String> values) {
            addCriterion("qcontent in", values, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentNotIn(List<String> values) {
            addCriterion("qcontent not in", values, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentBetween(String value1, String value2) {
            addCriterion("qcontent between", value1, value2, "qcontent");
            return (Criteria) this;
        }

        public Criteria andQcontentNotBetween(String value1, String value2) {
            addCriterion("qcontent not between", value1, value2, "qcontent");
            return (Criteria) this;
        }

        public Criteria andAIsNull() {
            addCriterion("a is null");
            return (Criteria) this;
        }

        public Criteria andAIsNotNull() {
            addCriterion("a is not null");
            return (Criteria) this;
        }

        public Criteria andAEqualTo(String value) {
            addCriterion("a =", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotEqualTo(String value) {
            addCriterion("a <>", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThan(String value) {
            addCriterion("a >", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThanOrEqualTo(String value) {
            addCriterion("a >=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThan(String value) {
            addCriterion("a <", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThanOrEqualTo(String value) {
            addCriterion("a <=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALike(String value) {
            addCriterion("a like", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotLike(String value) {
            addCriterion("a not like", value, "a");
            return (Criteria) this;
        }

        public Criteria andAIn(List<String> values) {
            addCriterion("a in", values, "a");
            return (Criteria) this;
        }

        public Criteria andANotIn(List<String> values) {
            addCriterion("a not in", values, "a");
            return (Criteria) this;
        }

        public Criteria andABetween(String value1, String value2) {
            addCriterion("a between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andANotBetween(String value1, String value2) {
            addCriterion("a not between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andBIsNull() {
            addCriterion("b is null");
            return (Criteria) this;
        }

        public Criteria andBIsNotNull() {
            addCriterion("b is not null");
            return (Criteria) this;
        }

        public Criteria andBEqualTo(String value) {
            addCriterion("b =", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotEqualTo(String value) {
            addCriterion("b <>", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThan(String value) {
            addCriterion("b >", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThanOrEqualTo(String value) {
            addCriterion("b >=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThan(String value) {
            addCriterion("b <", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThanOrEqualTo(String value) {
            addCriterion("b <=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLike(String value) {
            addCriterion("b like", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotLike(String value) {
            addCriterion("b not like", value, "b");
            return (Criteria) this;
        }

        public Criteria andBIn(List<String> values) {
            addCriterion("b in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBNotIn(List<String> values) {
            addCriterion("b not in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBBetween(String value1, String value2) {
            addCriterion("b between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andBNotBetween(String value1, String value2) {
            addCriterion("b not between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andCIsNull() {
            addCriterion("c is null");
            return (Criteria) this;
        }

        public Criteria andCIsNotNull() {
            addCriterion("c is not null");
            return (Criteria) this;
        }

        public Criteria andCEqualTo(String value) {
            addCriterion("c =", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotEqualTo(String value) {
            addCriterion("c <>", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThan(String value) {
            addCriterion("c >", value, "c");
            return (Criteria) this;
        }

        public Criteria andCGreaterThanOrEqualTo(String value) {
            addCriterion("c >=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThan(String value) {
            addCriterion("c <", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLessThanOrEqualTo(String value) {
            addCriterion("c <=", value, "c");
            return (Criteria) this;
        }

        public Criteria andCLike(String value) {
            addCriterion("c like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCNotLike(String value) {
            addCriterion("c not like", value, "c");
            return (Criteria) this;
        }

        public Criteria andCIn(List<String> values) {
            addCriterion("c in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCNotIn(List<String> values) {
            addCriterion("c not in", values, "c");
            return (Criteria) this;
        }

        public Criteria andCBetween(String value1, String value2) {
            addCriterion("c between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andCNotBetween(String value1, String value2) {
            addCriterion("c not between", value1, value2, "c");
            return (Criteria) this;
        }

        public Criteria andDIsNull() {
            addCriterion("d is null");
            return (Criteria) this;
        }

        public Criteria andDIsNotNull() {
            addCriterion("d is not null");
            return (Criteria) this;
        }

        public Criteria andDEqualTo(String value) {
            addCriterion("d =", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotEqualTo(String value) {
            addCriterion("d <>", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThan(String value) {
            addCriterion("d >", value, "d");
            return (Criteria) this;
        }

        public Criteria andDGreaterThanOrEqualTo(String value) {
            addCriterion("d >=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThan(String value) {
            addCriterion("d <", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLessThanOrEqualTo(String value) {
            addCriterion("d <=", value, "d");
            return (Criteria) this;
        }

        public Criteria andDLike(String value) {
            addCriterion("d like", value, "d");
            return (Criteria) this;
        }

        public Criteria andDNotLike(String value) {
            addCriterion("d not like", value, "d");
            return (Criteria) this;
        }

        public Criteria andDIn(List<String> values) {
            addCriterion("d in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDNotIn(List<String> values) {
            addCriterion("d not in", values, "d");
            return (Criteria) this;
        }

        public Criteria andDBetween(String value1, String value2) {
            addCriterion("d between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andDNotBetween(String value1, String value2) {
            addCriterion("d not between", value1, value2, "d");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andQexplainIsNull() {
            addCriterion("qexplain is null");
            return (Criteria) this;
        }

        public Criteria andQexplainIsNotNull() {
            addCriterion("qexplain is not null");
            return (Criteria) this;
        }

        public Criteria andQexplainEqualTo(String value) {
            addCriterion("qexplain =", value, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainNotEqualTo(String value) {
            addCriterion("qexplain <>", value, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainGreaterThan(String value) {
            addCriterion("qexplain >", value, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainGreaterThanOrEqualTo(String value) {
            addCriterion("qexplain >=", value, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainLessThan(String value) {
            addCriterion("qexplain <", value, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainLessThanOrEqualTo(String value) {
            addCriterion("qexplain <=", value, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainLike(String value) {
            addCriterion("qexplain like", value, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainNotLike(String value) {
            addCriterion("qexplain not like", value, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainIn(List<String> values) {
            addCriterion("qexplain in", values, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainNotIn(List<String> values) {
            addCriterion("qexplain not in", values, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainBetween(String value1, String value2) {
            addCriterion("qexplain between", value1, value2, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQexplainNotBetween(String value1, String value2) {
            addCriterion("qexplain not between", value1, value2, "qexplain");
            return (Criteria) this;
        }

        public Criteria andQvalueIsNull() {
            addCriterion("qvalue is null");
            return (Criteria) this;
        }

        public Criteria andQvalueIsNotNull() {
            addCriterion("qvalue is not null");
            return (Criteria) this;
        }

        public Criteria andQvalueEqualTo(Integer value) {
            addCriterion("qvalue =", value, "qvalue");
            return (Criteria) this;
        }

        public Criteria andQvalueNotEqualTo(Integer value) {
            addCriterion("qvalue <>", value, "qvalue");
            return (Criteria) this;
        }

        public Criteria andQvalueGreaterThan(Integer value) {
            addCriterion("qvalue >", value, "qvalue");
            return (Criteria) this;
        }

        public Criteria andQvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("qvalue >=", value, "qvalue");
            return (Criteria) this;
        }

        public Criteria andQvalueLessThan(Integer value) {
            addCriterion("qvalue <", value, "qvalue");
            return (Criteria) this;
        }

        public Criteria andQvalueLessThanOrEqualTo(Integer value) {
            addCriterion("qvalue <=", value, "qvalue");
            return (Criteria) this;
        }

        public Criteria andQvalueIn(List<Integer> values) {
            addCriterion("qvalue in", values, "qvalue");
            return (Criteria) this;
        }

        public Criteria andQvalueNotIn(List<Integer> values) {
            addCriterion("qvalue not in", values, "qvalue");
            return (Criteria) this;
        }

        public Criteria andQvalueBetween(Integer value1, Integer value2) {
            addCriterion("qvalue between", value1, value2, "qvalue");
            return (Criteria) this;
        }

        public Criteria andQvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("qvalue not between", value1, value2, "qvalue");
            return (Criteria) this;
        }

        public Criteria andEntertimeIsNull() {
            addCriterion("entertime is null");
            return (Criteria) this;
        }

        public Criteria andEntertimeIsNotNull() {
            addCriterion("entertime is not null");
            return (Criteria) this;
        }

        public Criteria andEntertimeEqualTo(String value) {
            addCriterion("entertime =", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotEqualTo(String value) {
            addCriterion("entertime <>", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeGreaterThan(String value) {
            addCriterion("entertime >", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeGreaterThanOrEqualTo(String value) {
            addCriterion("entertime >=", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeLessThan(String value) {
            addCriterion("entertime <", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeLessThanOrEqualTo(String value) {
            addCriterion("entertime <=", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeLike(String value) {
            addCriterion("entertime like", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotLike(String value) {
            addCriterion("entertime not like", value, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeIn(List<String> values) {
            addCriterion("entertime in", values, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotIn(List<String> values) {
            addCriterion("entertime not in", values, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeBetween(String value1, String value2) {
            addCriterion("entertime between", value1, value2, "entertime");
            return (Criteria) this;
        }

        public Criteria andEntertimeNotBetween(String value1, String value2) {
            addCriterion("entertime not between", value1, value2, "entertime");
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