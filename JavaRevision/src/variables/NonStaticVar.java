package variables;

public class NonStaticVar {

	String s = "Pune";   // declared globally/ class level
	int d = 40;	   
		   
	public static void main(String[] args) {
		
		// to call non static variable create object
		
		NonStaticVar ns1 = new NonStaticVar ();
		
		System.out.println(ns1.s);
		
		ns1.s = "Mumbai";
		System.out.println(ns1.s);
		
		// non static variables value keeps on varying object to object
		
		NonStaticVar ns2 = new NonStaticVar ();
		ns2.s = "India";
		System.out.println(ns2.s);
		
		ns2.s = "Delhi";
		System.out.println(ns2.s);
		
		NonStaticVar int1 = new NonStaticVar ();
		int1.d = 50;
		System.out.println(int1.d);
		
		int1.d = 60;
		System.out.println(int1.d);
		
		
		
	}
	
}
