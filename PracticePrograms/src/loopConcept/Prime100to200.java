package loopConcept;

public class Prime100to200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n=13;
		
		int i;
		int j; 
		int temp=0;
		
		System.out.print("Prime Number are: ");
		
		for (i=10; i<=n; i++) 
		{
			for (j=2 ; j<=i-1; j++) {
				
				if (i%j==0) 
				{
					temp=temp+1;
					
				}
			}
			
			if (temp==0) {
				
				System.out.print(" "+i);   ///prime number
			}
			else {
				temp=0;
			}
		}
	}
		
	}


