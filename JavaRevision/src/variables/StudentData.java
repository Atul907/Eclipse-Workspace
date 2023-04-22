package variables;

public class StudentData {

	// write a program to store data of 4 students (name,marks,age) data are in same college and city 
	
	static String collegeName;
	static String city  ;
	String name ;
	int age ;
	double marks ;
	
	public static void main(String[] args) {
		
		collegeName = "COEP";
		city = "Pune";
		
		StudentData student1 = new StudentData();
		student1.name = "A1";
		student1.age = 18;
		student1.marks = 75.57;
		
		StudentData student2 = new StudentData();
		student2.name = "A1";
		student2.age = 18;
		student2.marks = 75.57;
		
		StudentData student3 = new StudentData();
		student3.name = "A1";
		student3.age = 18;
		student3.marks = 75.57;
		
		StudentData student4 = new StudentData();
		student4.name = "A1";
		student4.age = 18;
		student4.marks = 75.57;
		
	}
	
	
}
