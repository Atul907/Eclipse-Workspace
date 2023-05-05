package simpleProgram;

public class TriangleLogic {

	public static void main(String[] args) {
		
		// write a program for
		//		*****
		//		****
		//		***
		//		**
		//		*

		int row,col;
		
		for (row=1; row<=5; row++) {
			
			for (col=1;col<=5;col++) {
				
				if(col>=row && col<=5)
					
					System.out.print("*");
			}
				System.out.println();
		}
		
	}

}
