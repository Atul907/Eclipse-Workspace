 package practiceProgramming;

public class ThisStudent {
	int Rollno;  
	String Name;
	String Course;  
	float fee;  
	 
	ThisStudent (int Rollno , String Name, String Course, float fee)
	{
	this.Rollno= Rollno;
	this.Name= Name;
	this.Course= Course;
	this.fee= fee;
	}
	void display (){
	System.out.println(Rollno+ " " +Name+ " "+ Course+" "+ fee);
	}
	public static void main (String args[]){
	ThisStudent am = new ThisStudent(37,"Atul","Testing", 6000);
	am.display();
	}
	
}
