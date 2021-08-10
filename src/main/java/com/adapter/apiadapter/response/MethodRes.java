package com.adapter.apiadapter.response;


public class MethodRes {

	private long id;
	private String name;
	private boolean has_access;
	
	
	public MethodRes(long id,String name, boolean hasAccess){
		this.id = id;
		this.name = name;
		this.has_access = hasAccess;
	}
	
	public MethodRes(){
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

	public boolean isHas_access() {
		return has_access;
	}

	public void setHas_access(boolean has_access) {
		this.has_access = has_access;
	}
	
	


}
