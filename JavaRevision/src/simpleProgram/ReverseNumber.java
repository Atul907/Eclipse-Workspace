package simpleProgram;

public class ReverseNumber {

	
	// write a program to reverse a number
	
	public static void main(String[] args) {
		
		
	  		int number = 24568;
	  		int remainder ;
	  		
	  		while (number!=0) {
	  			
	  		remainder = number % 10;
	  		
	  		System.out.print(remainder);
	  		
	  		number = number / 10;
	  		
	  		}
	  	  
	
	}
}
