package com.adapter.apiadapter.response;

public class OperatorWiseSubscriptionSummary {

	
	private long operator_id;
	private String operator_name;
	private long count_subscription;
	
	public OperatorWiseSubscriptionSummary(long operator_id, String operator_name, long count_subscription){
		this.operator_id = operator_id;
		this.operator_name = operator_name;
		this.count_subscription = count_subscription;
	}

	public long getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(long operator_id) {
		this.operator_id = operator_id;
	}

	public String getOperator_name() {
		return operator_name;
	}

	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}

	public long getCount_subscription() {
		return count_subscription;
	}

	public void setCount_subscription(long count_subscription) {
		this.count_subscription = count_subscription;
	}

}
