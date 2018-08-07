package org.itjl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GroupgCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupgCriteria() {
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

        public Criteria andGroup_idIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroup_idIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_idEqualTo(Integer value) {
            addCriterion("group_id =", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idGreaterThan(Integer value) {
            addCriterion("group_id >", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idLessThan(Integer value) {
            addCriterion("group_id <", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idIn(List<Integer> values) {
            addCriterion("group_id in", values, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_idNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "group_id");
            return (Criteria) this;
        }

        public Criteria andGroup_nameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroup_nameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_nameEqualTo(String value) {
            addCriterion("group_name =", value, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameGreaterThan(String value) {
            addCriterion("group_name >", value, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameLessThan(String value) {
            addCriterion("group_name <", value, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameLike(String value) {
            addCriterion("group_name like", value, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameNotLike(String value) {
            addCriterion("group_name not like", value, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameIn(List<String> values) {
            addCriterion("group_name in", values, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_nameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "group_name");
            return (Criteria) this;
        }

        public Criteria andGroup_timeIsNull() {
            addCriterion("group_time is null");
            return (Criteria) this;
        }

        public Criteria andGroup_timeIsNotNull() {
            addCriterion("group_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_timeEqualTo(Date value) {
            addCriterionForJDBCDate("group_time =", value, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("group_time <>", value, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("group_time >", value, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("group_time >=", value, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_timeLessThan(Date value) {
            addCriterionForJDBCDate("group_time <", value, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("group_time <=", value, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_timeIn(List<Date> values) {
            addCriterionForJDBCDate("group_time in", values, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("group_time not in", values, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("group_time between", value1, value2, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("group_time not between", value1, value2, "group_time");
            return (Criteria) this;
        }

        public Criteria andGroup_msIsNull() {
            addCriterion("group_ms is null");
            return (Criteria) this;
        }

        public Criteria andGroup_msIsNotNull() {
            addCriterion("group_ms is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_msEqualTo(String value) {
            addCriterion("group_ms =", value, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msNotEqualTo(String value) {
            addCriterion("group_ms <>", value, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msGreaterThan(String value) {
            addCriterion("group_ms >", value, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msGreaterThanOrEqualTo(String value) {
            addCriterion("group_ms >=", value, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msLessThan(String value) {
            addCriterion("group_ms <", value, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msLessThanOrEqualTo(String value) {
            addCriterion("group_ms <=", value, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msLike(String value) {
            addCriterion("group_ms like", value, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msNotLike(String value) {
            addCriterion("group_ms not like", value, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msIn(List<String> values) {
            addCriterion("group_ms in", values, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msNotIn(List<String> values) {
            addCriterion("group_ms not in", values, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msBetween(String value1, String value2) {
            addCriterion("group_ms between", value1, value2, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_msNotBetween(String value1, String value2) {
            addCriterion("group_ms not between", value1, value2, "group_ms");
            return (Criteria) this;
        }

        public Criteria andGroup_wjIsNull() {
            addCriterion("group_wj is null");
            return (Criteria) this;
        }

        public Criteria andGroup_wjIsNotNull() {
            addCriterion("group_wj is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_wjEqualTo(String value) {
            addCriterion("group_wj =", value, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjNotEqualTo(String value) {
            addCriterion("group_wj <>", value, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjGreaterThan(String value) {
            addCriterion("group_wj >", value, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjGreaterThanOrEqualTo(String value) {
            addCriterion("group_wj >=", value, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjLessThan(String value) {
            addCriterion("group_wj <", value, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjLessThanOrEqualTo(String value) {
            addCriterion("group_wj <=", value, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjLike(String value) {
            addCriterion("group_wj like", value, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjNotLike(String value) {
            addCriterion("group_wj not like", value, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjIn(List<String> values) {
            addCriterion("group_wj in", values, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjNotIn(List<String> values) {
            addCriterion("group_wj not in", values, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjBetween(String value1, String value2) {
            addCriterion("group_wj between", value1, value2, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_wjNotBetween(String value1, String value2) {
            addCriterion("group_wj not between", value1, value2, "group_wj");
            return (Criteria) this;
        }

        public Criteria andGroup_ggIsNull() {
            addCriterion("group_gg is null");
            return (Criteria) this;
        }

        public Criteria andGroup_ggIsNotNull() {
            addCriterion("group_gg is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_ggEqualTo(String value) {
            addCriterion("group_gg =", value, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggNotEqualTo(String value) {
            addCriterion("group_gg <>", value, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggGreaterThan(String value) {
            addCriterion("group_gg >", value, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggGreaterThanOrEqualTo(String value) {
            addCriterion("group_gg >=", value, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggLessThan(String value) {
            addCriterion("group_gg <", value, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggLessThanOrEqualTo(String value) {
            addCriterion("group_gg <=", value, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggLike(String value) {
            addCriterion("group_gg like", value, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggNotLike(String value) {
            addCriterion("group_gg not like", value, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggIn(List<String> values) {
            addCriterion("group_gg in", values, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggNotIn(List<String> values) {
            addCriterion("group_gg not in", values, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggBetween(String value1, String value2) {
            addCriterion("group_gg between", value1, value2, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_ggNotBetween(String value1, String value2) {
            addCriterion("group_gg not between", value1, value2, "group_gg");
            return (Criteria) this;
        }

        public Criteria andGroup_lvIsNull() {
            addCriterion("group_lv is null");
            return (Criteria) this;
        }

        public Criteria andGroup_lvIsNotNull() {
            addCriterion("group_lv is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_lvEqualTo(Integer value) {
            addCriterion("group_lv =", value, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_lvNotEqualTo(Integer value) {
            addCriterion("group_lv <>", value, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_lvGreaterThan(Integer value) {
            addCriterion("group_lv >", value, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_lvGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_lv >=", value, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_lvLessThan(Integer value) {
            addCriterion("group_lv <", value, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_lvLessThanOrEqualTo(Integer value) {
            addCriterion("group_lv <=", value, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_lvIn(List<Integer> values) {
            addCriterion("group_lv in", values, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_lvNotIn(List<Integer> values) {
            addCriterion("group_lv not in", values, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_lvBetween(Integer value1, Integer value2) {
            addCriterion("group_lv between", value1, value2, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_lvNotBetween(Integer value1, Integer value2) {
            addCriterion("group_lv not between", value1, value2, "group_lv");
            return (Criteria) this;
        }

        public Criteria andGroup_bqIsNull() {
            addCriterion("group_bq is null");
            return (Criteria) this;
        }

        public Criteria andGroup_bqIsNotNull() {
            addCriterion("group_bq is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_bqEqualTo(String value) {
            addCriterion("group_bq =", value, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqNotEqualTo(String value) {
            addCriterion("group_bq <>", value, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqGreaterThan(String value) {
            addCriterion("group_bq >", value, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqGreaterThanOrEqualTo(String value) {
            addCriterion("group_bq >=", value, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqLessThan(String value) {
            addCriterion("group_bq <", value, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqLessThanOrEqualTo(String value) {
            addCriterion("group_bq <=", value, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqLike(String value) {
            addCriterion("group_bq like", value, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqNotLike(String value) {
            addCriterion("group_bq not like", value, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqIn(List<String> values) {
            addCriterion("group_bq in", values, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqNotIn(List<String> values) {
            addCriterion("group_bq not in", values, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqBetween(String value1, String value2) {
            addCriterion("group_bq between", value1, value2, "group_bq");
            return (Criteria) this;
        }

        public Criteria andGroup_bqNotBetween(String value1, String value2) {
            addCriterion("group_bq not between", value1, value2, "group_bq");
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

        public Criteria andGroup_jyIsNull() {
            addCriterion("group_jy is null");
            return (Criteria) this;
        }

        public Criteria andGroup_jyIsNotNull() {
            addCriterion("group_jy is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_jyEqualTo(Integer value) {
            addCriterion("group_jy =", value, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_jyNotEqualTo(Integer value) {
            addCriterion("group_jy <>", value, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_jyGreaterThan(Integer value) {
            addCriterion("group_jy >", value, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_jyGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_jy >=", value, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_jyLessThan(Integer value) {
            addCriterion("group_jy <", value, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_jyLessThanOrEqualTo(Integer value) {
            addCriterion("group_jy <=", value, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_jyIn(List<Integer> values) {
            addCriterion("group_jy in", values, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_jyNotIn(List<Integer> values) {
            addCriterion("group_jy not in", values, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_jyBetween(Integer value1, Integer value2) {
            addCriterion("group_jy between", value1, value2, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_jyNotBetween(Integer value1, Integer value2) {
            addCriterion("group_jy not between", value1, value2, "group_jy");
            return (Criteria) this;
        }

        public Criteria andGroup_tpIsNull() {
            addCriterion("group_tp is null");
            return (Criteria) this;
        }

        public Criteria andGroup_tpIsNotNull() {
            addCriterion("group_tp is not null");
            return (Criteria) this;
        }

        public Criteria andGroup_tpEqualTo(String value) {
            addCriterion("group_tp =", value, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpNotEqualTo(String value) {
            addCriterion("group_tp <>", value, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpGreaterThan(String value) {
            addCriterion("group_tp >", value, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpGreaterThanOrEqualTo(String value) {
            addCriterion("group_tp >=", value, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpLessThan(String value) {
            addCriterion("group_tp <", value, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpLessThanOrEqualTo(String value) {
            addCriterion("group_tp <=", value, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpLike(String value) {
            addCriterion("group_tp like", value, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpNotLike(String value) {
            addCriterion("group_tp not like", value, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpIn(List<String> values) {
            addCriterion("group_tp in", values, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpNotIn(List<String> values) {
            addCriterion("group_tp not in", values, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpBetween(String value1, String value2) {
            addCriterion("group_tp between", value1, value2, "group_tp");
            return (Criteria) this;
        }

        public Criteria andGroup_tpNotBetween(String value1, String value2) {
            addCriterion("group_tp not between", value1, value2, "group_tp");
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