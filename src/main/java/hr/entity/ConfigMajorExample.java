package hr.entity;

import java.util.ArrayList;
import java.util.List;

public class ConfigMajorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigMajorExample() {
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

        public Criteria andMakIdIsNull() {
            addCriterion("mak_id is null");
            return (Criteria) this;
        }

        public Criteria andMakIdIsNotNull() {
            addCriterion("mak_id is not null");
            return (Criteria) this;
        }

        public Criteria andMakIdEqualTo(Integer value) {
            addCriterion("mak_id =", value, "makId");
            return (Criteria) this;
        }

        public Criteria andMakIdNotEqualTo(Integer value) {
            addCriterion("mak_id <>", value, "makId");
            return (Criteria) this;
        }

        public Criteria andMakIdGreaterThan(Integer value) {
            addCriterion("mak_id >", value, "makId");
            return (Criteria) this;
        }

        public Criteria andMakIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mak_id >=", value, "makId");
            return (Criteria) this;
        }

        public Criteria andMakIdLessThan(Integer value) {
            addCriterion("mak_id <", value, "makId");
            return (Criteria) this;
        }

        public Criteria andMakIdLessThanOrEqualTo(Integer value) {
            addCriterion("mak_id <=", value, "makId");
            return (Criteria) this;
        }

        public Criteria andMakIdIn(List<Integer> values) {
            addCriterion("mak_id in", values, "makId");
            return (Criteria) this;
        }

        public Criteria andMakIdNotIn(List<Integer> values) {
            addCriterion("mak_id not in", values, "makId");
            return (Criteria) this;
        }

        public Criteria andMakIdBetween(Integer value1, Integer value2) {
            addCriterion("mak_id between", value1, value2, "makId");
            return (Criteria) this;
        }

        public Criteria andMakIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mak_id not between", value1, value2, "makId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdIsNull() {
            addCriterion("major_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdIsNotNull() {
            addCriterion("major_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdEqualTo(String value) {
            addCriterion("major_kind_id =", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotEqualTo(String value) {
            addCriterion("major_kind_id <>", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdGreaterThan(String value) {
            addCriterion("major_kind_id >", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_kind_id >=", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdLessThan(String value) {
            addCriterion("major_kind_id <", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdLessThanOrEqualTo(String value) {
            addCriterion("major_kind_id <=", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdLike(String value) {
            addCriterion("major_kind_id like", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotLike(String value) {
            addCriterion("major_kind_id not like", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdIn(List<String> values) {
            addCriterion("major_kind_id in", values, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotIn(List<String> values) {
            addCriterion("major_kind_id not in", values, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdBetween(String value1, String value2) {
            addCriterion("major_kind_id between", value1, value2, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotBetween(String value1, String value2) {
            addCriterion("major_kind_id not between", value1, value2, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameIsNull() {
            addCriterion("major_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameIsNotNull() {
            addCriterion("major_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameEqualTo(String value) {
            addCriterion("major_kind_name =", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotEqualTo(String value) {
            addCriterion("major_kind_name <>", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameGreaterThan(String value) {
            addCriterion("major_kind_name >", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_kind_name >=", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameLessThan(String value) {
            addCriterion("major_kind_name <", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameLessThanOrEqualTo(String value) {
            addCriterion("major_kind_name <=", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameLike(String value) {
            addCriterion("major_kind_name like", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotLike(String value) {
            addCriterion("major_kind_name not like", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameIn(List<String> values) {
            addCriterion("major_kind_name in", values, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotIn(List<String> values) {
            addCriterion("major_kind_name not in", values, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameBetween(String value1, String value2) {
            addCriterion("major_kind_name between", value1, value2, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotBetween(String value1, String value2) {
            addCriterion("major_kind_name not between", value1, value2, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(String value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(String value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(String value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(String value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(String value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLike(String value) {
            addCriterion("major_id like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotLike(String value) {
            addCriterion("major_id not like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<String> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<String> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(String value1, String value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(String value1, String value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andTestAmountIsNull() {
            addCriterion("test_amount is null");
            return (Criteria) this;
        }

        public Criteria andTestAmountIsNotNull() {
            addCriterion("test_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTestAmountEqualTo(Short value) {
            addCriterion("test_amount =", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountNotEqualTo(Short value) {
            addCriterion("test_amount <>", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountGreaterThan(Short value) {
            addCriterion("test_amount >", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("test_amount >=", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountLessThan(Short value) {
            addCriterion("test_amount <", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountLessThanOrEqualTo(Short value) {
            addCriterion("test_amount <=", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountIn(List<Short> values) {
            addCriterion("test_amount in", values, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountNotIn(List<Short> values) {
            addCriterion("test_amount not in", values, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountBetween(Short value1, Short value2) {
            addCriterion("test_amount between", value1, value2, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountNotBetween(Short value1, Short value2) {
            addCriterion("test_amount not between", value1, value2, "testAmount");
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