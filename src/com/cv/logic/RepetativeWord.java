package com.cv.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RepetativeWord {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("add");
		list.add("allow");
		list.add("allow");
		list.add("allow");
		list.add("add");
		list.add("and");
		list.add("and");
		list.add("add");
		
		// System.out.println(list.size());
		
		// System.out.println(Collections.frequency(list, "add"));
		
		Map<String, List<String>> mapData = new HashMap<String, List<String>>();
		
		List<String> templist ;
		for(String s: list){
			templist = new ArrayList<String>();			
			if(mapData.containsKey(s)){
				templist = mapData.get(s);
				templist.add(s);
				mapData.put(s, templist);
			}else{
				templist.add(s);
				mapData.put(s, templist);
			}
			
		}
		
		System.out.println(mapData);
		StringBuffer sb = new StringBuffer() ;
		
		String [] s1 = mapData.keySet().toArray(new String[mapData.size()] );
		
		for (String string : s1) {
			sb.append("'"+string+"',");
		}
		 System.out.println(sb.length());
		System.out.println("Provide data : "     +"("+sb.substring(0, sb.length()-1)+")");
		sb.setLength(sb.length()-1);
		System.out.println("Provide data1 : "    +sb);
		
		
		for(Entry<String, List<String>> entrysetData: mapData.entrySet()){
			System.out.println(entrysetData.getKey());
			System.out.println(entrysetData.getValue());
			
		}
		
		
		
		
		
	}

}
