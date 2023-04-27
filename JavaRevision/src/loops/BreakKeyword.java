package loops;

public class BreakKeyword {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i<10) {
			
			System.out.println("print hello");
			i++;
			
			if (i==5) {
				
				break; // should be used using loop 
			}
		}
	}
}
