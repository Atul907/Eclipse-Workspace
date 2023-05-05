package simpleProgram;

public class TriangleLogic1 {

	// write a program for
	//		*
	//		**
	//		***
	//		****
	//		*****
	
	public static void main(String[] args) {
		
		int row,column;
		
		for (row=1; row<=5;row++) {
			
			for (column=1;column<=5;column++) {
				
				if(column>=1 && column<=row)    // logic from excel sheet data
					
				System.out.print("*");	
		 }
			System.out.println();
	  }
		
   }
 	
}
