package simpleProgram;

public class TriangleLogic2 {

	public static void main(String[] args) {
		
		// write a program 
		//		*	*	*	*	*
		//			*	*	*	*
		//				*	*	*
		//					*	*
		//						*


		int row,col;
			
			for (row=5; row<=5; row--) {
				
				for (col=1;col<=5;col++) {
					
					if(col>=1 && col<=row)
						
						System.out.print("*");
				}
					System.out.println();
			}
			
		}

	}

