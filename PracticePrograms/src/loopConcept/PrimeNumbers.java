package loopConcept;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// print prime number till n
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = s.nextInt();
		int t = 0;
		int i;
		
		if ( n==0 || n==1) {
			System.out.println("number is nor prime nor composite");
			
							}
		else
			for (i=1; i<=n; i++) {
			
			if (n%i==0) {
				t++;
			}s.close();
			}
		
		if(t==1) {
			System.out.println("is prime number"+n);
		}	
		else 
			System.out.println("is not prime number");
				
		}
	
	}

	

