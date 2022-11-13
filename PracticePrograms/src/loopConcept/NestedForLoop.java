package loopConcept;

public class NestedForLoop {

public static void main(String[] args) {
		
		int a = 1;
		int b = 5;
		for(a=5; a>=1; a--) {		
		// for syntax (initialization; condition; increment\decrement)	
			for (b=a; b<=5; b++) {
				System.out.print("*");
			}
		System.out.println();	
	}
}
	
}
