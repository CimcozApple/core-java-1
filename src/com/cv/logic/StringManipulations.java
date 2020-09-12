package com.cv.logic;

import java.util.Arrays;
import java.util.List;

public class StringManipulations {

	public static void main(String[] args) {

		String data = "AR_SEQ_NO,M_AR_SEQ_NO";

		List<String> multipleBulkLoadField = Arrays.asList(data.split(","));

		System.out.println(multipleBulkLoadField);

	}

}
