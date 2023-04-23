package variables;

public class AssignmentNonStatic {

	// Assignment: Write a Program to perform the arithmetic operations using minimum number of variables
	// static way of writing program
	
	int i = 50;
	
		public static void main(String[] args) {
			
			AssignmentNonStatic num = new AssignmentNonStatic ();
			
			AssignmentNonStatic var = new AssignmentNonStatic ();
			var.i = 5;
			
			System.out.println(num.i / var.i);
			System.out.println(num.i * var.i);
			System.out.println(num.i + var.i);
			System.out.println(num.i - var.i);
			
		}
	
}
