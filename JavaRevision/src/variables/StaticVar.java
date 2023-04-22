package variables;

public class StaticVar {

	static int a = 10;  // static keyword can be declared globally can access globally
	static int b = 20;
		  
		public static void main(String[] args) {
			
			System.out.println(b);  
				// if static variable is in same class
			
			System.out.println(StaticVar.a);
				// if static variable present in another class
			
			StaticVar sv = new StaticVar ();
		//	System.out.println(sv.a); 
				// error as its not recommended
			
			
		}
	
}
