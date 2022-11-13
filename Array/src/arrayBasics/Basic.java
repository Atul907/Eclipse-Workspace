package arrayBasics;

public class Basic {

	public static void main(String[] args) {
	
	// type 1
		String [] names = new String [4];
		
		names[0] = "Atul";
		names[1] = "tanvir";
		names[2] = "Renuka";
		names[3] = "Mock";
		
	// type 2
		String [] var = {"abc" , "mno", "xyz"};
		int siz = var.length;
		System.out.println(siz);
		
		
		 int size = names.length; 		// get length / size of array
		 System.out.println(size);

		 System.out.println(names[0]);
		 
		 
		 for (String single:names)		// advance for loop 
	// right side single (to iterate 1 by 1) : reference variable on left side and mouse hover to create loop variable
		 {
			 System.out.println(single);
		 }
		 
		 for (int i =0 ; i <size; i++)		// simple for loop 
		 {
			 System.out.println(names[i]);
		 }
	}

}
