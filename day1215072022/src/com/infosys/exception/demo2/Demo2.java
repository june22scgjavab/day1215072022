package com.infosys.exception.demo2;

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.infosys.exception.demo2.Demo2.divide1(Demo2.java:7)
	at com.infosys.exception.demo2.Demo2.divide2(Demo2.java:13)
	at com.infosys.exception.demo2.Demo2.divide3(Demo2.java:18)
	at com.infosys.exception.demo2.Demo2.main(Demo2.java:22)

 * 
 */
public class Demo2 {

	
	public static void divide1(int num1, int num2) {
		int result=num1/num2;
		
	}
	
	public static void divide2(int num1, int num2) {
		
		divide1(num1,num2);
	}
	
public static void divide3(int num1, int num2) {
		
		divide2(num1,num2);
	}
	
	public static void main(String[] args) {
	  divide3(10,0);

	}

}
