package com.priyank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		List<String> daysOfWeek = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
		String day = "Tue";
		int numbers = 5;
		
		for (String d : daysOfWeek) {
			if (d.equals(day)) {
				
			}
		}
		daysOfWeek.stream().filter(a -> a.equals(day)).forEach(System.out::print);
	}
}
