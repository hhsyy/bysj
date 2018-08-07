package org.itjl.model;

import java.util.ArrayList;
import java.util.List;

public class Zx_lbCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Zx_lbCriteria() {
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

        public Criteria andZx_lb_nameIsNull() {
            addCriterion("zx_lb_name is null");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameIsNotNull() {
            addCriterion("zx_lb_name is not null");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameEqualTo(String value) {
            addCriterion("zx_lb_name =", value, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameNotEqualTo(String value) {
            addCriterion("zx_lb_name <>", value, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameGreaterThan(String value) {
            addCriterion("zx_lb_name >", value, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameGreaterThanOrEqualTo(String value) {
            addCriterion("zx_lb_name >=", value, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameLessThan(String value) {
            addCriterion("zx_lb_name <", value, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameLessThanOrEqualTo(String value) {
            addCriterion("zx_lb_name <=", value, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameLike(String value) {
            addCriterion("zx_lb_name like", value, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameNotLike(String value) {
            addCriterion("zx_lb_name not like", value, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameIn(List<String> values) {
            addCriterion("zx_lb_name in", values, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameNotIn(List<String> values) {
            addCriterion("zx_lb_name not in", values, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameBetween(String value1, String value2) {
            addCriterion("zx_lb_name between", value1, value2, "zx_lb_name");
            return (Criteria) this;
        }

        public Criteria andZx_lb_nameNotBetween(String value1, String value2) {
            addCriterion("zx_lb_name not between", value1, value2, "zx_lb_name");
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