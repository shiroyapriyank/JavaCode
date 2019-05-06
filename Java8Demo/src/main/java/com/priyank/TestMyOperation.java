package com.priyank;

public class TestMyOperation {

	public int operate(int a, int b,Operation opr) {
		return opr.oper(a, b);
	}
	public static void main(String[] args) {
		Operation add = (int a,int b) -> a+b;
		Operation mul = (int a,int b) -> a*b;
		Operation sub = (int a,int b) -> a-b;
		TestMyOperation test = new TestMyOperation();
		System.out.println("10+5 = "+test.operate(10, 5, add) );
		System.out.println("10*5 = "+test.operate(10, 5, mul) );
		System.out.println("10-5 = "+test.operate(10, 5, sub) );
	}
}
