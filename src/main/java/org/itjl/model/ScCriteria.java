package org.itjl.model;

import java.util.ArrayList;
import java.util.List;

public class ScCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScCriteria() {
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

        public Criteria andSc_idIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andSc_idIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andSc_idEqualTo(Integer value) {
            addCriterion("sc_id =", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotEqualTo(Integer value) {
            addCriterion("sc_id <>", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idGreaterThan(Integer value) {
            addCriterion("sc_id >", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_id >=", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idLessThan(Integer value) {
            addCriterion("sc_id <", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idLessThanOrEqualTo(Integer value) {
            addCriterion("sc_id <=", value, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idIn(List<Integer> values) {
            addCriterion("sc_id in", values, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotIn(List<Integer> values) {
            addCriterion("sc_id not in", values, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idBetween(Integer value1, Integer value2) {
            addCriterion("sc_id between", value1, value2, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_id not between", value1, value2, "sc_id");
            return (Criteria) this;
        }

        public Criteria andSc_lbIsNull() {
            addCriterion("sc_lb is null");
            return (Criteria) this;
        }

        public Criteria andSc_lbIsNotNull() {
            addCriterion("sc_lb is not null");
            return (Criteria) this;
        }

        public Criteria andSc_lbEqualTo(Integer value) {
            addCriterion("sc_lb =", value, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_lbNotEqualTo(Integer value) {
            addCriterion("sc_lb <>", value, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_lbGreaterThan(Integer value) {
            addCriterion("sc_lb >", value, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_lbGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_lb >=", value, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_lbLessThan(Integer value) {
            addCriterion("sc_lb <", value, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_lbLessThanOrEqualTo(Integer value) {
            addCriterion("sc_lb <=", value, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_lbIn(List<Integer> values) {
            addCriterion("sc_lb in", values, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_lbNotIn(List<Integer> values) {
            addCriterion("sc_lb not in", values, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_lbBetween(Integer value1, Integer value2) {
            addCriterion("sc_lb between", value1, value2, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_lbNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_lb not between", value1, value2, "sc_lb");
            return (Criteria) this;
        }

        public Criteria andSc_user_idIsNull() {
            addCriterion("sc_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSc_user_idIsNotNull() {
            addCriterion("sc_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSc_user_idEqualTo(Integer value) {
            addCriterion("sc_user_id =", value, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_user_idNotEqualTo(Integer value) {
            addCriterion("sc_user_id <>", value, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_user_idGreaterThan(Integer value) {
            addCriterion("sc_user_id >", value, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_user_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sc_user_id >=", value, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_user_idLessThan(Integer value) {
            addCriterion("sc_user_id <", value, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_user_idLessThanOrEqualTo(Integer value) {
            addCriterion("sc_user_id <=", value, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_user_idIn(List<Integer> values) {
            addCriterion("sc_user_id in", values, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_user_idNotIn(List<Integer> values) {
            addCriterion("sc_user_id not in", values, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_user_idBetween(Integer value1, Integer value2) {
            addCriterion("sc_user_id between", value1, value2, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_user_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sc_user_id not between", value1, value2, "sc_user_id");
            return (Criteria) this;
        }

        public Criteria andSc_nrIsNull() {
            addCriterion("sc_nr is null");
            return (Criteria) this;
        }

        public Criteria andSc_nrIsNotNull() {
            addCriterion("sc_nr is not null");
            return (Criteria) this;
        }

        public Criteria andSc_nrEqualTo(String value) {
            addCriterion("sc_nr =", value, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrNotEqualTo(String value) {
            addCriterion("sc_nr <>", value, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrGreaterThan(String value) {
            addCriterion("sc_nr >", value, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrGreaterThanOrEqualTo(String value) {
            addCriterion("sc_nr >=", value, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrLessThan(String value) {
            addCriterion("sc_nr <", value, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrLessThanOrEqualTo(String value) {
            addCriterion("sc_nr <=", value, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrLike(String value) {
            addCriterion("sc_nr like", value, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrNotLike(String value) {
            addCriterion("sc_nr not like", value, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrIn(List<String> values) {
            addCriterion("sc_nr in", values, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrNotIn(List<String> values) {
            addCriterion("sc_nr not in", values, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrBetween(String value1, String value2) {
            addCriterion("sc_nr between", value1, value2, "sc_nr");
            return (Criteria) this;
        }

        public Criteria andSc_nrNotBetween(String value1, String value2) {
            addCriterion("sc_nr not between", value1, value2, "sc_nr");
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