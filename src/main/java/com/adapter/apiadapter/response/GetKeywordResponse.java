package com.adapter.apiadapter.response;


public class GetKeywordResponse {



	private long keywordId;

	private int service_code;

	private String service_name;

	private int action;

	private String keyword;

	private String alias;

	private int operatorId;

	private String operator_name;

	private String short_code;

	private int package_code;

	private String package_name;


	public long getKeywordId() {
		return keywordId;
	}

	public void setKeywordId(long keywordId) {
		this.keywordId = keywordId;
	}

	public int getService_code() {
		return service_code;
	}

	public void setService_code(int service_code) {
		this.service_code = service_code;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperator_name() {
		return operator_name;
	}

	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}

	public String getShort_code() {
		return short_code;
	}

	public void setShort_code(String short_code) {
		this.short_code = short_code;
	}

	public int getPackage_code() {
		return package_code;
	}

	public void setPackage_code(int package_code) {
		this.package_code = package_code;
	}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
}
