package methodCategorization;

public class withReturnType {

// methods in categorization can be static or non static
	
	// 3. method with return but no argument
	
	public static int  met3 () {
		
		int i = 20;
		
		System.out.println("mehtod will return int datatype value but has no argument");
		System.out.println(i);
		return i;
	}
	
	// 4. method with return and argument
	
	public static String met4 () {
		
		String s = "return method with argument";
		
		System.out.println(s);
		
		return s;
		
	}
	
	public static int  areaCalculator(int length , int breadth)
	{
		int area = length * breadth;
		
		System.out.println(area);
		
		return area;
	}
	
	public static void main(String[] args) {
		
		met3();
		met4();
		areaCalculator(100, 200);
		
	}
	
	
}
