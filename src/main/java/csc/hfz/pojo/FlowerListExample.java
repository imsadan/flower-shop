package csc.hfz.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlowerListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlowerListExample() {
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

        public Criteria andFloweridIsNull() {
            addCriterion("flowerid is null");
            return (Criteria) this;
        }

        public Criteria andFloweridIsNotNull() {
            addCriterion("flowerid is not null");
            return (Criteria) this;
        }

        public Criteria andFloweridEqualTo(Integer value) {
            addCriterion("flowerid =", value, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFloweridNotEqualTo(Integer value) {
            addCriterion("flowerid <>", value, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFloweridGreaterThan(Integer value) {
            addCriterion("flowerid >", value, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFloweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("flowerid >=", value, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFloweridLessThan(Integer value) {
            addCriterion("flowerid <", value, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFloweridLessThanOrEqualTo(Integer value) {
            addCriterion("flowerid <=", value, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFloweridIn(List<Integer> values) {
            addCriterion("flowerid in", values, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFloweridNotIn(List<Integer> values) {
            addCriterion("flowerid not in", values, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFloweridBetween(Integer value1, Integer value2) {
            addCriterion("flowerid between", value1, value2, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFloweridNotBetween(Integer value1, Integer value2) {
            addCriterion("flowerid not between", value1, value2, "flowerid");
            return (Criteria) this;
        }

        public Criteria andFlowernameIsNull() {
            addCriterion("flowername is null");
            return (Criteria) this;
        }

        public Criteria andFlowernameIsNotNull() {
            addCriterion("flowername is not null");
            return (Criteria) this;
        }

        public Criteria andFlowernameEqualTo(String value) {
            addCriterion("flowername =", value, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameNotEqualTo(String value) {
            addCriterion("flowername <>", value, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameGreaterThan(String value) {
            addCriterion("flowername >", value, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameGreaterThanOrEqualTo(String value) {
            addCriterion("flowername >=", value, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameLessThan(String value) {
            addCriterion("flowername <", value, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameLessThanOrEqualTo(String value) {
            addCriterion("flowername <=", value, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameLike(String value) {
            addCriterion("flowername like", value, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameNotLike(String value) {
            addCriterion("flowername not like", value, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameIn(List<String> values) {
            addCriterion("flowername in", values, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameNotIn(List<String> values) {
            addCriterion("flowername not in", values, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameBetween(String value1, String value2) {
            addCriterion("flowername between", value1, value2, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowernameNotBetween(String value1, String value2) {
            addCriterion("flowername not between", value1, value2, "flowername");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageIsNull() {
            addCriterion("flowerlanguage is null");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageIsNotNull() {
            addCriterion("flowerlanguage is not null");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageEqualTo(String value) {
            addCriterion("flowerlanguage =", value, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageNotEqualTo(String value) {
            addCriterion("flowerlanguage <>", value, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageGreaterThan(String value) {
            addCriterion("flowerlanguage >", value, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageGreaterThanOrEqualTo(String value) {
            addCriterion("flowerlanguage >=", value, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageLessThan(String value) {
            addCriterion("flowerlanguage <", value, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageLessThanOrEqualTo(String value) {
            addCriterion("flowerlanguage <=", value, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageLike(String value) {
            addCriterion("flowerlanguage like", value, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageNotLike(String value) {
            addCriterion("flowerlanguage not like", value, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageIn(List<String> values) {
            addCriterion("flowerlanguage in", values, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageNotIn(List<String> values) {
            addCriterion("flowerlanguage not in", values, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageBetween(String value1, String value2) {
            addCriterion("flowerlanguage between", value1, value2, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerlanguageNotBetween(String value1, String value2) {
            addCriterion("flowerlanguage not between", value1, value2, "flowerlanguage");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceIsNull() {
            addCriterion("flowerprice is null");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceIsNotNull() {
            addCriterion("flowerprice is not null");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceEqualTo(Double value) {
            addCriterion("flowerprice =", value, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceNotEqualTo(Double value) {
            addCriterion("flowerprice <>", value, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceGreaterThan(Double value) {
            addCriterion("flowerprice >", value, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("flowerprice >=", value, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceLessThan(Double value) {
            addCriterion("flowerprice <", value, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceLessThanOrEqualTo(Double value) {
            addCriterion("flowerprice <=", value, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceIn(List<Double> values) {
            addCriterion("flowerprice in", values, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceNotIn(List<Double> values) {
            addCriterion("flowerprice not in", values, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceBetween(Double value1, Double value2) {
            addCriterion("flowerprice between", value1, value2, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andFlowerpriceNotBetween(Double value1, Double value2) {
            addCriterion("flowerprice not between", value1, value2, "flowerprice");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
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