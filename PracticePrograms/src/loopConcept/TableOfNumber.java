package loopConcept;

import java.util.Scanner;

public class TableOfNumber {

	public static void main(String[] args) {
		// print the table of number input by user

			Scanner sc = new Scanner (System.in); 
			System.out.println("Enter The Number For Table :");
			int n= sc.nextInt();
			int sum ;
		
			 for (int i=1; i<=10; i++) {			
				  
				 sum= i*n;
				 System.out.println(sum);
			 }
			 
			 sc.close();
		}


	}


