package org.itjl.model;

import java.util.ArrayList;
import java.util.List;

public class User_gzCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public User_gzCriteria() {
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

        public Criteria andUser_gz_idIsNull() {
            addCriterion("user_gz_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idIsNotNull() {
            addCriterion("user_gz_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idEqualTo(Integer value) {
            addCriterion("user_gz_id =", value, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idNotEqualTo(Integer value) {
            addCriterion("user_gz_id <>", value, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idGreaterThan(Integer value) {
            addCriterion("user_gz_id >", value, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_gz_id >=", value, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idLessThan(Integer value) {
            addCriterion("user_gz_id <", value, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_gz_id <=", value, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idIn(List<Integer> values) {
            addCriterion("user_gz_id in", values, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idNotIn(List<Integer> values) {
            addCriterion("user_gz_id not in", values, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idBetween(Integer value1, Integer value2) {
            addCriterion("user_gz_id between", value1, value2, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_gz_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_gz_id not between", value1, value2, "user_gz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idIsNull() {
            addCriterion("user_qgz_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idIsNotNull() {
            addCriterion("user_qgz_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idEqualTo(Integer value) {
            addCriterion("user_qgz_id =", value, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idNotEqualTo(Integer value) {
            addCriterion("user_qgz_id <>", value, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idGreaterThan(Integer value) {
            addCriterion("user_qgz_id >", value, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_qgz_id >=", value, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idLessThan(Integer value) {
            addCriterion("user_qgz_id <", value, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_qgz_id <=", value, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idIn(List<Integer> values) {
            addCriterion("user_qgz_id in", values, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idNotIn(List<Integer> values) {
            addCriterion("user_qgz_id not in", values, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idBetween(Integer value1, Integer value2) {
            addCriterion("user_qgz_id between", value1, value2, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_qgz_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_qgz_id not between", value1, value2, "user_qgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idIsNull() {
            addCriterion("user_bgz_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idIsNotNull() {
            addCriterion("user_bgz_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idEqualTo(Integer value) {
            addCriterion("user_bgz_id =", value, "user_bgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idNotEqualTo(Integer value) {
            addCriterion("user_bgz_id <>", value, "user_bgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idGreaterThan(Integer value) {
            addCriterion("user_bgz_id >", value, "user_bgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_bgz_id >=", value, "user_bgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idLessThan(Integer value) {
            addCriterion("user_bgz_id <", value, "user_bgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_bgz_id <=", value, "user_bgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idIn(List<Integer> values) {
            addCriterion("user_bgz_id in", values, "user_bgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idNotIn(List<Integer> values) {
            addCriterion("user_bgz_id not in", values, "user_bgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idBetween(Integer value1, Integer value2) {
            addCriterion("user_bgz_id between", value1, value2, "user_bgz_id");
            return (Criteria) this;
        }

        public Criteria andUser_bgz_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_bgz_id not between", value1, value2, "user_bgz_id");
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