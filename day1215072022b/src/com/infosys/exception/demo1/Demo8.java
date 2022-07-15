package com.infosys.exception.demo1;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
   try
   {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num = scan.nextInt();
		if (num <= 0) {
			Exception exception = new Exception("0 or negative value not allowed");
			throw exception;
		}
		System.out.println("The value is "+num);
   }catch(Exception ex)
   {
	   System.out.println(ex.getMessage());
   }
		
	}

}
