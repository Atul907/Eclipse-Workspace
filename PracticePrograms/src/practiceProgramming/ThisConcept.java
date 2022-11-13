package practiceProgramming;

public class ThisConcept {				// applicable to non static methods only

	int a = 10;						// class level variable
	int b = 20;
	int c = 30;
	int d = 40;
	
	public void a1 () {
		
		int a = 50;					// local level variable
		int b = 60;
		
		System.out.println(a);					// using local variable
		System.out.println(this.a);				// using class level variable
		System.out.println(b);
		System.out.println(this.b);
	}
	
	public void a2 () {
		
		int a = 70;							// initialization with declaration
		int b = 80;
		
		this.a=a;					// declaring to use local variable a = 70 instead of class level variable 10
		b=this.b;				// declaring to use class level variable b = 20 instead of 80 local level variable
		
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		ThisConcept am = new ThisConcept ();
		
	am.a1();
	am.a2();	
	}
	
}
