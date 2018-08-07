package org.itjl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WdCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WdCriteria() {
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

        public Criteria andWd_idIsNull() {
            addCriterion("wd_id is null");
            return (Criteria) this;
        }

        public Criteria andWd_idIsNotNull() {
            addCriterion("wd_id is not null");
            return (Criteria) this;
        }

        public Criteria andWd_idEqualTo(Integer value) {
            addCriterion("wd_id =", value, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_idNotEqualTo(Integer value) {
            addCriterion("wd_id <>", value, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_idGreaterThan(Integer value) {
            addCriterion("wd_id >", value, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_id >=", value, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_idLessThan(Integer value) {
            addCriterion("wd_id <", value, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_idLessThanOrEqualTo(Integer value) {
            addCriterion("wd_id <=", value, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_idIn(List<Integer> values) {
            addCriterion("wd_id in", values, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_idNotIn(List<Integer> values) {
            addCriterion("wd_id not in", values, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_idBetween(Integer value1, Integer value2) {
            addCriterion("wd_id between", value1, value2, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_idNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_id not between", value1, value2, "wd_id");
            return (Criteria) this;
        }

        public Criteria andWd_btIsNull() {
            addCriterion("wd_bt is null");
            return (Criteria) this;
        }

        public Criteria andWd_btIsNotNull() {
            addCriterion("wd_bt is not null");
            return (Criteria) this;
        }

        public Criteria andWd_btEqualTo(String value) {
            addCriterion("wd_bt =", value, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btNotEqualTo(String value) {
            addCriterion("wd_bt <>", value, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btGreaterThan(String value) {
            addCriterion("wd_bt >", value, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btGreaterThanOrEqualTo(String value) {
            addCriterion("wd_bt >=", value, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btLessThan(String value) {
            addCriterion("wd_bt <", value, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btLessThanOrEqualTo(String value) {
            addCriterion("wd_bt <=", value, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btLike(String value) {
            addCriterion("wd_bt like", value, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btNotLike(String value) {
            addCriterion("wd_bt not like", value, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btIn(List<String> values) {
            addCriterion("wd_bt in", values, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btNotIn(List<String> values) {
            addCriterion("wd_bt not in", values, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btBetween(String value1, String value2) {
            addCriterion("wd_bt between", value1, value2, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_btNotBetween(String value1, String value2) {
            addCriterion("wd_bt not between", value1, value2, "wd_bt");
            return (Criteria) this;
        }

        public Criteria andWd_timeIsNull() {
            addCriterion("wd_time is null");
            return (Criteria) this;
        }

        public Criteria andWd_timeIsNotNull() {
            addCriterion("wd_time is not null");
            return (Criteria) this;
        }

        public Criteria andWd_timeEqualTo(Date value) {
            addCriterionForJDBCDate("wd_time =", value, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("wd_time <>", value, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("wd_time >", value, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("wd_time >=", value, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_timeLessThan(Date value) {
            addCriterionForJDBCDate("wd_time <", value, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("wd_time <=", value, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_timeIn(List<Date> values) {
            addCriterionForJDBCDate("wd_time in", values, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("wd_time not in", values, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("wd_time between", value1, value2, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("wd_time not between", value1, value2, "wd_time");
            return (Criteria) this;
        }

        public Criteria andWd_bqIsNull() {
            addCriterion("wd_bq is null");
            return (Criteria) this;
        }

        public Criteria andWd_bqIsNotNull() {
            addCriterion("wd_bq is not null");
            return (Criteria) this;
        }

        public Criteria andWd_bqEqualTo(String value) {
            addCriterion("wd_bq =", value, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqNotEqualTo(String value) {
            addCriterion("wd_bq <>", value, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqGreaterThan(String value) {
            addCriterion("wd_bq >", value, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqGreaterThanOrEqualTo(String value) {
            addCriterion("wd_bq >=", value, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqLessThan(String value) {
            addCriterion("wd_bq <", value, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqLessThanOrEqualTo(String value) {
            addCriterion("wd_bq <=", value, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqLike(String value) {
            addCriterion("wd_bq like", value, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqNotLike(String value) {
            addCriterion("wd_bq not like", value, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqIn(List<String> values) {
            addCriterion("wd_bq in", values, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqNotIn(List<String> values) {
            addCriterion("wd_bq not in", values, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqBetween(String value1, String value2) {
            addCriterion("wd_bq between", value1, value2, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_bqNotBetween(String value1, String value2) {
            addCriterion("wd_bq not between", value1, value2, "wd_bq");
            return (Criteria) this;
        }

        public Criteria andWd_llIsNull() {
            addCriterion("wd_ll is null");
            return (Criteria) this;
        }

        public Criteria andWd_llIsNotNull() {
            addCriterion("wd_ll is not null");
            return (Criteria) this;
        }

        public Criteria andWd_llEqualTo(Integer value) {
            addCriterion("wd_ll =", value, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_llNotEqualTo(Integer value) {
            addCriterion("wd_ll <>", value, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_llGreaterThan(Integer value) {
            addCriterion("wd_ll >", value, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_llGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_ll >=", value, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_llLessThan(Integer value) {
            addCriterion("wd_ll <", value, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_llLessThanOrEqualTo(Integer value) {
            addCriterion("wd_ll <=", value, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_llIn(List<Integer> values) {
            addCriterion("wd_ll in", values, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_llNotIn(List<Integer> values) {
            addCriterion("wd_ll not in", values, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_llBetween(Integer value1, Integer value2) {
            addCriterion("wd_ll between", value1, value2, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_llNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_ll not between", value1, value2, "wd_ll");
            return (Criteria) this;
        }

        public Criteria andWd_tpIsNull() {
            addCriterion("wd_tp is null");
            return (Criteria) this;
        }

        public Criteria andWd_tpIsNotNull() {
            addCriterion("wd_tp is not null");
            return (Criteria) this;
        }

        public Criteria andWd_tpEqualTo(String value) {
            addCriterion("wd_tp =", value, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpNotEqualTo(String value) {
            addCriterion("wd_tp <>", value, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpGreaterThan(String value) {
            addCriterion("wd_tp >", value, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpGreaterThanOrEqualTo(String value) {
            addCriterion("wd_tp >=", value, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpLessThan(String value) {
            addCriterion("wd_tp <", value, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpLessThanOrEqualTo(String value) {
            addCriterion("wd_tp <=", value, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpLike(String value) {
            addCriterion("wd_tp like", value, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpNotLike(String value) {
            addCriterion("wd_tp not like", value, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpIn(List<String> values) {
            addCriterion("wd_tp in", values, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpNotIn(List<String> values) {
            addCriterion("wd_tp not in", values, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpBetween(String value1, String value2) {
            addCriterion("wd_tp between", value1, value2, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_tpNotBetween(String value1, String value2) {
            addCriterion("wd_tp not between", value1, value2, "wd_tp");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idIsNull() {
            addCriterion("wd_fl_id is null");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idIsNotNull() {
            addCriterion("wd_fl_id is not null");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idEqualTo(Integer value) {
            addCriterion("wd_fl_id =", value, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idNotEqualTo(Integer value) {
            addCriterion("wd_fl_id <>", value, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idGreaterThan(Integer value) {
            addCriterion("wd_fl_id >", value, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_fl_id >=", value, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idLessThan(Integer value) {
            addCriterion("wd_fl_id <", value, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idLessThanOrEqualTo(Integer value) {
            addCriterion("wd_fl_id <=", value, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idIn(List<Integer> values) {
            addCriterion("wd_fl_id in", values, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idNotIn(List<Integer> values) {
            addCriterion("wd_fl_id not in", values, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idBetween(Integer value1, Integer value2) {
            addCriterion("wd_fl_id between", value1, value2, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_fl_idNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_fl_id not between", value1, value2, "wd_fl_id");
            return (Criteria) this;
        }

        public Criteria andWd_jfIsNull() {
            addCriterion("wd_jf is null");
            return (Criteria) this;
        }

        public Criteria andWd_jfIsNotNull() {
            addCriterion("wd_jf is not null");
            return (Criteria) this;
        }

        public Criteria andWd_jfEqualTo(Integer value) {
            addCriterion("wd_jf =", value, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_jfNotEqualTo(Integer value) {
            addCriterion("wd_jf <>", value, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_jfGreaterThan(Integer value) {
            addCriterion("wd_jf >", value, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_jfGreaterThanOrEqualTo(Integer value) {
            addCriterion("wd_jf >=", value, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_jfLessThan(Integer value) {
            addCriterion("wd_jf <", value, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_jfLessThanOrEqualTo(Integer value) {
            addCriterion("wd_jf <=", value, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_jfIn(List<Integer> values) {
            addCriterion("wd_jf in", values, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_jfNotIn(List<Integer> values) {
            addCriterion("wd_jf not in", values, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_jfBetween(Integer value1, Integer value2) {
            addCriterion("wd_jf between", value1, value2, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_jfNotBetween(Integer value1, Integer value2) {
            addCriterion("wd_jf not between", value1, value2, "wd_jf");
            return (Criteria) this;
        }

        public Criteria andWd_cnIsNull() {
            addCriterion("wd_cn is null");
            return (Criteria) this;
        }

        public Criteria andWd_cnIsNotNull() {
            addCriterion("wd_cn is not null");
            return (Criteria) this;
        }

        public Criteria andWd_cnEqualTo(String value) {
            addCriterion("wd_cn =", value, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnNotEqualTo(String value) {
            addCriterion("wd_cn <>", value, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnGreaterThan(String value) {
            addCriterion("wd_cn >", value, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnGreaterThanOrEqualTo(String value) {
            addCriterion("wd_cn >=", value, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnLessThan(String value) {
            addCriterion("wd_cn <", value, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnLessThanOrEqualTo(String value) {
            addCriterion("wd_cn <=", value, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnLike(String value) {
            addCriterion("wd_cn like", value, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnNotLike(String value) {
            addCriterion("wd_cn not like", value, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnIn(List<String> values) {
            addCriterion("wd_cn in", values, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnNotIn(List<String> values) {
            addCriterion("wd_cn not in", values, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnBetween(String value1, String value2) {
            addCriterion("wd_cn between", value1, value2, "wd_cn");
            return (Criteria) this;
        }

        public Criteria andWd_cnNotBetween(String value1, String value2) {
            addCriterion("wd_cn not between", value1, value2, "wd_cn");
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