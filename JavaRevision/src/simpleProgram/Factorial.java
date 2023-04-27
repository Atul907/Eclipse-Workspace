package simpleProgram;

public class Factorial {


	public static void main(String[] args) {
	
	int count = 1;
	int number = 5;
	int factorial = 1;
	
	while (count<=number) 
	{
		factorial = factorial*count;
		
		count++;
	}

	System.out.println(factorial);
	}

}	
	

