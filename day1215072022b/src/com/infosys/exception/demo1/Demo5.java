package com.infosys.exception.demo1;

// finally block is executed irrespective of exception is
// happening or not
public class Demo5 {

	public static void main(String[] args) {

		divide(10, 0);
		//divide(10, 2);

	}
// we cannot write finally block before catch block
// if they are placed with the same try block
	private static void divide(int i, int j) {
		try {
			int result = i / j;

		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}

		finally {
			System.out.println("I should be executed");
		}
	}

}
