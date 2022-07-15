package com.infosys.exception.demo1;
// finally block is executed irrespective of exception is
// happening or not
public class Demo6 {

	public static void main(String[] args) {
		try {
			divide(10, 0);
			//divide(10, 2);
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void divide(int i, int j) {
      try
      {
		int result = i / j;
		
      }finally {
    	  System.out.println("I should be executed");  
      }
	}

}
