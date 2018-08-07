package org.itjl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BkCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BkCriteria() {
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

        public Criteria andBk_idIsNull() {
            addCriterion("bk_id is null");
            return (Criteria) this;
        }

        public Criteria andBk_idIsNotNull() {
            addCriterion("bk_id is not null");
            return (Criteria) this;
        }

        public Criteria andBk_idEqualTo(Integer value) {
            addCriterion("bk_id =", value, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_idNotEqualTo(Integer value) {
            addCriterion("bk_id <>", value, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_idGreaterThan(Integer value) {
            addCriterion("bk_id >", value, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("bk_id >=", value, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_idLessThan(Integer value) {
            addCriterion("bk_id <", value, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_idLessThanOrEqualTo(Integer value) {
            addCriterion("bk_id <=", value, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_idIn(List<Integer> values) {
            addCriterion("bk_id in", values, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_idNotIn(List<Integer> values) {
            addCriterion("bk_id not in", values, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_idBetween(Integer value1, Integer value2) {
            addCriterion("bk_id between", value1, value2, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_idNotBetween(Integer value1, Integer value2) {
            addCriterion("bk_id not between", value1, value2, "bk_id");
            return (Criteria) this;
        }

        public Criteria andBk_btIsNull() {
            addCriterion("bk_bt is null");
            return (Criteria) this;
        }

        public Criteria andBk_btIsNotNull() {
            addCriterion("bk_bt is not null");
            return (Criteria) this;
        }

        public Criteria andBk_btEqualTo(String value) {
            addCriterion("bk_bt =", value, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btNotEqualTo(String value) {
            addCriterion("bk_bt <>", value, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btGreaterThan(String value) {
            addCriterion("bk_bt >", value, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btGreaterThanOrEqualTo(String value) {
            addCriterion("bk_bt >=", value, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btLessThan(String value) {
            addCriterion("bk_bt <", value, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btLessThanOrEqualTo(String value) {
            addCriterion("bk_bt <=", value, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btLike(String value) {
            addCriterion("bk_bt like", value, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btNotLike(String value) {
            addCriterion("bk_bt not like", value, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btIn(List<String> values) {
            addCriterion("bk_bt in", values, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btNotIn(List<String> values) {
            addCriterion("bk_bt not in", values, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btBetween(String value1, String value2) {
            addCriterion("bk_bt between", value1, value2, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andBk_btNotBetween(String value1, String value2) {
            addCriterion("bk_bt not between", value1, value2, "bk_bt");
            return (Criteria) this;
        }

        public Criteria andLb_idIsNull() {
            addCriterion("lb_id is null");
            return (Criteria) this;
        }

        public Criteria andLb_idIsNotNull() {
            addCriterion("lb_id is not null");
            return (Criteria) this;
        }

        public Criteria andLb_idEqualTo(Integer value) {
            addCriterion("lb_id =", value, "lb_id");
            return (Criteria) this;
        }

        public Criteria andLb_idNotEqualTo(Integer value) {
            addCriterion("lb_id <>", value, "lb_id");
            return (Criteria) this;
        }

        public Criteria andLb_idGreaterThan(Integer value) {
            addCriterion("lb_id >", value, "lb_id");
            return (Criteria) this;
        }

        public Criteria andLb_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("lb_id >=", value, "lb_id");
            return (Criteria) this;
        }

        public Criteria andLb_idLessThan(Integer value) {
            addCriterion("lb_id <", value, "lb_id");
            return (Criteria) this;
        }

        public Criteria andLb_idLessThanOrEqualTo(Integer value) {
            addCriterion("lb_id <=", value, "lb_id");
            return (Criteria) this;
        }

        public Criteria andLb_idIn(List<Integer> values) {
            addCriterion("lb_id in", values, "lb_id");
            return (Criteria) this;
        }

        public Criteria andLb_idNotIn(List<Integer> values) {
            addCriterion("lb_id not in", values, "lb_id");
            return (Criteria) this;
        }

        public Criteria andLb_idBetween(Integer value1, Integer value2) {
            addCriterion("lb_id between", value1, value2, "lb_id");
            return (Criteria) this;
        }

        public Criteria andLb_idNotBetween(Integer value1, Integer value2) {
            addCriterion("lb_id not between", value1, value2, "lb_id");
            return (Criteria) this;
        }

        public Criteria andBk_dateIsNull() {
            addCriterion("bk_date is null");
            return (Criteria) this;
        }

        public Criteria andBk_dateIsNotNull() {
            addCriterion("bk_date is not null");
            return (Criteria) this;
        }

        public Criteria andBk_dateEqualTo(Date value) {
            addCriterionForJDBCDate("bk_date =", value, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bk_date <>", value, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("bk_date >", value, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bk_date >=", value, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_dateLessThan(Date value) {
            addCriterionForJDBCDate("bk_date <", value, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bk_date <=", value, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_dateIn(List<Date> values) {
            addCriterionForJDBCDate("bk_date in", values, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bk_date not in", values, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bk_date between", value1, value2, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bk_date not between", value1, value2, "bk_date");
            return (Criteria) this;
        }

        public Criteria andBk_llIsNull() {
            addCriterion("bk_ll is null");
            return (Criteria) this;
        }

        public Criteria andBk_llIsNotNull() {
            addCriterion("bk_ll is not null");
            return (Criteria) this;
        }

        public Criteria andBk_llEqualTo(Integer value) {
            addCriterion("bk_ll =", value, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_llNotEqualTo(Integer value) {
            addCriterion("bk_ll <>", value, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_llGreaterThan(Integer value) {
            addCriterion("bk_ll >", value, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_llGreaterThanOrEqualTo(Integer value) {
            addCriterion("bk_ll >=", value, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_llLessThan(Integer value) {
            addCriterion("bk_ll <", value, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_llLessThanOrEqualTo(Integer value) {
            addCriterion("bk_ll <=", value, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_llIn(List<Integer> values) {
            addCriterion("bk_ll in", values, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_llNotIn(List<Integer> values) {
            addCriterion("bk_ll not in", values, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_llBetween(Integer value1, Integer value2) {
            addCriterion("bk_ll between", value1, value2, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_llNotBetween(Integer value1, Integer value2) {
            addCriterion("bk_ll not between", value1, value2, "bk_ll");
            return (Criteria) this;
        }

        public Criteria andBk_tjlIsNull() {
            addCriterion("bk_tjl is null");
            return (Criteria) this;
        }

        public Criteria andBk_tjlIsNotNull() {
            addCriterion("bk_tjl is not null");
            return (Criteria) this;
        }

        public Criteria andBk_tjlEqualTo(Integer value) {
            addCriterion("bk_tjl =", value, "bk_tjl");
            return (Criteria) this;
        }

        public Criteria andBk_tjlNotEqualTo(Integer value) {
            addCriterion("bk_tjl <>", value, "bk_tjl");
            return (Criteria) this;
        }

        public Criteria andBk_tjlGreaterThan(Integer value) {
            addCriterion("bk_tjl >", value, "bk_tjl");
            return (Criteria) this;
        }

        public Criteria andBk_tjlGreaterThanOrEqualTo(Integer value) {
            addCriterion("bk_tjl >=", value, "bk_tjl");
            return (Criteria) this;
        }

        public Criteria andBk_tjlLessThan(Integer value) {
            addCriterion("bk_tjl <", value, "bk_tjl");
            return (Criteria) this;
        }

        public Criteria andBk_tjlLessThanOrEqualTo(Integer value) {
            addCriterion("bk_tjl <=", value, "bk_tjl");
            return (Criteria) this;
        }

        public Criteria andBk_tjlIn(List<Integer> values) {
            addCriterion("bk_tjl in", values, "bk_tjl");
            return (Criteria) this;
        }

        public Criteria andBk_tjlNotIn(List<Integer> values) {
            addCriterion("bk_tjl not in", values, "bk_tjl");
            return (Criteria) this;
        }

        public Criteria andBk_tjlBetween(Integer value1, Integer value2) {
            addCriterion("bk_tjl between", value1, value2, "bk_tjl");
            return (Criteria) this;
        }

        public Criteria andBk_tjlNotBetween(Integer value1, Integer value2) {
            addCriterion("bk_tjl not between", value1, value2, "bk_tjl");
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

        public Criteria andBk_ztIsNull() {
            addCriterion("bk_zt is null");
            return (Criteria) this;
        }

        public Criteria andBk_ztIsNotNull() {
            addCriterion("bk_zt is not null");
            return (Criteria) this;
        }

        public Criteria andBk_ztEqualTo(Integer value) {
            addCriterion("bk_zt =", value, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_ztNotEqualTo(Integer value) {
            addCriterion("bk_zt <>", value, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_ztGreaterThan(Integer value) {
            addCriterion("bk_zt >", value, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_ztGreaterThanOrEqualTo(Integer value) {
            addCriterion("bk_zt >=", value, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_ztLessThan(Integer value) {
            addCriterion("bk_zt <", value, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_ztLessThanOrEqualTo(Integer value) {
            addCriterion("bk_zt <=", value, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_ztIn(List<Integer> values) {
            addCriterion("bk_zt in", values, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_ztNotIn(List<Integer> values) {
            addCriterion("bk_zt not in", values, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_ztBetween(Integer value1, Integer value2) {
            addCriterion("bk_zt between", value1, value2, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_ztNotBetween(Integer value1, Integer value2) {
            addCriterion("bk_zt not between", value1, value2, "bk_zt");
            return (Criteria) this;
        }

        public Criteria andBk_bqIsNull() {
            addCriterion("bk_bq is null");
            return (Criteria) this;
        }

        public Criteria andBk_bqIsNotNull() {
            addCriterion("bk_bq is not null");
            return (Criteria) this;
        }

        public Criteria andBk_bqEqualTo(String value) {
            addCriterion("bk_bq =", value, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqNotEqualTo(String value) {
            addCriterion("bk_bq <>", value, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqGreaterThan(String value) {
            addCriterion("bk_bq >", value, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqGreaterThanOrEqualTo(String value) {
            addCriterion("bk_bq >=", value, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqLessThan(String value) {
            addCriterion("bk_bq <", value, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqLessThanOrEqualTo(String value) {
            addCriterion("bk_bq <=", value, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqLike(String value) {
            addCriterion("bk_bq like", value, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqNotLike(String value) {
            addCriterion("bk_bq not like", value, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqIn(List<String> values) {
            addCriterion("bk_bq in", values, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqNotIn(List<String> values) {
            addCriterion("bk_bq not in", values, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqBetween(String value1, String value2) {
            addCriterion("bk_bq between", value1, value2, "bk_bq");
            return (Criteria) this;
        }

        public Criteria andBk_bqNotBetween(String value1, String value2) {
            addCriterion("bk_bq not between", value1, value2, "bk_bq");
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