package com.java8.streams.stats;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatisticDemo {

	public static void main(String[] args) {
		
	List<Integer> list = Arrays.asList(1,2,3);
	
	IntSummaryStatistics statistics = list.stream().mapToInt((x) -> x).summaryStatistics();

	System.out.println("Integer Statistics");
	System.out.println(statistics.getMax());
	System.out.println(statistics.getCount());
	System.out.println(statistics.getMin());
	System.out.println(statistics.getAverage());
	System.out.println(statistics.toString());
	
	DoubleSummaryStatistics doubleStatistics = list.stream().mapToDouble((x)-> x).summaryStatistics();
	
	System.out.println("Double Statistics");
	System.out.println(doubleStatistics.getMax());
	System.out.println(doubleStatistics.getCount());
	System.out.println(doubleStatistics.getMin());
	System.out.println(doubleStatistics.getAverage());
	System.out.println(doubleStatistics.toString());
	
	
	}
	
}
