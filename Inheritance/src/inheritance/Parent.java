package inheritance;

public class Parent {
	
	static int a = 17;
	int b = 18;
	
	public static void m1 (){
		
		System.out.println("1 method from sc");
	}
	
	public void m2 () {
		 
		int b = 1802;
		
			System.out.println("2 method from sc");
			System.out.println(Parent.a); 				// 17 to access static variable call by (classname.variable)
			System.out.println(b);						// 1802
			System.out.println(this.b); 			// 18 to access global variable 
	}

	public Parent() 								// constructor does not follow inheritance so not accessible to child class
	{
		System.out.println("3 constructor");		// but will get called by child class constructor by default 
	}
}
