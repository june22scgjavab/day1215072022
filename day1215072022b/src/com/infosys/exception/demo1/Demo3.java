package com.infosys.exception.demo1;

public class Demo3 {

	// multiple catch blocks 
	// With the catches with Parent and Child Exception classes
	// Unreachable code for ArithmeticException
	// because Exception being a base or generic class,
	// is having the capability of handling any type of exception
	// unreachable code shows compilation error
	// So while having multiple catch blocks and 
	// different types of Exception classes in the catch block,
	// We should place the specific exception classes first
	// and then the Generic or Base one
	public static void main(String[] args) {
		try {
			int i = 10 / 0;
			System.out.println(i);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} catch (ArithmeticException ex) {

			System.out.println(ex.getMessage());
		}

	}

}
