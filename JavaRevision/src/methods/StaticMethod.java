package methods;

public class StaticMethod {

	static int a = 10;
		   int b = 20;
	
	//	access_modifier static returntype nameofmethod();
	public static void m1 () {
			   
	 System.out.println("this is method 1 from m1");
			   
	 } 
		   
    public static void m2 () {
			   
	System.out.println("this is method 2 from m2");
     }
	
    // main method/ business method one type of methods w/o this jvm will not execute program
   //as it is predfined/configured in jvm
	 public static void main(String[] args) {
			
	 m1();  
		// methodName - one way to call static method
			   
	 StaticMethod.m2();  
		// className.mehtodName - 2nd way to call method can be called from another class also
			   
			   
			   
		}
		   
		   
}
