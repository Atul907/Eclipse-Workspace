package simpleProgram;

public class TriangleStar {

	public static void main(String[] args) {
		
		// write a program for
							//		*
							//		**
							//		***
							//		****
							//		*****
		
		int row,column;
		
		for (row=1;row<=5;row++) {				    // for row
			
			for (column=1;column<=row;column++) {	// for column
	
				System.out.print("* ");		        // to print star
			}
			System.out.println();			        // to start printing in next line
		}
		
		
		
	}
	
	
}
