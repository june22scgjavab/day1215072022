package com.infosys.exception.demo1;

import java.util.Scanner;

public class Demo9 {
// This way is for not handling the exception passing it to another part of the code
	public static void main(String[] args) throws Exception {
 
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num = scan.nextInt();
		if (num <= 0) {
			/*Exception exception = new Exception("0 or negative value not allowed");
			throw exception;*/
			throw new Exception("0 or negative value not allowed");
		}
		System.out.println("The value is "+num);
   
		
	}

}
