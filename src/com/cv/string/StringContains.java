package com.cv.string;

 import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;

import com.cv.Json.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringContains {
	public static void main(String[] args) throws JSONException {

		 Employee employee = new Employee();
		 
		 employee.setName("John");
		 employee.setlName("Smith");

		 Employee employee2 = new Employee();
		 
		 employee2.setName("John");
		 employee2.setlName("Smith");
		 	
		 List<Employee> l = new ArrayList<>();
		 l.add(employee);
		 l.add(employee2);
		 String json = null;
 		try {
			JSONArray array = new JSONArray(new ObjectMapper().writeValueAsString(l));
			json= new ObjectMapper().writeValueAsString(l);
			System.out.println(array);
		} catch (JsonProcessingException e) {
		}
 			System.out.println(json);
	}
}
