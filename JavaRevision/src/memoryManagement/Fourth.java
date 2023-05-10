package memoryManagement;

public class Fourth extends SavedVariables {

	
	public void method10 () {
		
		o1.method1();
		t2.method4();
		t3.method7();
	}
	
	public void method11 () {
		
		o1.method2();
		t2.method5();
		t3.method8();
	}
	
	public void method12 () {
		
		o1.method3();
		t2.method6();
		t3.method9();
	}
		
	public static void main(String[] args) {
		
		Fourth f4 = new Fourth();
		f4.method10();
		f4.method11();
		f4.method12();
	}
}
