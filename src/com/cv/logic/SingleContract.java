package com.cv.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SingleContract {

	public static void main(String[] args) {
 

		BufferedReader reader = null;
		String [] tokens = null;
		String line = null;
 
		try{
 			File file = new File("D:\\projects\\temp\\ar-seq-new-line-without-comma.txt");
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null){

 				tokens = line.split(",", -1);

 				for(int i=0; i<tokens.length; i++) {
						System.out.println("tokens :" +tokens[i]);
				}
			}
			
			if (reader != null) {
				reader.close();
				System.out.println("\nIn close method :");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
