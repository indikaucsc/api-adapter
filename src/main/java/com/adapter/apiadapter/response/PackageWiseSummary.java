package com.adapter.apiadapter.response;

public class PackageWiseSummary {

	
	private long package_id;
	private String package_name;
	private double sum_daily_revenue;
	
	
	
	public long getPackage_id() {
		return package_id;
	}
	public void setPackage_id(long package_id) {
		this.package_id = package_id;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public double getSum_daily_revenue() {
		return sum_daily_revenue;
	}
	public void setSum_daily_revenue(double sum_daily_revenue) {
		this.sum_daily_revenue = sum_daily_revenue;
	}
	
	public PackageWiseSummary(){
		
	}
	public PackageWiseSummary(long package_id, String package_name, double sum_daily_revenue){
		this.package_id = package_id;
		this.package_name = package_name;
		this.sum_daily_revenue = sum_daily_revenue;
	}

}
