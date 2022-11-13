package practiceProgramming;

public class CallingFromSecondClass {

	// created this class to call in other class
	
	public static void m5(int c,int d ) {					// static method with argument loading

		System.out.println(c + d);
	}
	
	public void m6 (String x) {							// non static method with argument loading
		
		System.out.println(x + "Prog ran successfully");
	}
	
}
