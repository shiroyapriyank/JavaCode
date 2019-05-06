package com.priyank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMyEmployee {

	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee(1001, "Priyank", "1113 HighField"),
				new Employee(1002, "Mahesh", "1113 HighField"), new Employee(1003, "Noah", "1113 HighField"));

		List<String> collect = emp.stream().map(x -> x.getEmpName()).collect(Collectors.toList());
		System.out.println("WIthout Iterator "+collect);

		List<String> fruits = Arrays.asList("apple","orange","mango","banana","apple","pineapple","apple");
		Map<String, Long> result = fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result);
	}
}
