package practiceProgramming;

public class ThisConcept2
{

	String name;					// declaration
	int rollno;
	float fee;
	String course;
	
	ThisConcept2 (String name, int rollno, float fee, String course)		// manner
	{
		
		this.name = name;						// logic to use variable
		this.rollno= rollno;
		this.fee = fee;
		this.course = course;
	} 
	
	

	void display() {				// method declaration (non static)
		
		System.out.println(name +" "+ rollno +" "+ fee + " "+ course);
	}			
	
	
	public static void main (String args[])	{
	
		ThisConcept2 st1 = new ThisConcept2("Atul", 37, 42000, "Software Testing");
		ThisConcept2 st2 = new ThisConcept2("Tanvir", 38, 42000, "Sotware Testing");
		ThisConcept2 st3 = new ThisConcept2("Renuka", 39, 42000, "Sotware Testing");
		ThisConcept2 st4 = new ThisConcept2("Ambika", 40, 42000, "Software Testing");
		
		st1.display();
		st2.display();
		st3.display();
		st4.display();
	}
	}
