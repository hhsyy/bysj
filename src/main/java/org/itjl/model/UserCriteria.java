package org.itjl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCriteria() {
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

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordEqualTo(String value) {
            addCriterion("user_password =", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThan(String value) {
            addCriterion("user_password >", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThan(String value) {
            addCriterion("user_password <", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLike(String value) {
            addCriterion("user_password like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotLike(String value) {
            addCriterion("user_password not like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIn(List<String> values) {
            addCriterion("user_password in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_txIsNull() {
            addCriterion("user_tx is null");
            return (Criteria) this;
        }

        public Criteria andUser_txIsNotNull() {
            addCriterion("user_tx is not null");
            return (Criteria) this;
        }

        public Criteria andUser_txEqualTo(String value) {
            addCriterion("user_tx =", value, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txNotEqualTo(String value) {
            addCriterion("user_tx <>", value, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txGreaterThan(String value) {
            addCriterion("user_tx >", value, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txGreaterThanOrEqualTo(String value) {
            addCriterion("user_tx >=", value, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txLessThan(String value) {
            addCriterion("user_tx <", value, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txLessThanOrEqualTo(String value) {
            addCriterion("user_tx <=", value, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txLike(String value) {
            addCriterion("user_tx like", value, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txNotLike(String value) {
            addCriterion("user_tx not like", value, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txIn(List<String> values) {
            addCriterion("user_tx in", values, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txNotIn(List<String> values) {
            addCriterion("user_tx not in", values, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txBetween(String value1, String value2) {
            addCriterion("user_tx between", value1, value2, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_txNotBetween(String value1, String value2) {
            addCriterion("user_tx not between", value1, value2, "user_tx");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmIsNull() {
            addCriterion("user_gxqm is null");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmIsNotNull() {
            addCriterion("user_gxqm is not null");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmEqualTo(String value) {
            addCriterion("user_gxqm =", value, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmNotEqualTo(String value) {
            addCriterion("user_gxqm <>", value, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmGreaterThan(String value) {
            addCriterion("user_gxqm >", value, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmGreaterThanOrEqualTo(String value) {
            addCriterion("user_gxqm >=", value, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmLessThan(String value) {
            addCriterion("user_gxqm <", value, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmLessThanOrEqualTo(String value) {
            addCriterion("user_gxqm <=", value, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmLike(String value) {
            addCriterion("user_gxqm like", value, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmNotLike(String value) {
            addCriterion("user_gxqm not like", value, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmIn(List<String> values) {
            addCriterion("user_gxqm in", values, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmNotIn(List<String> values) {
            addCriterion("user_gxqm not in", values, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmBetween(String value1, String value2) {
            addCriterion("user_gxqm between", value1, value2, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_gxqmNotBetween(String value1, String value2) {
            addCriterion("user_gxqm not between", value1, value2, "user_gxqm");
            return (Criteria) this;
        }

        public Criteria andUser_dateIsNull() {
            addCriterion("user_date is null");
            return (Criteria) this;
        }

        public Criteria andUser_dateIsNotNull() {
            addCriterion("user_date is not null");
            return (Criteria) this;
        }

        public Criteria andUser_dateEqualTo(Date value) {
            addCriterionForJDBCDate("user_date =", value, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_date <>", value, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_date >", value, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_date >=", value, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_dateLessThan(Date value) {
            addCriterionForJDBCDate("user_date <", value, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_date <=", value, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_dateIn(List<Date> values) {
            addCriterionForJDBCDate("user_date in", values, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_date not in", values, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_date between", value1, value2, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_date not between", value1, value2, "user_date");
            return (Criteria) this;
        }

        public Criteria andUser_jyIsNull() {
            addCriterion("user_jy is null");
            return (Criteria) this;
        }

        public Criteria andUser_jyIsNotNull() {
            addCriterion("user_jy is not null");
            return (Criteria) this;
        }

        public Criteria andUser_jyEqualTo(Integer value) {
            addCriterion("user_jy =", value, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_jyNotEqualTo(Integer value) {
            addCriterion("user_jy <>", value, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_jyGreaterThan(Integer value) {
            addCriterion("user_jy >", value, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_jyGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_jy >=", value, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_jyLessThan(Integer value) {
            addCriterion("user_jy <", value, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_jyLessThanOrEqualTo(Integer value) {
            addCriterion("user_jy <=", value, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_jyIn(List<Integer> values) {
            addCriterion("user_jy in", values, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_jyNotIn(List<Integer> values) {
            addCriterion("user_jy not in", values, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_jyBetween(Integer value1, Integer value2) {
            addCriterion("user_jy between", value1, value2, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_jyNotBetween(Integer value1, Integer value2) {
            addCriterion("user_jy not between", value1, value2, "user_jy");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idIsNull() {
            addCriterion("user_lv_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idIsNotNull() {
            addCriterion("user_lv_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idEqualTo(Integer value) {
            addCriterion("user_lv_id =", value, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idNotEqualTo(Integer value) {
            addCriterion("user_lv_id <>", value, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idGreaterThan(Integer value) {
            addCriterion("user_lv_id >", value, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_lv_id >=", value, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idLessThan(Integer value) {
            addCriterion("user_lv_id <", value, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_lv_id <=", value, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idIn(List<Integer> values) {
            addCriterion("user_lv_id in", values, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idNotIn(List<Integer> values) {
            addCriterion("user_lv_id not in", values, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idBetween(Integer value1, Integer value2) {
            addCriterion("user_lv_id between", value1, value2, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andUser_lv_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_lv_id not between", value1, value2, "user_lv_id");
            return (Criteria) this;
        }

        public Criteria andCh_idIsNull() {
            addCriterion("ch_id is null");
            return (Criteria) this;
        }

        public Criteria andCh_idIsNotNull() {
            addCriterion("ch_id is not null");
            return (Criteria) this;
        }

        public Criteria andCh_idEqualTo(String value) {
            addCriterion("ch_id =", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idNotEqualTo(String value) {
            addCriterion("ch_id <>", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idGreaterThan(String value) {
            addCriterion("ch_id >", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idGreaterThanOrEqualTo(String value) {
            addCriterion("ch_id >=", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idLessThan(String value) {
            addCriterion("ch_id <", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idLessThanOrEqualTo(String value) {
            addCriterion("ch_id <=", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idLike(String value) {
            addCriterion("ch_id like", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idNotLike(String value) {
            addCriterion("ch_id not like", value, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idIn(List<String> values) {
            addCriterion("ch_id in", values, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idNotIn(List<String> values) {
            addCriterion("ch_id not in", values, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idBetween(String value1, String value2) {
            addCriterion("ch_id between", value1, value2, "ch_id");
            return (Criteria) this;
        }

        public Criteria andCh_idNotBetween(String value1, String value2) {
            addCriterion("ch_id not between", value1, value2, "ch_id");
            return (Criteria) this;
        }

        public Criteria andSex_idIsNull() {
            addCriterion("sex_id is null");
            return (Criteria) this;
        }

        public Criteria andSex_idIsNotNull() {
            addCriterion("sex_id is not null");
            return (Criteria) this;
        }

        public Criteria andSex_idEqualTo(Integer value) {
            addCriterion("sex_id =", value, "sex_id");
            return (Criteria) this;
        }

        public Criteria andSex_idNotEqualTo(Integer value) {
            addCriterion("sex_id <>", value, "sex_id");
            return (Criteria) this;
        }

        public Criteria andSex_idGreaterThan(Integer value) {
            addCriterion("sex_id >", value, "sex_id");
            return (Criteria) this;
        }

        public Criteria andSex_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex_id >=", value, "sex_id");
            return (Criteria) this;
        }

        public Criteria andSex_idLessThan(Integer value) {
            addCriterion("sex_id <", value, "sex_id");
            return (Criteria) this;
        }

        public Criteria andSex_idLessThanOrEqualTo(Integer value) {
            addCriterion("sex_id <=", value, "sex_id");
            return (Criteria) this;
        }

        public Criteria andSex_idIn(List<Integer> values) {
            addCriterion("sex_id in", values, "sex_id");
            return (Criteria) this;
        }

        public Criteria andSex_idNotIn(List<Integer> values) {
            addCriterion("sex_id not in", values, "sex_id");
            return (Criteria) this;
        }

        public Criteria andSex_idBetween(Integer value1, Integer value2) {
            addCriterion("sex_id between", value1, value2, "sex_id");
            return (Criteria) this;
        }

        public Criteria andSex_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sex_id not between", value1, value2, "sex_id");
            return (Criteria) this;
        }

        public Criteria andUser_tagIsNull() {
            addCriterion("user_tag is null");
            return (Criteria) this;
        }

        public Criteria andUser_tagIsNotNull() {
            addCriterion("user_tag is not null");
            return (Criteria) this;
        }

        public Criteria andUser_tagEqualTo(String value) {
            addCriterion("user_tag =", value, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagNotEqualTo(String value) {
            addCriterion("user_tag <>", value, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagGreaterThan(String value) {
            addCriterion("user_tag >", value, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagGreaterThanOrEqualTo(String value) {
            addCriterion("user_tag >=", value, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagLessThan(String value) {
            addCriterion("user_tag <", value, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagLessThanOrEqualTo(String value) {
            addCriterion("user_tag <=", value, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagLike(String value) {
            addCriterion("user_tag like", value, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagNotLike(String value) {
            addCriterion("user_tag not like", value, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagIn(List<String> values) {
            addCriterion("user_tag in", values, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagNotIn(List<String> values) {
            addCriterion("user_tag not in", values, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagBetween(String value1, String value2) {
            addCriterion("user_tag between", value1, value2, "user_tag");
            return (Criteria) this;
        }

        public Criteria andUser_tagNotBetween(String value1, String value2) {
            addCriterion("user_tag not between", value1, value2, "user_tag");
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