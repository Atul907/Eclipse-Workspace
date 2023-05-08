package simpleProgram;

public class Heart {

	public static void main(String[] args) {
		
		// write a program
		//			*		*	
		//		*	*	*	*	*
		//		*	*	*	*	*
		//			*	*	*	
		//				*		

		int row ,col;
		
		for(row=1;row<=5;row++) {
			
			for(col=1;col<=5;col++) {
	
				if(col <=1 ) 
				{
					System.out.print(" ");
				}
				else 
				{
				System.out.print("*");
				}
			}
			System.out.println();
			
		}
		
		
	}

}
