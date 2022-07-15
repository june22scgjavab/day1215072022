package com.infosys.exception.demo1;

import java.util.Scanner;

public class Demo11 {
// setData is not handling the exception and passing it to main

	public static void setData(int num) throws Exception
	{
		if (num <= 0) {
			/*Exception exception = new Exception("0 or negative value not allowed");
			throw exception;*/
			throw new Exception("0 or negative value not allowed");
	}
	
	}
// main is handling the exception so the control is not going to the 
// default handler and also we dont have to write throws with main method
	
	public static void main(String[] args)  {
 
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		try {
			setData(num);
		} catch (Exception e) {
			e.printStackTrace();
		}
   
		
	}

}
