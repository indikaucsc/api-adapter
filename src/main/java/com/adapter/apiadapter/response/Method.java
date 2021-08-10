package com.adapter.apiadapter.response;


public class Method {

	private long id;
	private String name;
	
	
	public Method(long id,String name){
		this.id = id;
		this.name = name;
	}
	
	public Method(){
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
