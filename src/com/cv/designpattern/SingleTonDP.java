package com.cv.designpattern;

import java.util.ArrayList;
import java.util.Collections;

class Single {

	private static Single singleTonDP ;
	
	private Single() {}
	
	
	public static Single getSDPObject(){
		if (singleTonDP == null){
			singleTonDP = new Single();
		}
		
		return singleTonDP;
	}
	

}


public class SingleTonDP {

	public static void main(String[] args) {
		
		Collections.sort(new ArrayList<>());
		Single single = Single.getSDPObject();
		
		System.out.println(single);
	}
	
	
}

