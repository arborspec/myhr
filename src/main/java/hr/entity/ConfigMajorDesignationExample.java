package hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ConfigMajorDesignationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigMajorDesignationExample() {
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

        public Criteria andDesIdIsNull() {
            addCriterion("des_id is null");
            return (Criteria) this;
        }

        public Criteria andDesIdIsNotNull() {
            addCriterion("des_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesIdEqualTo(Integer value) {
            addCriterion("des_id =", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdNotEqualTo(Integer value) {
            addCriterion("des_id <>", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdGreaterThan(Integer value) {
            addCriterion("des_id >", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_id >=", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdLessThan(Integer value) {
            addCriterion("des_id <", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdLessThanOrEqualTo(Integer value) {
            addCriterion("des_id <=", value, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdIn(List<Integer> values) {
            addCriterion("des_id in", values, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdNotIn(List<Integer> values) {
            addCriterion("des_id not in", values, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdBetween(Integer value1, Integer value2) {
            addCriterion("des_id between", value1, value2, "desId");
            return (Criteria) this;
        }

        public Criteria andDesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("des_id not between", value1, value2, "desId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdIsNull() {
            addCriterion("des_ffk_id is null");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdIsNotNull() {
            addCriterion("des_ffk_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdEqualTo(Integer value) {
            addCriterion("des_ffk_id =", value, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdNotEqualTo(Integer value) {
            addCriterion("des_ffk_id <>", value, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdGreaterThan(Integer value) {
            addCriterion("des_ffk_id >", value, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_ffk_id >=", value, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdLessThan(Integer value) {
            addCriterion("des_ffk_id <", value, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdLessThanOrEqualTo(Integer value) {
            addCriterion("des_ffk_id <=", value, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdIn(List<Integer> values) {
            addCriterion("des_ffk_id in", values, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdNotIn(List<Integer> values) {
            addCriterion("des_ffk_id not in", values, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdBetween(Integer value1, Integer value2) {
            addCriterion("des_ffk_id between", value1, value2, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFfkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("des_ffk_id not between", value1, value2, "desFfkId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdIsNull() {
            addCriterion("des_fsk_id is null");
            return (Criteria) this;
        }

        public Criteria andDesFskIdIsNotNull() {
            addCriterion("des_fsk_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesFskIdEqualTo(Integer value) {
            addCriterion("des_fsk_id =", value, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdNotEqualTo(Integer value) {
            addCriterion("des_fsk_id <>", value, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdGreaterThan(Integer value) {
            addCriterion("des_fsk_id >", value, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_fsk_id >=", value, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdLessThan(Integer value) {
            addCriterion("des_fsk_id <", value, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdLessThanOrEqualTo(Integer value) {
            addCriterion("des_fsk_id <=", value, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdIn(List<Integer> values) {
            addCriterion("des_fsk_id in", values, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdNotIn(List<Integer> values) {
            addCriterion("des_fsk_id not in", values, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdBetween(Integer value1, Integer value2) {
            addCriterion("des_fsk_id between", value1, value2, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("des_fsk_id not between", value1, value2, "desFskId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdIsNull() {
            addCriterion("des_ftk_id is null");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdIsNotNull() {
            addCriterion("des_ftk_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdEqualTo(Integer value) {
            addCriterion("des_ftk_id =", value, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdNotEqualTo(Integer value) {
            addCriterion("des_ftk_id <>", value, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdGreaterThan(Integer value) {
            addCriterion("des_ftk_id >", value, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_ftk_id >=", value, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdLessThan(Integer value) {
            addCriterion("des_ftk_id <", value, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdLessThanOrEqualTo(Integer value) {
            addCriterion("des_ftk_id <=", value, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdIn(List<Integer> values) {
            addCriterion("des_ftk_id in", values, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdNotIn(List<Integer> values) {
            addCriterion("des_ftk_id not in", values, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdBetween(Integer value1, Integer value2) {
            addCriterion("des_ftk_id between", value1, value2, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesFtkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("des_ftk_id not between", value1, value2, "desFtkId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdIsNull() {
            addCriterion("des_rec_id is null");
            return (Criteria) this;
        }

        public Criteria andDesRecIdIsNotNull() {
            addCriterion("des_rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesRecIdEqualTo(Integer value) {
            addCriterion("des_rec_id =", value, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdNotEqualTo(Integer value) {
            addCriterion("des_rec_id <>", value, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdGreaterThan(Integer value) {
            addCriterion("des_rec_id >", value, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_rec_id >=", value, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdLessThan(Integer value) {
            addCriterion("des_rec_id <", value, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("des_rec_id <=", value, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdIn(List<Integer> values) {
            addCriterion("des_rec_id in", values, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdNotIn(List<Integer> values) {
            addCriterion("des_rec_id not in", values, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdBetween(Integer value1, Integer value2) {
            addCriterion("des_rec_id between", value1, value2, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("des_rec_id not between", value1, value2, "desRecId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdIsNull() {
            addCriterion("des_mfk_id is null");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdIsNotNull() {
            addCriterion("des_mfk_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdEqualTo(Integer value) {
            addCriterion("des_mfk_id =", value, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdNotEqualTo(Integer value) {
            addCriterion("des_mfk_id <>", value, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdGreaterThan(Integer value) {
            addCriterion("des_mfk_id >", value, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_mfk_id >=", value, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdLessThan(Integer value) {
            addCriterion("des_mfk_id <", value, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdLessThanOrEqualTo(Integer value) {
            addCriterion("des_mfk_id <=", value, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdIn(List<Integer> values) {
            addCriterion("des_mfk_id in", values, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdNotIn(List<Integer> values) {
            addCriterion("des_mfk_id not in", values, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdBetween(Integer value1, Integer value2) {
            addCriterion("des_mfk_id between", value1, value2, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMfkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("des_mfk_id not between", value1, value2, "desMfkId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdIsNull() {
            addCriterion("des_mak_id is null");
            return (Criteria) this;
        }

        public Criteria andDesMakIdIsNotNull() {
            addCriterion("des_mak_id is not null");
            return (Criteria) this;
        }

        public Criteria andDesMakIdEqualTo(Integer value) {
            addCriterion("des_mak_id =", value, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdNotEqualTo(Integer value) {
            addCriterion("des_mak_id <>", value, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdGreaterThan(Integer value) {
            addCriterion("des_mak_id >", value, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_mak_id >=", value, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdLessThan(Integer value) {
            addCriterion("des_mak_id <", value, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdLessThanOrEqualTo(Integer value) {
            addCriterion("des_mak_id <=", value, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdIn(List<Integer> values) {
            addCriterion("des_mak_id in", values, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdNotIn(List<Integer> values) {
            addCriterion("des_mak_id not in", values, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdBetween(Integer value1, Integer value2) {
            addCriterion("des_mak_id between", value1, value2, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesMakIdNotBetween(Integer value1, Integer value2) {
            addCriterion("des_mak_id not between", value1, value2, "desMakId");
            return (Criteria) this;
        }

        public Criteria andDesNumIsNull() {
            addCriterion("des_num is null");
            return (Criteria) this;
        }

        public Criteria andDesNumIsNotNull() {
            addCriterion("des_num is not null");
            return (Criteria) this;
        }

        public Criteria andDesNumEqualTo(Integer value) {
            addCriterion("des_num =", value, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesNumNotEqualTo(Integer value) {
            addCriterion("des_num <>", value, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesNumGreaterThan(Integer value) {
            addCriterion("des_num >", value, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("des_num >=", value, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesNumLessThan(Integer value) {
            addCriterion("des_num <", value, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesNumLessThanOrEqualTo(Integer value) {
            addCriterion("des_num <=", value, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesNumIn(List<Integer> values) {
            addCriterion("des_num in", values, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesNumNotIn(List<Integer> values) {
            addCriterion("des_num not in", values, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesNumBetween(Integer value1, Integer value2) {
            addCriterion("des_num between", value1, value2, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesNumNotBetween(Integer value1, Integer value2) {
            addCriterion("des_num not between", value1, value2, "desNum");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateIsNull() {
            addCriterion("des_expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateIsNotNull() {
            addCriterion("des_expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateEqualTo(Date value) {
            addCriterionForJDBCDate("des_expiration_date =", value, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("des_expiration_date <>", value, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("des_expiration_date >", value, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("des_expiration_date >=", value, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateLessThan(Date value) {
            addCriterionForJDBCDate("des_expiration_date <", value, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("des_expiration_date <=", value, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateIn(List<Date> values) {
            addCriterionForJDBCDate("des_expiration_date in", values, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("des_expiration_date not in", values, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("des_expiration_date between", value1, value2, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesExpirationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("des_expiration_date not between", value1, value2, "desExpirationDate");
            return (Criteria) this;
        }

        public Criteria andDesUserIsNull() {
            addCriterion("des_user is null");
            return (Criteria) this;
        }

        public Criteria andDesUserIsNotNull() {
            addCriterion("des_user is not null");
            return (Criteria) this;
        }

        public Criteria andDesUserEqualTo(String value) {
            addCriterion("des_user =", value, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserNotEqualTo(String value) {
            addCriterion("des_user <>", value, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserGreaterThan(String value) {
            addCriterion("des_user >", value, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserGreaterThanOrEqualTo(String value) {
            addCriterion("des_user >=", value, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserLessThan(String value) {
            addCriterion("des_user <", value, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserLessThanOrEqualTo(String value) {
            addCriterion("des_user <=", value, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserLike(String value) {
            addCriterion("des_user like", value, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserNotLike(String value) {
            addCriterion("des_user not like", value, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserIn(List<String> values) {
            addCriterion("des_user in", values, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserNotIn(List<String> values) {
            addCriterion("des_user not in", values, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserBetween(String value1, String value2) {
            addCriterion("des_user between", value1, value2, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesUserNotBetween(String value1, String value2) {
            addCriterion("des_user not between", value1, value2, "desUser");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateIsNull() {
            addCriterion("des_record_date is null");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateIsNotNull() {
            addCriterion("des_record_date is not null");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateEqualTo(Date value) {
            addCriterionForJDBCDate("des_record_date =", value, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("des_record_date <>", value, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateGreaterThan(Date value) {
            addCriterionForJDBCDate("des_record_date >", value, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("des_record_date >=", value, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateLessThan(Date value) {
            addCriterionForJDBCDate("des_record_date <", value, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("des_record_date <=", value, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateIn(List<Date> values) {
            addCriterionForJDBCDate("des_record_date in", values, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("des_record_date not in", values, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("des_record_date between", value1, value2, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesRecordDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("des_record_date not between", value1, value2, "desRecordDate");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionIsNull() {
            addCriterion("des_description is null");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionIsNotNull() {
            addCriterion("des_description is not null");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionEqualTo(String value) {
            addCriterion("des_description =", value, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionNotEqualTo(String value) {
            addCriterion("des_description <>", value, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionGreaterThan(String value) {
            addCriterion("des_description >", value, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("des_description >=", value, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionLessThan(String value) {
            addCriterion("des_description <", value, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionLessThanOrEqualTo(String value) {
            addCriterion("des_description <=", value, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionLike(String value) {
            addCriterion("des_description like", value, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionNotLike(String value) {
            addCriterion("des_description not like", value, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionIn(List<String> values) {
            addCriterion("des_description in", values, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionNotIn(List<String> values) {
            addCriterion("des_description not in", values, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionBetween(String value1, String value2) {
            addCriterion("des_description between", value1, value2, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesDescriptionNotBetween(String value1, String value2) {
            addCriterion("des_description not between", value1, value2, "desDescription");
            return (Criteria) this;
        }

        public Criteria andDesRequireIsNull() {
            addCriterion("des_require is null");
            return (Criteria) this;
        }

        public Criteria andDesRequireIsNotNull() {
            addCriterion("des_require is not null");
            return (Criteria) this;
        }

        public Criteria andDesRequireEqualTo(String value) {
            addCriterion("des_require =", value, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireNotEqualTo(String value) {
            addCriterion("des_require <>", value, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireGreaterThan(String value) {
            addCriterion("des_require >", value, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireGreaterThanOrEqualTo(String value) {
            addCriterion("des_require >=", value, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireLessThan(String value) {
            addCriterion("des_require <", value, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireLessThanOrEqualTo(String value) {
            addCriterion("des_require <=", value, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireLike(String value) {
            addCriterion("des_require like", value, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireNotLike(String value) {
            addCriterion("des_require not like", value, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireIn(List<String> values) {
            addCriterion("des_require in", values, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireNotIn(List<String> values) {
            addCriterion("des_require not in", values, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireBetween(String value1, String value2) {
            addCriterion("des_require between", value1, value2, "desRequire");
            return (Criteria) this;
        }

        public Criteria andDesRequireNotBetween(String value1, String value2) {
            addCriterion("des_require not between", value1, value2, "desRequire");
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