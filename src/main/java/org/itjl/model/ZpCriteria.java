package org.itjl.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZpCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZpCriteria() {
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

        public Criteria andZp_idIsNull() {
            addCriterion("zp_id is null");
            return (Criteria) this;
        }

        public Criteria andZp_idIsNotNull() {
            addCriterion("zp_id is not null");
            return (Criteria) this;
        }

        public Criteria andZp_idEqualTo(Integer value) {
            addCriterion("zp_id =", value, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_idNotEqualTo(Integer value) {
            addCriterion("zp_id <>", value, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_idGreaterThan(Integer value) {
            addCriterion("zp_id >", value, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("zp_id >=", value, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_idLessThan(Integer value) {
            addCriterion("zp_id <", value, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_idLessThanOrEqualTo(Integer value) {
            addCriterion("zp_id <=", value, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_idIn(List<Integer> values) {
            addCriterion("zp_id in", values, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_idNotIn(List<Integer> values) {
            addCriterion("zp_id not in", values, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_idBetween(Integer value1, Integer value2) {
            addCriterion("zp_id between", value1, value2, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_idNotBetween(Integer value1, Integer value2) {
            addCriterion("zp_id not between", value1, value2, "zp_id");
            return (Criteria) this;
        }

        public Criteria andZp_btIsNull() {
            addCriterion("zp_bt is null");
            return (Criteria) this;
        }

        public Criteria andZp_btIsNotNull() {
            addCriterion("zp_bt is not null");
            return (Criteria) this;
        }

        public Criteria andZp_btEqualTo(String value) {
            addCriterion("zp_bt =", value, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btNotEqualTo(String value) {
            addCriterion("zp_bt <>", value, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btGreaterThan(String value) {
            addCriterion("zp_bt >", value, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btGreaterThanOrEqualTo(String value) {
            addCriterion("zp_bt >=", value, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btLessThan(String value) {
            addCriterion("zp_bt <", value, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btLessThanOrEqualTo(String value) {
            addCriterion("zp_bt <=", value, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btLike(String value) {
            addCriterion("zp_bt like", value, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btNotLike(String value) {
            addCriterion("zp_bt not like", value, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btIn(List<String> values) {
            addCriterion("zp_bt in", values, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btNotIn(List<String> values) {
            addCriterion("zp_bt not in", values, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btBetween(String value1, String value2) {
            addCriterion("zp_bt between", value1, value2, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_btNotBetween(String value1, String value2) {
            addCriterion("zp_bt not between", value1, value2, "zp_bt");
            return (Criteria) this;
        }

        public Criteria andZp_timeIsNull() {
            addCriterion("zp_time is null");
            return (Criteria) this;
        }

        public Criteria andZp_timeIsNotNull() {
            addCriterion("zp_time is not null");
            return (Criteria) this;
        }

        public Criteria andZp_timeEqualTo(Date value) {
            addCriterionForJDBCDate("zp_time =", value, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("zp_time <>", value, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("zp_time >", value, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zp_time >=", value, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_timeLessThan(Date value) {
            addCriterionForJDBCDate("zp_time <", value, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zp_time <=", value, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_timeIn(List<Date> values) {
            addCriterionForJDBCDate("zp_time in", values, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("zp_time not in", values, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zp_time between", value1, value2, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zp_time not between", value1, value2, "zp_time");
            return (Criteria) this;
        }

        public Criteria andZp_llIsNull() {
            addCriterion("zp_ll is null");
            return (Criteria) this;
        }

        public Criteria andZp_llIsNotNull() {
            addCriterion("zp_ll is not null");
            return (Criteria) this;
        }

        public Criteria andZp_llEqualTo(Integer value) {
            addCriterion("zp_ll =", value, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_llNotEqualTo(Integer value) {
            addCriterion("zp_ll <>", value, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_llGreaterThan(Integer value) {
            addCriterion("zp_ll >", value, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_llGreaterThanOrEqualTo(Integer value) {
            addCriterion("zp_ll >=", value, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_llLessThan(Integer value) {
            addCriterion("zp_ll <", value, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_llLessThanOrEqualTo(Integer value) {
            addCriterion("zp_ll <=", value, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_llIn(List<Integer> values) {
            addCriterion("zp_ll in", values, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_llNotIn(List<Integer> values) {
            addCriterion("zp_ll not in", values, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_llBetween(Integer value1, Integer value2) {
            addCriterion("zp_ll between", value1, value2, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_llNotBetween(Integer value1, Integer value2) {
            addCriterion("zp_ll not between", value1, value2, "zp_ll");
            return (Criteria) this;
        }

        public Criteria andZp_yltIsNull() {
            addCriterion("zp_ylt is null");
            return (Criteria) this;
        }

        public Criteria andZp_yltIsNotNull() {
            addCriterion("zp_ylt is not null");
            return (Criteria) this;
        }

        public Criteria andZp_yltEqualTo(String value) {
            addCriterion("zp_ylt =", value, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltNotEqualTo(String value) {
            addCriterion("zp_ylt <>", value, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltGreaterThan(String value) {
            addCriterion("zp_ylt >", value, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltGreaterThanOrEqualTo(String value) {
            addCriterion("zp_ylt >=", value, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltLessThan(String value) {
            addCriterion("zp_ylt <", value, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltLessThanOrEqualTo(String value) {
            addCriterion("zp_ylt <=", value, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltLike(String value) {
            addCriterion("zp_ylt like", value, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltNotLike(String value) {
            addCriterion("zp_ylt not like", value, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltIn(List<String> values) {
            addCriterion("zp_ylt in", values, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltNotIn(List<String> values) {
            addCriterion("zp_ylt not in", values, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltBetween(String value1, String value2) {
            addCriterion("zp_ylt between", value1, value2, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_yltNotBetween(String value1, String value2) {
            addCriterion("zp_ylt not between", value1, value2, "zp_ylt");
            return (Criteria) this;
        }

        public Criteria andZp_jfIsNull() {
            addCriterion("zp_jf is null");
            return (Criteria) this;
        }

        public Criteria andZp_jfIsNotNull() {
            addCriterion("zp_jf is not null");
            return (Criteria) this;
        }

        public Criteria andZp_jfEqualTo(Integer value) {
            addCriterion("zp_jf =", value, "zp_jf");
            return (Criteria) this;
        }

        public Criteria andZp_jfNotEqualTo(Integer value) {
            addCriterion("zp_jf <>", value, "zp_jf");
            return (Criteria) this;
        }

        public Criteria andZp_jfGreaterThan(Integer value) {
            addCriterion("zp_jf >", value, "zp_jf");
            return (Criteria) this;
        }

        public Criteria andZp_jfGreaterThanOrEqualTo(Integer value) {
            addCriterion("zp_jf >=", value, "zp_jf");
            return (Criteria) this;
        }

        public Criteria andZp_jfLessThan(Integer value) {
            addCriterion("zp_jf <", value, "zp_jf");
            return (Criteria) this;
        }

        public Criteria andZp_jfLessThanOrEqualTo(Integer value) {
            addCriterion("zp_jf <=", value, "zp_jf");
            return (Criteria) this;
        }

        public Criteria andZp_jfIn(List<Integer> values) {
            addCriterion("zp_jf in", values, "zp_jf");
            return (Criteria) this;
        }

        public Criteria andZp_jfNotIn(List<Integer> values) {
            addCriterion("zp_jf not in", values, "zp_jf");
            return (Criteria) this;
        }

        public Criteria andZp_jfBetween(Integer value1, Integer value2) {
            addCriterion("zp_jf between", value1, value2, "zp_jf");
            return (Criteria) this;
        }

        public Criteria andZp_jfNotBetween(Integer value1, Integer value2) {
            addCriterion("zp_jf not between", value1, value2, "zp_jf");
            return (Criteria) this;
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

        public Criteria andZp_tagIsNull() {
            addCriterion("zp_tag is null");
            return (Criteria) this;
        }

        public Criteria andZp_tagIsNotNull() {
            addCriterion("zp_tag is not null");
            return (Criteria) this;
        }

        public Criteria andZp_tagEqualTo(String value) {
            addCriterion("zp_tag =", value, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagNotEqualTo(String value) {
            addCriterion("zp_tag <>", value, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagGreaterThan(String value) {
            addCriterion("zp_tag >", value, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagGreaterThanOrEqualTo(String value) {
            addCriterion("zp_tag >=", value, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagLessThan(String value) {
            addCriterion("zp_tag <", value, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagLessThanOrEqualTo(String value) {
            addCriterion("zp_tag <=", value, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagLike(String value) {
            addCriterion("zp_tag like", value, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagNotLike(String value) {
            addCriterion("zp_tag not like", value, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagIn(List<String> values) {
            addCriterion("zp_tag in", values, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagNotIn(List<String> values) {
            addCriterion("zp_tag not in", values, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagBetween(String value1, String value2) {
            addCriterion("zp_tag between", value1, value2, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_tagNotBetween(String value1, String value2) {
            addCriterion("zp_tag not between", value1, value2, "zp_tag");
            return (Criteria) this;
        }

        public Criteria andZp_wjIsNull() {
            addCriterion("zp_wj is null");
            return (Criteria) this;
        }

        public Criteria andZp_wjIsNotNull() {
            addCriterion("zp_wj is not null");
            return (Criteria) this;
        }

        public Criteria andZp_wjEqualTo(String value) {
            addCriterion("zp_wj =", value, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjNotEqualTo(String value) {
            addCriterion("zp_wj <>", value, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjGreaterThan(String value) {
            addCriterion("zp_wj >", value, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjGreaterThanOrEqualTo(String value) {
            addCriterion("zp_wj >=", value, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjLessThan(String value) {
            addCriterion("zp_wj <", value, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjLessThanOrEqualTo(String value) {
            addCriterion("zp_wj <=", value, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjLike(String value) {
            addCriterion("zp_wj like", value, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjNotLike(String value) {
            addCriterion("zp_wj not like", value, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjIn(List<String> values) {
            addCriterion("zp_wj in", values, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjNotIn(List<String> values) {
            addCriterion("zp_wj not in", values, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjBetween(String value1, String value2) {
            addCriterion("zp_wj between", value1, value2, "zp_wj");
            return (Criteria) this;
        }

        public Criteria andZp_wjNotBetween(String value1, String value2) {
            addCriterion("zp_wj not between", value1, value2, "zp_wj");
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