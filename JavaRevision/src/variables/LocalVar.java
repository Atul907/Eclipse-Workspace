package variables;

public class LocalVar {

	int i = 10 ;
	String s = "Test";
	
	public void testing () {
		
		int j = 20;
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		
		//System.out.println(j); // cant access local variable so showing error
		
		int j = 25;
		System.out.println(j);
		
	}
	
}
