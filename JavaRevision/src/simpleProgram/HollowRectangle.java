package simpleProgram;

public class HollowRectangle {

	public static void main(String[] args) {
		
		// write a program
		//		*	*	*	*	*
		//		*				*
		//		*				*
		//		*				*
		//		*	*	*	*	*

		int row,col;
		
		for(row=1;row<=5;row++) {
			
			for(col=1;col<=5;col++) {
	
				if(row>=2 && row<=4 && col>=2 && col<=4) 
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

