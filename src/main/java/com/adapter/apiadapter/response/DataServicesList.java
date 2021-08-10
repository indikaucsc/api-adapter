package com.adapter.apiadapter.response;

import java.util.ArrayList;
import java.util.List;

public class DataServicesList{

	private List<ServiceRes> service_list = new ArrayList<ServiceRes>();

	public List<ServiceRes> getServiceList() {
		return service_list;
	}

	public void setServiceList(List<ServiceRes> serviceList) {
		this.service_list = serviceList;
	}

}
