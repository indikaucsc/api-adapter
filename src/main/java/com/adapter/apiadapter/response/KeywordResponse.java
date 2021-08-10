package com.adapter.apiadapter.response;


import java.util.ArrayList;
import java.util.List;

public class KeywordResponse {

	private int success_count;

	private String operator;

	private List<KeywordSubResponse> keyword_list = new ArrayList<KeywordSubResponse>();

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getSuccess_count() {
		return success_count;
	}

	public void setSuccess_count(int success_count) {
		this.success_count = success_count;
	}

	public List<KeywordSubResponse> getKeyword_list() {
		return keyword_list;
	}

	public void setKeyword_list(List<KeywordSubResponse> keyword_list) {
		this.keyword_list = keyword_list;
	}
}
