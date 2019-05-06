package com.priyank;

public interface A1 {

	default void call() {
		System.out.println("Calling A1 Method");
	}
}

class Test implements A1{
	public static void main(String[] args) {
		Test a1 = new Test();
		a1.call();
	}
}