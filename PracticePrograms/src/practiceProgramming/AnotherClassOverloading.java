package practiceProgramming;

public class AnotherClassOverloading {

	
public void m1 () {
		
		System.out.println("I am Method 1");
	}
	
	public void m1 (int a,String s ) {
		
		System.out.println(a+ s);
		
	}
	
	public void m1 (int a, int b, int c) {
		
		System.out.println(a+b+c);
	}
	
	public static void m1 (String z) {
		
		System.out.println(z);
	}
	
	public static void m1 (float f) {
		
		System.out.println(f);
	}
	
	public static void m1 (int i) {
		
		System.out.println(i);
	}
}

