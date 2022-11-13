package callingClass;

import java.util.Scanner;			// imported scanner class

public class ScannerClass {

	public static void main(String[] args) {
		System.out.println(" Enter your First Name , Last Name & Salary"); // question
		
	Scanner am = new Scanner(System.in);		// Scanner syntax
	
	String firstname = am.nextLine();		// scanner type
	String lastname = am.nextLine();
	int salary = am.nextInt();
	
		System.out.println("Your First Name is:" + firstname); // print logic
		System.out.println("Your Last Name is:" + lastname);
		System.out.println("Your Salary is :" + salary );
		
		am.close();						// close scanner class
	}
	
}
