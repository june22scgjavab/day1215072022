package com.infosys.exception.demo1;

import java.util.Scanner;

public class Demo12 {
// setData is handling the exception so we dont have to use
// throws exception with setData

	public static void setData(int num) 
	{
		try
		{
		if (num <= 0) {
			/*Exception exception = new Exception("0 or negative value not allowed");
			throw exception;*/
			throw new Exception("0 or negative value not allowed");
	}
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

	public static void main(String[] args)  {
 
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num=scan.nextInt();
		setData(num);
   
		
	}

}
