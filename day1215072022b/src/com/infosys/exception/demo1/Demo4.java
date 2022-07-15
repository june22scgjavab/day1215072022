package com.infosys.exception.demo1;

public class Demo4 {

	public static void main(String[] args) {
		try {
			divide(10, 0);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void divide(int i, int j) {

		int result = i / j;
		System.out.println("I should be executed");

	}

}
