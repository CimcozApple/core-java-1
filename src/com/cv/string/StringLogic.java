package com.cv.string;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class StringLogic {

	public static void main(String[] args)  throws JSONException {

		String s = "RBILL_DIS_AR_UPDATE.sh";
		String d24 = "D24";
		System.out.println("D24 = " +d24.substring(1) );
		//		System.out.println(s.substring(0, s.length() - 3).concat("_PARAM"));
		//		System.out.println(s.lastIndexOf(".sh"));

		
		String s1 = "Channaveer Patil ( 0034343 )";

		System.out.println(" **** " + s1.substring(0, s1.indexOf("(")).toUpperCase());

		for(String s3 : s1.split(" ")) {
			System.out.println(s3);
		}


		List<String> l = new ArrayList<String>();

		l.add("D");
		l.add("B");
		l.add("C");
		l.add("A");

		System.out.println("List = "+ l.toString());

		for (String string : l) {
			System.out.println("Order = " + string);
		}
		
		String as[] = {"A", "B", "C"};

		System.out.println(as);
		
		for (String string : as) {
			System.out.println("String Order = " + string);

		}

		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyyhhmmss");


		System.out.println(dateFormat.format(new Date()));
		
		LocalDateTime ldt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("ldt = " +ldt);
		System.out.println("ISO_DATE_TIME = " + ldt.format(DateTimeFormatter.ofPattern("_MMddyyyyhhmmss")));
		
		String s11 = "channaveer.patil@evry.com";

		s11 = s11+";"+"rebill@evry.com";

		JSONObject o = new JSONObject();
		List<String> l1 = new ArrayList<>();
		try {
			o.put("review0 605 | 65781 | 01 | 3", "");
			o.put("review1 605 | 65781 | 03 | 3", "");
			o.put("review2 605 | 65781 | 04 | 4", "");
			o.put("review3 605 | 65781 | 01 | SP", "");
			o.put("review4 605 | 65781 | 03 | SP", true);
			o.put("review5 605 | 65781 | 04 | SP", true);
			o.put("review6 605 | 65781 | 04 | SP", true);
			
			for (int i = 0; i < o.names().length(); i++) {
				String key = o.names().getString(i);
				if (o.get(key) instanceof Boolean) {
					System.out.println("key-"+key);
					l1.add(key.substring(8).replaceAll("\\s+", ""));
				}
			}
			l1.stream().forEach(x->{
				System.out.println("*** "+x);
			});

		
			Map<String, String> map = new HashMap<>();
			
			map.put("605", "AAR3234");
			map.put("605", "AAR3233");
			map.put("605", "AAR3235");
			map.put("605", "AAR3236");
			
			
			System.out.println("Map : " + map.containsKey("605") + " Value " + map.containsValue("AAR3236") +" size " + map.size());
			
			Timestamp stamp = new Timestamp(System.currentTimeMillis());
			Date date = new Date(stamp.getTime());
			System.out.println(date);
					
			StringBuilder sb = new  StringBuilder();
			sb.append("ABC,");
			sb.append("cef,");
			
			System.out.println("sb = " +sb.substring(0,sb.length()-1));
		 
			String ss = String.format("ABC IN (%s) AND IN ('%s') IN (%s)", "'DEF','GHI'","T","@");
			System.out.println("Formatted : " + ss);
			
		} catch (JSONException e) {
 			e.printStackTrace();
		} finally {
			
		}
	 }
}
