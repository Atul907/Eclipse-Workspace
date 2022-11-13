package practiceProgramming;

public class AnotherClassLoadingMainMethod {

	
	public static void main(String[] args) {
		
		AnotherClassOverloading.m1("calling");
		AnotherClassOverloading.m1(007);
		AnotherClassOverloading.m1(97);
		
		
		AnotherClassOverloading am = new AnotherClassOverloading ();
		
		am.m1();
		am.m1(5, "testing");
		am.m1(15, 20, 50);
	}
	
}
