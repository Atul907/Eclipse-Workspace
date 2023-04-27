package simpleProgram;

public class TriangleStar {

	public static void main(String[] args) {
		
		// write a program for
						//		*
						//		**
						//		***
						//		****
						//		*****
		
		int r,c;
		
		for (r=1;r<=5;r++) {				// for row
			
			for (c=1;c<=r;c++) {			// for column
	
				System.out.print("* ");		// to print star
			}
			System.out.println();			// to start printing in next line
		}
		
		
		
	}
	
	
}
