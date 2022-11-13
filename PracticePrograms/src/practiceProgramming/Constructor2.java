package practiceProgramming;

public class Constructor2 {

	int a;
	int b;
	
	Constructor2() {
		
		int a= 5;								// declare		
		int b= 10;								
		
		System.out.println(a+b);				// logic	
		
	}
	
	Constructor2 (String s){
		
		
		System.out.println("Testing" + s);
		
	}
	
	Constructor2 (int a ,int b){				// declare
		
		System.out.println(a+b);				// logic
	}
	
	
	public static void main(String[] args) {
		
		
		new Constructor2();
		new Constructor2("Done");
		new Constructor2(10, 20);				// initialize
	}
	
}
