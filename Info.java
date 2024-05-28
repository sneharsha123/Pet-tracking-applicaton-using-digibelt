package com.xvitcoder.dogtracer.beans;

public class Info {
	private String lat1;
	private String lng1;
	
	private String id;

	public String getLat1() {
		return lat1;
	}

	public void setLat1(String lat1) {
		this.lat1 = lat1;
	}

	public String getLng1() {
		return lng1;
	}

	public void setLng1(String lng1) {
		this.lng1 = lng1;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Info [lat1=" + lat1 + ", lng1=" + lng1 + ", id=" + id + "]";
	}

	
	
}