package com.priyank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Display {
	void call(String msg);
}

public class ScopeTest {
	static String name = "Welcome";

	public static void main(String[] args) {
		ScopeTest s1 = new ScopeTest();
		System.out.println();
		Display display = msg -> System.out.println(name + " " + msg);
		display.call("Priyank");
		
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("DEF");
		list.add("GHI");
		list.add("JKL");
		list.forEach(System.out::println);
		list.forEach(item -> {
			if("ABC".equals(item)) {
				System.out.println("Validating Items "+item);
			}
		});
		list.stream().filter(s -> s.contains("B")).forEach(System.out::println);
		
		List<String> var = Arrays.asList("a","b","c","d","e");
		List<String> collect = var.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Convert to Upper Case Shortly: "+ collect);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		List<Integer> compute = numbers.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println("Give cube of given number Shortly: "+ compute);
		
	}
}
