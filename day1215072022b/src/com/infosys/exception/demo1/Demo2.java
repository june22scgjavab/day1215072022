package com.infosys.exception.demo1;

public class Demo2 {

	// multiple catch blocks 
	// With the catches with Parent and Child Exception classes
	
	public static void main(String[] args) {
		try {
			//int num[]=new int[20];
			//System.out.println(num[21]);
			int i = 10 / 0;
			System.out.println(i);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception ex) {

			System.out.println(ex.getMessage());
		}

	}

}
