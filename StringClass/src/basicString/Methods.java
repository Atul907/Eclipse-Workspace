package basicString;

public class Methods {

	public static void main(String[] args) {
		
			// stored in 'constant pool area' memory when String does not require 'new' keyword
		
		String s0 = "";
		String s1 = "School";
		String s2 = " Junior College";
		String s3 = " Senior College";
		String s4 = " Engineering";
		String s5 = " Competitive Exam";
		String s6 = " Software Testing";
		String s8 = "";
			// stored in 'non-constant pool area' memory when String consist 'new' keyword (object creation takes place)

		String s7 = new String (" Quality Engineer");
		
											//// String methods 	
		
			// String empty or not
		System.out.println(s0.isEmpty());
		System.out.println(s0.isBlank());
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());	
	
			// String length
		System.out.println(s2.length());
		
			// String upper case or lower case
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		
			// start with & ends with
		System.out.println(s2.startsWith(s3));
		System.out.println(s3.startsWith("S"));
		
		System.out.println(s3.endsWith("College"));
		
			// add by concatenation
		System.out.println(s3.concat(" " +s4));
		
			// add String 
		System.out.println(s5.concat(" UPSC"));
		
			// index
		System.out.println(s4.indexOf('e'));
		System.out.println(s4.lastIndexOf('g'));
		
		System.out.println(s4.charAt(9));
		
			// substring
		System.out.println(s5.substring(12));
		System.out.println(s6.substring(9, 16));
		
			// equals or ignore case
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		
		System.out.println(s3=s8);
		System.out.println(s3==s8);		
		
			// replace & trim
		System.out.println(s4.replace("Engineering", "Mechanical Engineering"));
		
		System.out.println(s4.trim());
		
		System.out.println("Journey : " + s1+s2+s3+s4+s5+s6+s7);
		
	}

}
