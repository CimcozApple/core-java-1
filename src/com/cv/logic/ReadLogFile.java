package com.cv.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;

public class ReadLogFile {

	public static void main(String[] args) throws MalformedURLException {
		BufferedReader reader = null;
		String [] words = null;
		int lineCount = 0;
		File file = new File("C:\\logs\\web\\weblogic\\wls-12.1.3.0\\rebill\\rebill.log");
		
		try {
			reader = new BufferedReader(new FileReader(file));
			String currentline = reader.readLine();
			while (currentline != null) {
				
				if(currentline.contains("Exception")) {
					System.out.println(currentline);
				}
				
				currentline = reader.readLine();
				lineCount++;
			}
			
			System.out.println("File has no of line " +lineCount);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
