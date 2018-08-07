package org.itjl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FxCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FxCriteria() {
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

        public Criteria andFx_idIsNull() {
            addCriterion("fx_id is null");
            return (Criteria) this;
        }

        public Criteria andFx_idIsNotNull() {
            addCriterion("fx_id is not null");
            return (Criteria) this;
        }

        public Criteria andFx_idEqualTo(Integer value) {
            addCriterion("fx_id =", value, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_idNotEqualTo(Integer value) {
            addCriterion("fx_id <>", value, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_idGreaterThan(Integer value) {
            addCriterion("fx_id >", value, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("fx_id >=", value, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_idLessThan(Integer value) {
            addCriterion("fx_id <", value, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_idLessThanOrEqualTo(Integer value) {
            addCriterion("fx_id <=", value, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_idIn(List<Integer> values) {
            addCriterion("fx_id in", values, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_idNotIn(List<Integer> values) {
            addCriterion("fx_id not in", values, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_idBetween(Integer value1, Integer value2) {
            addCriterion("fx_id between", value1, value2, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_idNotBetween(Integer value1, Integer value2) {
            addCriterion("fx_id not between", value1, value2, "fx_id");
            return (Criteria) this;
        }

        public Criteria andFx_btIsNull() {
            addCriterion("fx_bt is null");
            return (Criteria) this;
        }

        public Criteria andFx_btIsNotNull() {
            addCriterion("fx_bt is not null");
            return (Criteria) this;
        }

        public Criteria andFx_btEqualTo(String value) {
            addCriterion("fx_bt =", value, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btNotEqualTo(String value) {
            addCriterion("fx_bt <>", value, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btGreaterThan(String value) {
            addCriterion("fx_bt >", value, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btGreaterThanOrEqualTo(String value) {
            addCriterion("fx_bt >=", value, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btLessThan(String value) {
            addCriterion("fx_bt <", value, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btLessThanOrEqualTo(String value) {
            addCriterion("fx_bt <=", value, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btLike(String value) {
            addCriterion("fx_bt like", value, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btNotLike(String value) {
            addCriterion("fx_bt not like", value, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btIn(List<String> values) {
            addCriterion("fx_bt in", values, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btNotIn(List<String> values) {
            addCriterion("fx_bt not in", values, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btBetween(String value1, String value2) {
            addCriterion("fx_bt between", value1, value2, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_btNotBetween(String value1, String value2) {
            addCriterion("fx_bt not between", value1, value2, "fx_bt");
            return (Criteria) this;
        }

        public Criteria andFx_dateIsNull() {
            addCriterion("fx_date is null");
            return (Criteria) this;
        }

        public Criteria andFx_dateIsNotNull() {
            addCriterion("fx_date is not null");
            return (Criteria) this;
        }

        public Criteria andFx_dateEqualTo(Date value) {
            addCriterionForJDBCDate("fx_date =", value, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fx_date <>", value, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("fx_date >", value, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fx_date >=", value, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_dateLessThan(Date value) {
            addCriterionForJDBCDate("fx_date <", value, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fx_date <=", value, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_dateIn(List<Date> values) {
            addCriterionForJDBCDate("fx_date in", values, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fx_date not in", values, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fx_date between", value1, value2, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fx_date not between", value1, value2, "fx_date");
            return (Criteria) this;
        }

        public Criteria andFx_xzlIsNull() {
            addCriterion("fx_xzl is null");
            return (Criteria) this;
        }

        public Criteria andFx_xzlIsNotNull() {
            addCriterion("fx_xzl is not null");
            return (Criteria) this;
        }

        public Criteria andFx_xzlEqualTo(Integer value) {
            addCriterion("fx_xzl =", value, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_xzlNotEqualTo(Integer value) {
            addCriterion("fx_xzl <>", value, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_xzlGreaterThan(Integer value) {
            addCriterion("fx_xzl >", value, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_xzlGreaterThanOrEqualTo(Integer value) {
            addCriterion("fx_xzl >=", value, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_xzlLessThan(Integer value) {
            addCriterion("fx_xzl <", value, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_xzlLessThanOrEqualTo(Integer value) {
            addCriterion("fx_xzl <=", value, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_xzlIn(List<Integer> values) {
            addCriterion("fx_xzl in", values, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_xzlNotIn(List<Integer> values) {
            addCriterion("fx_xzl not in", values, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_xzlBetween(Integer value1, Integer value2) {
            addCriterion("fx_xzl between", value1, value2, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_xzlNotBetween(Integer value1, Integer value2) {
            addCriterion("fx_xzl not between", value1, value2, "fx_xzl");
            return (Criteria) this;
        }

        public Criteria andFx_jfIsNull() {
            addCriterion("fx_jf is null");
            return (Criteria) this;
        }

        public Criteria andFx_jfIsNotNull() {
            addCriterion("fx_jf is not null");
            return (Criteria) this;
        }

        public Criteria andFx_jfEqualTo(Integer value) {
            addCriterion("fx_jf =", value, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_jfNotEqualTo(Integer value) {
            addCriterion("fx_jf <>", value, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_jfGreaterThan(Integer value) {
            addCriterion("fx_jf >", value, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_jfGreaterThanOrEqualTo(Integer value) {
            addCriterion("fx_jf >=", value, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_jfLessThan(Integer value) {
            addCriterion("fx_jf <", value, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_jfLessThanOrEqualTo(Integer value) {
            addCriterion("fx_jf <=", value, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_jfIn(List<Integer> values) {
            addCriterion("fx_jf in", values, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_jfNotIn(List<Integer> values) {
            addCriterion("fx_jf not in", values, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_jfBetween(Integer value1, Integer value2) {
            addCriterion("fx_jf between", value1, value2, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_jfNotBetween(Integer value1, Integer value2) {
            addCriterion("fx_jf not between", value1, value2, "fx_jf");
            return (Criteria) this;
        }

        public Criteria andFx_bqIsNull() {
            addCriterion("fx_bq is null");
            return (Criteria) this;
        }

        public Criteria andFx_bqIsNotNull() {
            addCriterion("fx_bq is not null");
            return (Criteria) this;
        }

        public Criteria andFx_bqEqualTo(String value) {
            addCriterion("fx_bq =", value, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqNotEqualTo(String value) {
            addCriterion("fx_bq <>", value, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqGreaterThan(String value) {
            addCriterion("fx_bq >", value, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqGreaterThanOrEqualTo(String value) {
            addCriterion("fx_bq >=", value, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqLessThan(String value) {
            addCriterion("fx_bq <", value, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqLessThanOrEqualTo(String value) {
            addCriterion("fx_bq <=", value, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqLike(String value) {
            addCriterion("fx_bq like", value, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqNotLike(String value) {
            addCriterion("fx_bq not like", value, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqIn(List<String> values) {
            addCriterion("fx_bq in", values, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqNotIn(List<String> values) {
            addCriterion("fx_bq not in", values, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqBetween(String value1, String value2) {
            addCriterion("fx_bq between", value1, value2, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_bqNotBetween(String value1, String value2) {
            addCriterion("fx_bq not between", value1, value2, "fx_bq");
            return (Criteria) this;
        }

        public Criteria andFx_tpIsNull() {
            addCriterion("fx_tp is null");
            return (Criteria) this;
        }

        public Criteria andFx_tpIsNotNull() {
            addCriterion("fx_tp is not null");
            return (Criteria) this;
        }

        public Criteria andFx_tpEqualTo(String value) {
            addCriterion("fx_tp =", value, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpNotEqualTo(String value) {
            addCriterion("fx_tp <>", value, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpGreaterThan(String value) {
            addCriterion("fx_tp >", value, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpGreaterThanOrEqualTo(String value) {
            addCriterion("fx_tp >=", value, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpLessThan(String value) {
            addCriterion("fx_tp <", value, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpLessThanOrEqualTo(String value) {
            addCriterion("fx_tp <=", value, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpLike(String value) {
            addCriterion("fx_tp like", value, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpNotLike(String value) {
            addCriterion("fx_tp not like", value, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpIn(List<String> values) {
            addCriterion("fx_tp in", values, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpNotIn(List<String> values) {
            addCriterion("fx_tp not in", values, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpBetween(String value1, String value2) {
            addCriterion("fx_tp between", value1, value2, "fx_tp");
            return (Criteria) this;
        }

        public Criteria andFx_tpNotBetween(String value1, String value2) {
            addCriterion("fx_tp not between", value1, value2, "fx_tp");
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

        public Criteria andFx_wjIsNull() {
            addCriterion("fx_wj is null");
            return (Criteria) this;
        }

        public Criteria andFx_wjIsNotNull() {
            addCriterion("fx_wj is not null");
            return (Criteria) this;
        }

        public Criteria andFx_wjEqualTo(String value) {
            addCriterion("fx_wj =", value, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjNotEqualTo(String value) {
            addCriterion("fx_wj <>", value, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjGreaterThan(String value) {
            addCriterion("fx_wj >", value, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjGreaterThanOrEqualTo(String value) {
            addCriterion("fx_wj >=", value, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjLessThan(String value) {
            addCriterion("fx_wj <", value, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjLessThanOrEqualTo(String value) {
            addCriterion("fx_wj <=", value, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjLike(String value) {
            addCriterion("fx_wj like", value, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjNotLike(String value) {
            addCriterion("fx_wj not like", value, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjIn(List<String> values) {
            addCriterion("fx_wj in", values, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjNotIn(List<String> values) {
            addCriterion("fx_wj not in", values, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjBetween(String value1, String value2) {
            addCriterion("fx_wj between", value1, value2, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_wjNotBetween(String value1, String value2) {
            addCriterion("fx_wj not between", value1, value2, "fx_wj");
            return (Criteria) this;
        }

        public Criteria andFx_msIsNull() {
            addCriterion("fx_ms is null");
            return (Criteria) this;
        }

        public Criteria andFx_msIsNotNull() {
            addCriterion("fx_ms is not null");
            return (Criteria) this;
        }

        public Criteria andFx_msEqualTo(String value) {
            addCriterion("fx_ms =", value, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msNotEqualTo(String value) {
            addCriterion("fx_ms <>", value, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msGreaterThan(String value) {
            addCriterion("fx_ms >", value, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msGreaterThanOrEqualTo(String value) {
            addCriterion("fx_ms >=", value, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msLessThan(String value) {
            addCriterion("fx_ms <", value, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msLessThanOrEqualTo(String value) {
            addCriterion("fx_ms <=", value, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msLike(String value) {
            addCriterion("fx_ms like", value, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msNotLike(String value) {
            addCriterion("fx_ms not like", value, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msIn(List<String> values) {
            addCriterion("fx_ms in", values, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msNotIn(List<String> values) {
            addCriterion("fx_ms not in", values, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msBetween(String value1, String value2) {
            addCriterion("fx_ms between", value1, value2, "fx_ms");
            return (Criteria) this;
        }

        public Criteria andFx_msNotBetween(String value1, String value2) {
            addCriterion("fx_ms not between", value1, value2, "fx_ms");
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