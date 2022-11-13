package practiceProgramming;

public class MethodCalling {

	public static void m1() {										// static method without loading argument
		
		System.out.println("Method 1 Runing");
		
	}
	
	public static void m2(int a ,int b) {							// static method with loading argument
		
		System.out.println("Output of method 2 is"+a+b);
		
	}
	
	public void m3() {											// non static method without loading argument
	
	System.out.println("This is 3rd Method");	
	}
	
	public void m4(String s) {									// non static method with loading argument
		
		System.out.println("My name is"+ s);
	}
	
	public static void main(String[] args) {					// main method
		
		m1();													// calling static method m1 in main method
		m2(10, 20);												// calling static method m2 in main method
		
		MethodCalling am = new MethodCalling ();			// object creation for non static method calling
		am.m3();										// calling non static method m3 in main method
		am.m4("Atul");									// calling non static method m4 in main method
	
		
		// calling from another class named as CallingFromSecondClass
		
		CallingFromSecondClass.m5(10, 10);							// calling static method 	
		
		CallingFromSecondClass ak = new CallingFromSecondClass(); 		// object creation non static method calling
		ak.m6("Congo" );											// calling noon static method	

		
	}
}
