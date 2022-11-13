package practiceProgramming;

public class OperatorUnary {

	 public static void main(String[] args) {
		
		 int a = 25;
		 
		 System.out.println("Pre-fix \n");
		 System.out.println(--a);
		 System.out.println(a);
		 System.out.println(++a);				// 1+25 = 26
		 System.out.println(a);
		 System.out.println(--a);				// 1-25 = 25
		 
		 
		 int b = 10;
		 
		 System.out.println("Post-fix \n");
		// System.out.println(b);
		// System.out.println(b++);				// 10+1
		// System.out.println(b--);				// 10-1
		 
		// System.out.println(a++ + ++a);			// 26+26 = 52  
		 System.out.println(b++ + ++b);			//10+11=21
		 
		 // opposites
		 
		 int e=10;  
		 int f=-10;  
		 boolean g=true;  
		 boolean h=false; 
		 
		 System.out.println(e);
		 System.out.println(~e);		//-11 (minus of total positive value which starts from 0)
		 System.out.println(f);
		 System.out.println(~f);		//9 (positive of total minus, positive starts from 0)  
		 System.out.println(g);
		 System.out.println(!g);		//false (opposite of boolean value)  
		 System.out.println(h);
		 System.out.println(!h);		//true
		 
		 
		 // Arithmetic operators 
		 
		 int c = a+b;
		 int d = a-b;
		 
		 System.out.println("Arithmetic Operators");
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(a*b);
		 System.out.println(a/b);
		 System.out.println(a%b);
		 
		 // direct value 
		 System.out.println(10*10/5+3-1*4/2);
	}
	
	
}
