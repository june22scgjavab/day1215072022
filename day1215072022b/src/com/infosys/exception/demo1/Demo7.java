package com.infosys.exception.demo1;

// Exception is a checked exception
public class Demo7 {
// The following main method will show compilation error because Exception is a checked one
// and in the main method we have not handled the checked exception
/*	public static void main(String[] args) {
		
		Exception exception=new Exception();
		throw exception;

	} */
// We are able to see null with the below code as we have
// not given any string as an error message
/*public static void main(String[] args) {
	try
	{
		Exception exception=new Exception();
		throw exception;

	}catch(Exception ex)
	{
     System.out.println(ex.getMessage());		
	}
}*/
	
	public static void main(String[] args) {
		try
		{
			Exception exception=new Exception("I have created this exception");
			throw exception;

		}catch(Exception ex)
		{
	     System.out.println(ex.getMessage());		
		}
	}
	
}
