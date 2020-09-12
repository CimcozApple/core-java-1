package com.cv.Json;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonDemo {

	public static void main(String[] args) {
		
	try {
		
		JSONObject obj = new JSONObject();
		List<Employee> l = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		e1.setlName("John");
		e1.setlName("Smith");
		
		Employee e2 = new Employee();
		e2.setlName("James");
		e2.setlName("Bond");
		
		l.add(e1);
		l.add(e2);
		
		obj.put("employee", e1);
		obj.put("name","Channaveer");
		
		System.out.println(obj.toString());
		
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
