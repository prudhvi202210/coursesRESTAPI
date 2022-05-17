package com.springboot.intry.services;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.intry.entities.StoreAvailability;
@Service
public class StoreAvailabilityImpl implements StoreAvailabilityInt {

	List<StoreAvailability> calendar;
	
	public StoreAvailabilityImpl(){
		calendar = new ArrayList<>();
		calendar.add(new StoreAvailability("STORE001", "ALL", LocalTime.parse("13:30")));
		calendar.add(new StoreAvailability("STORE002", "SUNDAY",  LocalTime.parse("13:30")));
		calendar.add(new StoreAvailability("STORE003", "MONDAY", LocalTime.parse("13:30")));
	}
	
	
	@Override
	public List<StoreAvailability> storeAvail() {
		// TODO Auto-generated method stub
		return calendar;
	}

}
