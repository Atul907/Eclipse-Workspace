package methods;

public class NonStaticMehtod {

	//	access_modifier return_type name_of_method();
	public void m3 () {
		
		System.out.println("non static method");
	}
	
	public void m4 () {
		
		System.out.println("method 4");
	}
	
	public static void main(String[] args) {
		
		NonStaticMehtod rv = new NonStaticMehtod ();
		// className reference variable = new className () ;
		// creating object to call non static method 
		rv.m3();
		rv.m4();
		
		StaticMethod.m2();
	}
}
