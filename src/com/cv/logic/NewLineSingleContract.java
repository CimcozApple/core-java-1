package com.cv.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class NewLineSingleContract {

	public static void main(String[] args) {
 

		BufferedReader reader = null;
		String [] tokens = null;
		String line = null;
 
		try{
 			File file = new File("D:\\projects\\temp\\ar-seq-new-line-without-comma.txt");
			reader = new BufferedReader(new FileReader(file));
			 
			while((line = reader.readLine()) != null){
 				if(line.trim().length()>0) {
 					System.out.println(line);
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
