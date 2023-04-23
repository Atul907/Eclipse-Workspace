package variables;

public class AssignmentInStatic {

	// Assignment: Write a Program to perform the arithmetic operations using minimum number of variables
	// static way of writing program
	
	static int i = 100;
	static int j = 10;
	
	public static void add () {
		
		System.out.println(i+j);
	}
	
	public static void sub () {
		
		System.out.println(i-j);
	}

	public static void mull () {
	
		System.out.println(i*j);
	}

	public static void div () {
	
		System.out.println(i/j);
	}
		   
		public static void main(String[] args) {
			
			AssignmentInStatic.div();
			AssignmentInStatic.mull();
			AssignmentInStatic.add();
			AssignmentInStatic.sub();
		
		}   
}
