package basicString;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Tester";
		// String s1 = "";				// comment part belongs to 2nd method
		
		for(int i =s.length()-1; i>=0; i--) { 		// -1 because index starts with 0 and total char is 6 so 0-5 is required
			
			System.out.print(s.charAt(i));        // 1 method for reverse string w using loop
			
			
			//s1 = s1+s.charAt(i);				// 2nd method for reverse string w/o using loop	
		}
		
		//System.out.println("Original : " + s + "\n" + "Reverse : " + s1);		//before & after results 
	}

}
