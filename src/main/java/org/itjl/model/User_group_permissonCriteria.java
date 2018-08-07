package org.itjl.model;

import java.util.ArrayList;
import java.util.List;

public class User_group_permissonCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public User_group_permissonCriteria() {
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

        public Criteria andUser_group_permisson_idIsNull() {
            addCriterion("user_group_permisson_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idIsNotNull() {
            addCriterion("user_group_permisson_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idEqualTo(Integer value) {
            addCriterion("user_group_permisson_id =", value, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idNotEqualTo(Integer value) {
            addCriterion("user_group_permisson_id <>", value, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idGreaterThan(Integer value) {
            addCriterion("user_group_permisson_id >", value, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_group_permisson_id >=", value, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idLessThan(Integer value) {
            addCriterion("user_group_permisson_id <", value, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_group_permisson_id <=", value, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idIn(List<Integer> values) {
            addCriterion("user_group_permisson_id in", values, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idNotIn(List<Integer> values) {
            addCriterion("user_group_permisson_id not in", values, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idBetween(Integer value1, Integer value2) {
            addCriterion("user_group_permisson_id between", value1, value2, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_group_permisson_id not between", value1, value2, "user_group_permisson_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameIsNull() {
            addCriterion("user_group_permisson_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameIsNotNull() {
            addCriterion("user_group_permisson_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameEqualTo(String value) {
            addCriterion("user_group_permisson_name =", value, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameNotEqualTo(String value) {
            addCriterion("user_group_permisson_name <>", value, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameGreaterThan(String value) {
            addCriterion("user_group_permisson_name >", value, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_permisson_name >=", value, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameLessThan(String value) {
            addCriterion("user_group_permisson_name <", value, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameLessThanOrEqualTo(String value) {
            addCriterion("user_group_permisson_name <=", value, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameLike(String value) {
            addCriterion("user_group_permisson_name like", value, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameNotLike(String value) {
            addCriterion("user_group_permisson_name not like", value, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameIn(List<String> values) {
            addCriterion("user_group_permisson_name in", values, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameNotIn(List<String> values) {
            addCriterion("user_group_permisson_name not in", values, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameBetween(String value1, String value2) {
            addCriterion("user_group_permisson_name between", value1, value2, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_permisson_nameNotBetween(String value1, String value2) {
            addCriterion("user_group_permisson_name not between", value1, value2, "user_group_permisson_name");
            return (Criteria) this;
        }

        public Criteria andUser_group_idIsNull() {
            addCriterion("user_group_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_group_idIsNotNull() {
            addCriterion("user_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_group_idEqualTo(Integer value) {
            addCriterion("user_group_id =", value, "user_group_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_idNotEqualTo(Integer value) {
            addCriterion("user_group_id <>", value, "user_group_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_idGreaterThan(Integer value) {
            addCriterion("user_group_id >", value, "user_group_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_group_id >=", value, "user_group_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_idLessThan(Integer value) {
            addCriterion("user_group_id <", value, "user_group_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_group_id <=", value, "user_group_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_idIn(List<Integer> values) {
            addCriterion("user_group_id in", values, "user_group_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_idNotIn(List<Integer> values) {
            addCriterion("user_group_id not in", values, "user_group_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_idBetween(Integer value1, Integer value2) {
            addCriterion("user_group_id between", value1, value2, "user_group_id");
            return (Criteria) this;
        }

        public Criteria andUser_group_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_group_id not between", value1, value2, "user_group_id");
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