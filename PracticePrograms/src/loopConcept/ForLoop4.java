package loopConcept;

import java.util.Scanner;

public class ForLoop4 {

	public static void main(String[] args) {
		// print the sum of first natural numbers

		Scanner sc = new Scanner (System.in); 
		int n= sc.nextInt();
		int sum = 0;
	
		 for (int i=1; i<=n; i++) {			// if we i=0 then it will become whole number
			 
			 sum = sum + i;
		 }
		 System.out.println(sum);
		 sc.close();
	}

}
