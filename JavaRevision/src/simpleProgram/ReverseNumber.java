package simpleProgram;

public class ReverseNumber {

	
	// write a program to reverse a number
	
	public static void main(String[] args) {
		
		int num = 12345;
		int reverse = 0;
		
	  while (num>0){
		 
		  reverse = reverse*10 + num%10;
	
		  num = num / 10;	 
	  }
	  	  System.out.println(reverse);
	}
}
