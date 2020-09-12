package com.cv.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CorrectedClaim {

	public static void main(String[] args) {
		

		BufferedReader reader = null;
		String [] tokens = null;
		int lineCount = 0;
		String line = null;

		
		File file = new File("D:\\projects\\temp\\corrected-claim-file\\sel-6203-valid-rec-2.txt");
		List<String> arseqNoList = new ArrayList<>();
		Set<String> contractNumSet = new HashSet<>();
		StringBuilder currentline = new StringBuilder();
		Map<String, String> contractNumMap = new HashMap<String, String>();
		try {
			reader = new BufferedReader(new FileReader(file));
 			while ((line = reader.readLine()) != null) {
				currentline.append(line + ",");
				tokens = line.split(",");
				if (tokens.length == 3) {
				String contNum = tokens[0].trim();
				String arseqNum = tokens[1].trim();
				String claimRefNum = tokens[2].trim();
				String uniqueData = contNum+","+arseqNum;
				if(!contractNumMap.containsKey(uniqueData)) {
					arseqNoList.add(arseqNum);
					contractNumSet.add(contNum);
					contractNumMap.put(contNum+","+arseqNum , claimRefNum);
  					System.out.println("Valid Records : " +contNum + " , " +arseqNum);
					
				}else {
					System.out.println("Not a valid records : " +contNum + " , " +arseqNum);
				}
				
 				lineCount++;
			}
 			}
 			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		
	}
}
