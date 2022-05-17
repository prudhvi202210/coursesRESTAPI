package com.springboot.intry.controller;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.springboot.intry.entities.StoreAvailability;
import com.springboot.intry.services.StoreAvailabilityInt;
import org.json.simple.JSONValue;    
@RestController
public class AppController {
	
	@Autowired
	public StoreAvailabilityInt storeAvailability;
	
	@GetMapping("/findStoreAvailability")
	public String home(){
		return  this.storeAvailability.storeAvail().toString();
		
	}
		
//	@PostMapping(value = "/postbody", consumes = { MediaType.APPLICATION_JSON_VALUE,
//			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
//					MediaType.APPLICATION_XML_VALUE })
//	public String postBody(@RequestBody String inputBody) throws JSONException {
//		
//		List<StoreAvailability> calendar = this.storeAvailability.storeAvail();
//		Object obj=JSONValue.parse(inputBody);  
//		JSONObject jsonObject = (JSONObject) obj;  
//		return jsonObject.getString("requestDate");
//	}
	

}
