package com.infosys.exception.demo1;

/*
 * Before exception
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
at com.infosys.exception.demo1.ExceptionDemo.divide(ExceptionDemo.java:4)
at com.infosys.exception.demo1.ExceptionDemo.main(ExceptionDemo.java:9)*/
public class ExceptionDemo {

	// In the first part we are taking the help of default handler
	/*
	 * 
	 * public static void divide(int number1, int number2) {
	 * System.out.println("Before exception"); int quotient = number1/number2;
	 * System.out.println("After exception"); System.out.println(quotient); }
	 */

	// We wrote our own handler and we gave a customised error message

	/*
	 * public static void divide(int number1, int number2) { try {
	 * System.out.println("Before exception"); int quotient = number1 / number2;
	 * System.out.println(quotient); System.out.println("After exception"); } catch
	 * (ArithmeticException exception) {
	 * System.out.println("The divisor should not be zero"); }
	 * System.out.println("After handling the exception"); }
	 */

	// Being a coder , I should be able to check through the entire flow
	// while understanding the exception . So I may use printStackTrace()
	// method of the Throwable class
	/*
	 * public static void divide(int number1, int number2) { try {
	 * System.out.println("Before exception"); int quotient = number1 / number2;
	 * System.out.println(quotient); System.out.println("After exception"); } catch
	 * (ArithmeticException exception) { exception.printStackTrace(); }
	 * System.out.println("After handling the exception"); }
	 */

	// We can just see the error message conveyed by the object of
	// ArithmeticException class

	/*
	 * public static void divide(int number1, int number2) { try {
	 * System.out.println("Before exception"); int quotient = number1 / number2;
	 * System.out.println(quotient); System.out.println("After exception"); } catch
	 * (ArithmeticException exception) { System.out.println(exception.getMessage());
	 * } System.out.println("After handling the exception"); }
	 */

	/*
	 * public static void divide(int number1, int number2) { try { int quotient =
	 * number1/number2; // If an exception occurs here, the control jumps to the
	 * first matching catch block System.out.println(quotient); // Execution of this
	 * line will be skipped } catch(ArrayIndexOutOfBoundsException exception) {
	 * System.out.println("Index not found"); } catch(ArithmeticException exception)
	 * { // This is the matching exception handler
	 * System.out.println("The divisor should not be zero"); }
	 * System.out.println("Method execution ends"); // Program execution will
	 * continue from this line }
	 */

	// If we dont have the matching handler it then goes to caller method
	// and there also if it is not finding the handler, control goes
	// to the default handler
	/*
	 * public static void divide(int number1, int number2) { try { int quotient =
	 * number1/number2; // If an exception occurs here, the control jumps to the
	 * first matching catch block System.out.println(quotient); // Execution of this
	 * line will be skipped } catch(ArrayIndexOutOfBoundsException exception) {
	 * System.out.println("Index not found"); } catch(NullPointerException
	 * exception) { // This is the matching exception handler
	 * System.out.println("The divisor should not be zero"); }
	 * System.out.println("Method execution ends"); // Program execution will
	 * continue from this line }
	 */

	// Try block can be nested
	/* public static void divide(int number1, int number2) {
		try {
			try {

				int quotient = number1 / number2; // If an exception occurs here, the control jumps to the first
													// matching catch block
				System.out.println(quotient); // Execution of this line will be skipped
			} catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("Index not found");
			}
		} catch (ArithmeticException exception) { // This is the matching exception handler
			System.out.println("The divisor should not be zero");
		}
		System.out.println("Method execution ends"); // Program execution will continue from this line
	} */
	
	public static void divide(int number1, int number2) {
		try {
			
			int num[] = new int[10];
			System.out.println(num[11]);
			int quotient = number1 / number2; // If an exception occurs here, the control jumps to the first
												// matching catch block
				System.out.println(quotient); // Execution of this line will be skipped
			} catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) {
				System.out.println(exception.getMessage());
			}
		
		System.out.println("Method execution ends"); // Program execution will continue from this line
	} 

	public static void main(String args[]) {
		divide(10, 0);
	}
}
