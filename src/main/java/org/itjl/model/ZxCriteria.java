package org.itjl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZxCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZxCriteria() {
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

        public Criteria andZx_idIsNull() {
            addCriterion("zx_id is null");
            return (Criteria) this;
        }

        public Criteria andZx_idIsNotNull() {
            addCriterion("zx_id is not null");
            return (Criteria) this;
        }

        public Criteria andZx_idEqualTo(Integer value) {
            addCriterion("zx_id =", value, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_idNotEqualTo(Integer value) {
            addCriterion("zx_id <>", value, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_idGreaterThan(Integer value) {
            addCriterion("zx_id >", value, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("zx_id >=", value, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_idLessThan(Integer value) {
            addCriterion("zx_id <", value, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_idLessThanOrEqualTo(Integer value) {
            addCriterion("zx_id <=", value, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_idIn(List<Integer> values) {
            addCriterion("zx_id in", values, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_idNotIn(List<Integer> values) {
            addCriterion("zx_id not in", values, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_idBetween(Integer value1, Integer value2) {
            addCriterion("zx_id between", value1, value2, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_idNotBetween(Integer value1, Integer value2) {
            addCriterion("zx_id not between", value1, value2, "zx_id");
            return (Criteria) this;
        }

        public Criteria andZx_btIsNull() {
            addCriterion("zx_bt is null");
            return (Criteria) this;
        }

        public Criteria andZx_btIsNotNull() {
            addCriterion("zx_bt is not null");
            return (Criteria) this;
        }

        public Criteria andZx_btEqualTo(String value) {
            addCriterion("zx_bt =", value, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btNotEqualTo(String value) {
            addCriterion("zx_bt <>", value, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btGreaterThan(String value) {
            addCriterion("zx_bt >", value, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btGreaterThanOrEqualTo(String value) {
            addCriterion("zx_bt >=", value, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btLessThan(String value) {
            addCriterion("zx_bt <", value, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btLessThanOrEqualTo(String value) {
            addCriterion("zx_bt <=", value, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btLike(String value) {
            addCriterion("zx_bt like", value, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btNotLike(String value) {
            addCriterion("zx_bt not like", value, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btIn(List<String> values) {
            addCriterion("zx_bt in", values, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btNotIn(List<String> values) {
            addCriterion("zx_bt not in", values, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btBetween(String value1, String value2) {
            addCriterion("zx_bt between", value1, value2, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_btNotBetween(String value1, String value2) {
            addCriterion("zx_bt not between", value1, value2, "zx_bt");
            return (Criteria) this;
        }

        public Criteria andZx_dateIsNull() {
            addCriterion("zx_date is null");
            return (Criteria) this;
        }

        public Criteria andZx_dateIsNotNull() {
            addCriterion("zx_date is not null");
            return (Criteria) this;
        }

        public Criteria andZx_dateEqualTo(Date value) {
            addCriterionForJDBCDate("zx_date =", value, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("zx_date <>", value, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("zx_date >", value, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zx_date >=", value, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_dateLessThan(Date value) {
            addCriterionForJDBCDate("zx_date <", value, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zx_date <=", value, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_dateIn(List<Date> values) {
            addCriterionForJDBCDate("zx_date in", values, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("zx_date not in", values, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zx_date between", value1, value2, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zx_date not between", value1, value2, "zx_date");
            return (Criteria) this;
        }

        public Criteria andZx_llIsNull() {
            addCriterion("zx_ll is null");
            return (Criteria) this;
        }

        public Criteria andZx_llIsNotNull() {
            addCriterion("zx_ll is not null");
            return (Criteria) this;
        }

        public Criteria andZx_llEqualTo(Integer value) {
            addCriterion("zx_ll =", value, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_llNotEqualTo(Integer value) {
            addCriterion("zx_ll <>", value, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_llGreaterThan(Integer value) {
            addCriterion("zx_ll >", value, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_llGreaterThanOrEqualTo(Integer value) {
            addCriterion("zx_ll >=", value, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_llLessThan(Integer value) {
            addCriterion("zx_ll <", value, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_llLessThanOrEqualTo(Integer value) {
            addCriterion("zx_ll <=", value, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_llIn(List<Integer> values) {
            addCriterion("zx_ll in", values, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_llNotIn(List<Integer> values) {
            addCriterion("zx_ll not in", values, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_llBetween(Integer value1, Integer value2) {
            addCriterion("zx_ll between", value1, value2, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_llNotBetween(Integer value1, Integer value2) {
            addCriterion("zx_ll not between", value1, value2, "zx_ll");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idIsNull() {
            addCriterion("zx_lb_id is null");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idIsNotNull() {
            addCriterion("zx_lb_id is not null");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idEqualTo(Integer value) {
            addCriterion("zx_lb_id =", value, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idNotEqualTo(Integer value) {
            addCriterion("zx_lb_id <>", value, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idGreaterThan(Integer value) {
            addCriterion("zx_lb_id >", value, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("zx_lb_id >=", value, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idLessThan(Integer value) {
            addCriterion("zx_lb_id <", value, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idLessThanOrEqualTo(Integer value) {
            addCriterion("zx_lb_id <=", value, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idIn(List<Integer> values) {
            addCriterion("zx_lb_id in", values, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idNotIn(List<Integer> values) {
            addCriterion("zx_lb_id not in", values, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idBetween(Integer value1, Integer value2) {
            addCriterion("zx_lb_id between", value1, value2, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_lb_idNotBetween(Integer value1, Integer value2) {
            addCriterion("zx_lb_id not between", value1, value2, "zx_lb_id");
            return (Criteria) this;
        }

        public Criteria andZx_tpIsNull() {
            addCriterion("zx_tp is null");
            return (Criteria) this;
        }

        public Criteria andZx_tpIsNotNull() {
            addCriterion("zx_tp is not null");
            return (Criteria) this;
        }

        public Criteria andZx_tpEqualTo(String value) {
            addCriterion("zx_tp =", value, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpNotEqualTo(String value) {
            addCriterion("zx_tp <>", value, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpGreaterThan(String value) {
            addCriterion("zx_tp >", value, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpGreaterThanOrEqualTo(String value) {
            addCriterion("zx_tp >=", value, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpLessThan(String value) {
            addCriterion("zx_tp <", value, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpLessThanOrEqualTo(String value) {
            addCriterion("zx_tp <=", value, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpLike(String value) {
            addCriterion("zx_tp like", value, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpNotLike(String value) {
            addCriterion("zx_tp not like", value, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpIn(List<String> values) {
            addCriterion("zx_tp in", values, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpNotIn(List<String> values) {
            addCriterion("zx_tp not in", values, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpBetween(String value1, String value2) {
            addCriterion("zx_tp between", value1, value2, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_tpNotBetween(String value1, String value2) {
            addCriterion("zx_tp not between", value1, value2, "zx_tp");
            return (Criteria) this;
        }

        public Criteria andZx_bqIsNull() {
            addCriterion("zx_bq is null");
            return (Criteria) this;
        }

        public Criteria andZx_bqIsNotNull() {
            addCriterion("zx_bq is not null");
            return (Criteria) this;
        }

        public Criteria andZx_bqEqualTo(String value) {
            addCriterion("zx_bq =", value, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqNotEqualTo(String value) {
            addCriterion("zx_bq <>", value, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqGreaterThan(String value) {
            addCriterion("zx_bq >", value, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqGreaterThanOrEqualTo(String value) {
            addCriterion("zx_bq >=", value, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqLessThan(String value) {
            addCriterion("zx_bq <", value, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqLessThanOrEqualTo(String value) {
            addCriterion("zx_bq <=", value, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqLike(String value) {
            addCriterion("zx_bq like", value, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqNotLike(String value) {
            addCriterion("zx_bq not like", value, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqIn(List<String> values) {
            addCriterion("zx_bq in", values, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqNotIn(List<String> values) {
            addCriterion("zx_bq not in", values, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqBetween(String value1, String value2) {
            addCriterion("zx_bq between", value1, value2, "zx_bq");
            return (Criteria) this;
        }

        public Criteria andZx_bqNotBetween(String value1, String value2) {
            addCriterion("zx_bq not between", value1, value2, "zx_bq");
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