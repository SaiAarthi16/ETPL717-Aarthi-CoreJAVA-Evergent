package com.evergent.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPI2_distinct {

	public static void main(String[] args) {
		         // 11  33 44 5 66
		List<Integer> listInt=Arrays.asList(11,33,44,5,66,44,5); 
		System.out.println(listInt);
		
				//11 33 44 5 66
		listInt.stream().distinct().forEach(System.out::println);

		int t = listInt.stream().reduce(2,(x,y) -> x+y );
		System.out.println(t);
		System.out.println(listInt);
	} 
}
