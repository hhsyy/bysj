package org.itjl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XqCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XqCriteria() {
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

        public Criteria andXq_idIsNull() {
            addCriterion("xq_id is null");
            return (Criteria) this;
        }

        public Criteria andXq_idIsNotNull() {
            addCriterion("xq_id is not null");
            return (Criteria) this;
        }

        public Criteria andXq_idEqualTo(Integer value) {
            addCriterion("xq_id =", value, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_idNotEqualTo(Integer value) {
            addCriterion("xq_id <>", value, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_idGreaterThan(Integer value) {
            addCriterion("xq_id >", value, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("xq_id >=", value, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_idLessThan(Integer value) {
            addCriterion("xq_id <", value, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_idLessThanOrEqualTo(Integer value) {
            addCriterion("xq_id <=", value, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_idIn(List<Integer> values) {
            addCriterion("xq_id in", values, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_idNotIn(List<Integer> values) {
            addCriterion("xq_id not in", values, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_idBetween(Integer value1, Integer value2) {
            addCriterion("xq_id between", value1, value2, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_idNotBetween(Integer value1, Integer value2) {
            addCriterion("xq_id not between", value1, value2, "xq_id");
            return (Criteria) this;
        }

        public Criteria andXq_btIsNull() {
            addCriterion("xq_bt is null");
            return (Criteria) this;
        }

        public Criteria andXq_btIsNotNull() {
            addCriterion("xq_bt is not null");
            return (Criteria) this;
        }

        public Criteria andXq_btEqualTo(String value) {
            addCriterion("xq_bt =", value, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btNotEqualTo(String value) {
            addCriterion("xq_bt <>", value, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btGreaterThan(String value) {
            addCriterion("xq_bt >", value, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btGreaterThanOrEqualTo(String value) {
            addCriterion("xq_bt >=", value, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btLessThan(String value) {
            addCriterion("xq_bt <", value, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btLessThanOrEqualTo(String value) {
            addCriterion("xq_bt <=", value, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btLike(String value) {
            addCriterion("xq_bt like", value, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btNotLike(String value) {
            addCriterion("xq_bt not like", value, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btIn(List<String> values) {
            addCriterion("xq_bt in", values, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btNotIn(List<String> values) {
            addCriterion("xq_bt not in", values, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btBetween(String value1, String value2) {
            addCriterion("xq_bt between", value1, value2, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_btNotBetween(String value1, String value2) {
            addCriterion("xq_bt not between", value1, value2, "xq_bt");
            return (Criteria) this;
        }

        public Criteria andXq_dateIsNull() {
            addCriterion("xq_date is null");
            return (Criteria) this;
        }

        public Criteria andXq_dateIsNotNull() {
            addCriterion("xq_date is not null");
            return (Criteria) this;
        }

        public Criteria andXq_dateEqualTo(Date value) {
            addCriterionForJDBCDate("xq_date =", value, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("xq_date <>", value, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("xq_date >", value, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xq_date >=", value, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_dateLessThan(Date value) {
            addCriterionForJDBCDate("xq_date <", value, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("xq_date <=", value, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_dateIn(List<Date> values) {
            addCriterionForJDBCDate("xq_date in", values, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("xq_date not in", values, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xq_date between", value1, value2, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("xq_date not between", value1, value2, "xq_date");
            return (Criteria) this;
        }

        public Criteria andXq_llIsNull() {
            addCriterion("xq_ll is null");
            return (Criteria) this;
        }

        public Criteria andXq_llIsNotNull() {
            addCriterion("xq_ll is not null");
            return (Criteria) this;
        }

        public Criteria andXq_llEqualTo(Integer value) {
            addCriterion("xq_ll =", value, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_llNotEqualTo(Integer value) {
            addCriterion("xq_ll <>", value, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_llGreaterThan(Integer value) {
            addCriterion("xq_ll >", value, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_llGreaterThanOrEqualTo(Integer value) {
            addCriterion("xq_ll >=", value, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_llLessThan(Integer value) {
            addCriterion("xq_ll <", value, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_llLessThanOrEqualTo(Integer value) {
            addCriterion("xq_ll <=", value, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_llIn(List<Integer> values) {
            addCriterion("xq_ll in", values, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_llNotIn(List<Integer> values) {
            addCriterion("xq_ll not in", values, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_llBetween(Integer value1, Integer value2) {
            addCriterion("xq_ll between", value1, value2, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_llNotBetween(Integer value1, Integer value2) {
            addCriterion("xq_ll not between", value1, value2, "xq_ll");
            return (Criteria) this;
        }

        public Criteria andXq_jfIsNull() {
            addCriterion("xq_jf is null");
            return (Criteria) this;
        }

        public Criteria andXq_jfIsNotNull() {
            addCriterion("xq_jf is not null");
            return (Criteria) this;
        }

        public Criteria andXq_jfEqualTo(Integer value) {
            addCriterion("xq_jf =", value, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andXq_jfNotEqualTo(Integer value) {
            addCriterion("xq_jf <>", value, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andXq_jfGreaterThan(Integer value) {
            addCriterion("xq_jf >", value, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andXq_jfGreaterThanOrEqualTo(Integer value) {
            addCriterion("xq_jf >=", value, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andXq_jfLessThan(Integer value) {
            addCriterion("xq_jf <", value, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andXq_jfLessThanOrEqualTo(Integer value) {
            addCriterion("xq_jf <=", value, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andXq_jfIn(List<Integer> values) {
            addCriterion("xq_jf in", values, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andXq_jfNotIn(List<Integer> values) {
            addCriterion("xq_jf not in", values, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andXq_jfBetween(Integer value1, Integer value2) {
            addCriterion("xq_jf between", value1, value2, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andXq_jfNotBetween(Integer value1, Integer value2) {
            addCriterion("xq_jf not between", value1, value2, "xq_jf");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andXq_bqIsNull() {
            addCriterion("xq_bq is null");
            return (Criteria) this;
        }

        public Criteria andXq_bqIsNotNull() {
            addCriterion("xq_bq is not null");
            return (Criteria) this;
        }

        public Criteria andXq_bqEqualTo(String value) {
            addCriterion("xq_bq =", value, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqNotEqualTo(String value) {
            addCriterion("xq_bq <>", value, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqGreaterThan(String value) {
            addCriterion("xq_bq >", value, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqGreaterThanOrEqualTo(String value) {
            addCriterion("xq_bq >=", value, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqLessThan(String value) {
            addCriterion("xq_bq <", value, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqLessThanOrEqualTo(String value) {
            addCriterion("xq_bq <=", value, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqLike(String value) {
            addCriterion("xq_bq like", value, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqNotLike(String value) {
            addCriterion("xq_bq not like", value, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqIn(List<String> values) {
            addCriterion("xq_bq in", values, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqNotIn(List<String> values) {
            addCriterion("xq_bq not in", values, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqBetween(String value1, String value2) {
            addCriterion("xq_bq between", value1, value2, "xq_bq");
            return (Criteria) this;
        }

        public Criteria andXq_bqNotBetween(String value1, String value2) {
            addCriterion("xq_bq not between", value1, value2, "xq_bq");
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