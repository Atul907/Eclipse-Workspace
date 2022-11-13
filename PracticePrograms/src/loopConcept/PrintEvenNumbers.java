package loopConcept;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// print all eve numbers till n

		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = s.nextInt();
		
		int i;
		
		for (i=1; i<=n; i++) {
			
			if (i%2==0) {
				
			
			System.out.println( i);
			s.close();
			}
		}
	}

}
