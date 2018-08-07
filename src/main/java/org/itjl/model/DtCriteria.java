package org.itjl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DtCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DtCriteria() {
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

        public Criteria andDt_idIsNull() {
            addCriterion("dt_id is null");
            return (Criteria) this;
        }

        public Criteria andDt_idIsNotNull() {
            addCriterion("dt_id is not null");
            return (Criteria) this;
        }

        public Criteria andDt_idEqualTo(Integer value) {
            addCriterion("dt_id =", value, "dt_id");
            return (Criteria) this;
        }

        public Criteria andDt_idNotEqualTo(Integer value) {
            addCriterion("dt_id <>", value, "dt_id");
            return (Criteria) this;
        }

        public Criteria andDt_idGreaterThan(Integer value) {
            addCriterion("dt_id >", value, "dt_id");
            return (Criteria) this;
        }

        public Criteria andDt_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_id >=", value, "dt_id");
            return (Criteria) this;
        }

        public Criteria andDt_idLessThan(Integer value) {
            addCriterion("dt_id <", value, "dt_id");
            return (Criteria) this;
        }

        public Criteria andDt_idLessThanOrEqualTo(Integer value) {
            addCriterion("dt_id <=", value, "dt_id");
            return (Criteria) this;
        }

        public Criteria andDt_idIn(List<Integer> values) {
            addCriterion("dt_id in", values, "dt_id");
            return (Criteria) this;
        }

        public Criteria andDt_idNotIn(List<Integer> values) {
            addCriterion("dt_id not in", values, "dt_id");
            return (Criteria) this;
        }

        public Criteria andDt_idBetween(Integer value1, Integer value2) {
            addCriterion("dt_id between", value1, value2, "dt_id");
            return (Criteria) this;
        }

        public Criteria andDt_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_id not between", value1, value2, "dt_id");
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

        public Criteria andDt_nrIsNull() {
            addCriterion("dt_nr is null");
            return (Criteria) this;
        }

        public Criteria andDt_nrIsNotNull() {
            addCriterion("dt_nr is not null");
            return (Criteria) this;
        }

        public Criteria andDt_nrEqualTo(String value) {
            addCriterion("dt_nr =", value, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrNotEqualTo(String value) {
            addCriterion("dt_nr <>", value, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrGreaterThan(String value) {
            addCriterion("dt_nr >", value, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrGreaterThanOrEqualTo(String value) {
            addCriterion("dt_nr >=", value, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrLessThan(String value) {
            addCriterion("dt_nr <", value, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrLessThanOrEqualTo(String value) {
            addCriterion("dt_nr <=", value, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrLike(String value) {
            addCriterion("dt_nr like", value, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrNotLike(String value) {
            addCriterion("dt_nr not like", value, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrIn(List<String> values) {
            addCriterion("dt_nr in", values, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrNotIn(List<String> values) {
            addCriterion("dt_nr not in", values, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrBetween(String value1, String value2) {
            addCriterion("dt_nr between", value1, value2, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_nrNotBetween(String value1, String value2) {
            addCriterion("dt_nr not between", value1, value2, "dt_nr");
            return (Criteria) this;
        }

        public Criteria andDt_dzIsNull() {
            addCriterion("dt_dz is null");
            return (Criteria) this;
        }

        public Criteria andDt_dzIsNotNull() {
            addCriterion("dt_dz is not null");
            return (Criteria) this;
        }

        public Criteria andDt_dzEqualTo(Integer value) {
            addCriterion("dt_dz =", value, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_dzNotEqualTo(Integer value) {
            addCriterion("dt_dz <>", value, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_dzGreaterThan(Integer value) {
            addCriterion("dt_dz >", value, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_dzGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_dz >=", value, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_dzLessThan(Integer value) {
            addCriterion("dt_dz <", value, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_dzLessThanOrEqualTo(Integer value) {
            addCriterion("dt_dz <=", value, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_dzIn(List<Integer> values) {
            addCriterion("dt_dz in", values, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_dzNotIn(List<Integer> values) {
            addCriterion("dt_dz not in", values, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_dzBetween(Integer value1, Integer value2) {
            addCriterion("dt_dz between", value1, value2, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_dzNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_dz not between", value1, value2, "dt_dz");
            return (Criteria) this;
        }

        public Criteria andDt_cIsNull() {
            addCriterion("dt_c is null");
            return (Criteria) this;
        }

        public Criteria andDt_cIsNotNull() {
            addCriterion("dt_c is not null");
            return (Criteria) this;
        }

        public Criteria andDt_cEqualTo(Integer value) {
            addCriterion("dt_c =", value, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_cNotEqualTo(Integer value) {
            addCriterion("dt_c <>", value, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_cGreaterThan(Integer value) {
            addCriterion("dt_c >", value, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_cGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_c >=", value, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_cLessThan(Integer value) {
            addCriterion("dt_c <", value, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_cLessThanOrEqualTo(Integer value) {
            addCriterion("dt_c <=", value, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_cIn(List<Integer> values) {
            addCriterion("dt_c in", values, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_cNotIn(List<Integer> values) {
            addCriterion("dt_c not in", values, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_cBetween(Integer value1, Integer value2) {
            addCriterion("dt_c between", value1, value2, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_cNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_c not between", value1, value2, "dt_c");
            return (Criteria) this;
        }

        public Criteria andDt_tpIsNull() {
            addCriterion("dt_tp is null");
            return (Criteria) this;
        }

        public Criteria andDt_tpIsNotNull() {
            addCriterion("dt_tp is not null");
            return (Criteria) this;
        }

        public Criteria andDt_tpEqualTo(String value) {
            addCriterion("dt_tp =", value, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpNotEqualTo(String value) {
            addCriterion("dt_tp <>", value, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpGreaterThan(String value) {
            addCriterion("dt_tp >", value, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpGreaterThanOrEqualTo(String value) {
            addCriterion("dt_tp >=", value, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpLessThan(String value) {
            addCriterion("dt_tp <", value, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpLessThanOrEqualTo(String value) {
            addCriterion("dt_tp <=", value, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpLike(String value) {
            addCriterion("dt_tp like", value, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpNotLike(String value) {
            addCriterion("dt_tp not like", value, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpIn(List<String> values) {
            addCriterion("dt_tp in", values, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpNotIn(List<String> values) {
            addCriterion("dt_tp not in", values, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpBetween(String value1, String value2) {
            addCriterion("dt_tp between", value1, value2, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_tpNotBetween(String value1, String value2) {
            addCriterion("dt_tp not between", value1, value2, "dt_tp");
            return (Criteria) this;
        }

        public Criteria andDt_spIsNull() {
            addCriterion("dt_sp is null");
            return (Criteria) this;
        }

        public Criteria andDt_spIsNotNull() {
            addCriterion("dt_sp is not null");
            return (Criteria) this;
        }

        public Criteria andDt_spEqualTo(String value) {
            addCriterion("dt_sp =", value, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spNotEqualTo(String value) {
            addCriterion("dt_sp <>", value, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spGreaterThan(String value) {
            addCriterion("dt_sp >", value, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spGreaterThanOrEqualTo(String value) {
            addCriterion("dt_sp >=", value, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spLessThan(String value) {
            addCriterion("dt_sp <", value, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spLessThanOrEqualTo(String value) {
            addCriterion("dt_sp <=", value, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spLike(String value) {
            addCriterion("dt_sp like", value, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spNotLike(String value) {
            addCriterion("dt_sp not like", value, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spIn(List<String> values) {
            addCriterion("dt_sp in", values, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spNotIn(List<String> values) {
            addCriterion("dt_sp not in", values, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spBetween(String value1, String value2) {
            addCriterion("dt_sp between", value1, value2, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_spNotBetween(String value1, String value2) {
            addCriterion("dt_sp not between", value1, value2, "dt_sp");
            return (Criteria) this;
        }

        public Criteria andDt_dateIsNull() {
            addCriterion("dt_date is null");
            return (Criteria) this;
        }

        public Criteria andDt_dateIsNotNull() {
            addCriterion("dt_date is not null");
            return (Criteria) this;
        }

        public Criteria andDt_dateEqualTo(Date value) {
            addCriterionForJDBCDate("dt_date =", value, "dt_date");
            return (Criteria) this;
        }

        public Criteria andDt_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("dt_date <>", value, "dt_date");
            return (Criteria) this;
        }

        public Criteria andDt_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("dt_date >", value, "dt_date");
            return (Criteria) this;
        }

        public Criteria andDt_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_date >=", value, "dt_date");
            return (Criteria) this;
        }

        public Criteria andDt_dateLessThan(Date value) {
            addCriterionForJDBCDate("dt_date <", value, "dt_date");
            return (Criteria) this;
        }

        public Criteria andDt_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_date <=", value, "dt_date");
            return (Criteria) this;
        }

        public Criteria andDt_dateIn(List<Date> values) {
            addCriterionForJDBCDate("dt_date in", values, "dt_date");
            return (Criteria) this;
        }

        public Criteria andDt_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("dt_date not in", values, "dt_date");
            return (Criteria) this;
        }

        public Criteria andDt_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_date between", value1, value2, "dt_date");
            return (Criteria) this;
        }

        public Criteria andDt_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_date not between", value1, value2, "dt_date");
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