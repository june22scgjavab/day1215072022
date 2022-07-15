package com.infosys.exception.demo3;

import java.io.FileInputStream;
/*
 * Unhandled exception type 
	 FileNotFoundException ( FileNotFoundException thrown by the
	 constructor of FileInputStream is a Checked exception.
	 How come we are able to decide that because currently
	 if we see the code it is showing compilation error.
	 
 */
public class Demo {

	public static void main(String[] args) {
		
		FileInputStream fis=new FileInputStream("data.txt");

	}

}
