package com.infosys.exception.demo1;

public class Demo1 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
			System.out.println(i);
       // Exception ex=new ArithmeticException();
		// Base class reference storing the reference of the derived class
		// object
		} catch (Exception ex) {
           //System.out.println(ex);
			//System.out.println(ex.getMessage());
		  // ex.printStackTrace();
		   System.out.println("Within the exception");
		}

	}
}
