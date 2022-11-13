package practiceProgramming;

public class Constructor {

	Constructor() {											// constructor with zero argument  
		
		System.out.println(" Type 1 Zero argument");
		
	}
	
	Constructor(int a ,int b) {								// constructor with user defined argument 
		
		System.out.println(a+b);
	}
	
	Constructor(String s){									// constructor with user defined argument 
		
		System.out.println(" Type 2 Non Zero argument " + s );
		
	}
	
//	public void o4 () {										// non static method
//		
//		System.out.println("Example Method");
//	}
	
	
	public static void main(String[] args) {			// main method
		
	//	Constructor mp = new Constructor();		// object created for calling non static method not for constructor calling
		
		new Constructor();						// calling constructor 
		new Constructor("Done");
		new Constructor(20, 50);
		
		// mp.o4();								// calling non static method
	}
	
}

