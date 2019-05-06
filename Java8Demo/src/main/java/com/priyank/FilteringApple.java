package com.priyank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApple {

	public static void main(String... args) {
		List<String> names = Arrays.asList("a", "b", "c", "d");
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});
		System.out.println("java 7" + names);
		names.forEach(System.out::print);
		System.out.println();
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		System.out.println("Java 8 with type" + names);
		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println("Java 8 with type" + names);
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
		List<Apple> greenApple = filterApples(inventory, FilteringApple::isGreenApple);
		System.out.println(greenApple);

		List<Apple> heavyApple = filterApples(inventory, FilteringApple::isHeavyApple);
		System.out.println(heavyApple);

		List<Apple> greenApple2 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
		System.out.println(greenApple2);

		List<Apple> heavyApple2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
		System.out.println(heavyApple2);

		List<Apple> weirdApples = filterApples(inventory,
				(Apple a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));
		System.out.println(weirdApples);

	}

	public static List<Apple> filterGreenApple(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ("green".equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterHeavyApple(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > 150) {
				result.add(apple);
			}
		}
		return result;
	}

	public static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}

	public static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}

	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static class Apple{
		private int weight = 0;
		private String color = "";
		
		public Apple(int weight,String color) {
			this.color = color;
			this.weight = weight;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Apple [weight=" + weight + ", color=" + color + "]";
		}
		
	}

}
