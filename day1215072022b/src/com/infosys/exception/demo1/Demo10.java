package com.infosys.exception.demo1;

import java.util.Scanner;

public class Demo10 {
// setData is not handling the exception and passing it to main

	public static void setData(int num) throws Exception
	{
		if (num <= 0) {
			/*Exception exception = new Exception("0 or negative value not allowed");
			throw exception;*/
			throw new Exception("0 or negative value not allowed");
	}
	
	}
// main is also not handling and it us bypassed to the default handler	
	public static void main(String[] args) throws Exception {
 
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		setData(num);
   
		
	}

}
