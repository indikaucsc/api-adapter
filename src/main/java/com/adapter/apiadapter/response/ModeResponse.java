package com.adapter.apiadapter.response;


public class ModeResponse {

	private long id;
	private String name;
//	private boolean has_access;
	
	
	public ModeResponse(long id,String name){
		this.id = id;
		this.name = name;
//		this.has_access = hasAccess;
	}
	
	public ModeResponse(){
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	


}
