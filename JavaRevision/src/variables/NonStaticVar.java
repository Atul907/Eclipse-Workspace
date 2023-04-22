package variables;

public class NonStaticVar {

	int c = 30;
	int d = 40;	   
		   
	public static void main(String[] args) {
		
		// to call non static variable create object
		
		NonStaticVar ns = new NonStaticVar ();
		
		System.out.println(ns.c);
		
	}
	
}
