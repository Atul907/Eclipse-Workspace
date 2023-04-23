package variables;

public class ThisKeyword {

	// This keyword: It is a keyword in java which is used to access the global variable,
	// (static and non static ) inside the non-static area (non static method, constructor).
	
	String s = "India";
	static int i = 101;
			int j = 201;
	
	public void test () {
		
		int i = 11;
		int j = 22;
		
		System.out.println(i);
		//System.out.println(this.i);    error to call as static way
		System.out.println(j);
		System.out.println(this.j);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword tk = new ThisKeyword ();
		tk.test();
		
		// System.out.println(this.j);   error can't use this keyword in static method
	}
}
