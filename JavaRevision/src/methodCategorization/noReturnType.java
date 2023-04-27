package methodCategorization;

public class noReturnType {
// methods in categorization can be static or non static	

	// 1. method with no return no argument
	
	public  static void met1 () {
		
		System.out.println("this mehtod has no return and no argument");
		
	}
	
	// 2. method has no return but has argument
	
	public  static void met2 (int i) { // int i value will ask at time of method calling 
			
			System.out.println("this mehtod has no return type but has  argument");
		}
	
	public static void main(String[] args) {
	
		met1();
		met2(10); // argument value provided while calling
	}
	
}
