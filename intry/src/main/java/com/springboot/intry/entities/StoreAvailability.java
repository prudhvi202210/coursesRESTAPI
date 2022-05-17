package com.springboot.intry.entities;

import java.time.LocalTime;
import java.util.List;

public class StoreAvailability {

	
	private String locationID;
	private String Day;
	private LocalTime  cutOffTime;
	public StoreAvailability(String locationID, String day, LocalTime cutOffTime) {
		super();
		this.locationID = locationID;
		Day = day;
		this.cutOffTime = cutOffTime;
	}
	public StoreAvailability() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLocationID() {
		return locationID;
	}
	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}
	public String getDay() {
		return Day;
	}
	public void setDay(String day) {
		Day = day;
	}
	public LocalTime getCutOffTime() {
		return cutOffTime;
	}
	public void setCutOffTime(LocalTime cutOffTime) {
		this.cutOffTime = cutOffTime;
	}
	@Override
	public String toString() {
		return "StoreAvailability [locationID=" + locationID + ", Day=" + Day + ", cutOffTime=" + cutOffTime + "]";
	}

	
	
}
