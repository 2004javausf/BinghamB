package com.revature.ol;

public class calculator {

	public static void main(String[] args) {
		add(3,6);
		add(1.3, 4.5);
		add(4,5,6);
	}
	
	static int add(int a, int b) {
		System.out.println(a+b);
		return a+b;	
	}
	
	static double add(double a, double b) {
		System.out.println(a+b);
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}
	//(3, 6) calls first add method and returns 9
	//(1.3, 4.5) calls second add method and returns 5.8
	//(4,5,6) calls third add method and returns 15
}
