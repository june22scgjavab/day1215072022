package com.infosys.exception.userdefined;

import java.util.Scanner;

// NegativeNumberNotAllowedException is a checked exception as we have inherited from the 
// Exception class and Exception class itself is a Checked Exception
public class Tester {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number");
			int num = scan.nextInt();
			if (num <= 0) {
				throw new NegativeNumberNotAllowedException("O or negative value not allowed ");
			}
		} catch (NegativeNumberNotAllowedException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
