package inheritance;


public class Child  extends Parent{

	static int x = 50;
	int y = 60;
	
	public static void m4()
	{		
		int x = 100;
		
		System.out.println(x);		
		//this.a=a;						// this keyword cannot be used in static context
		System.out.println("4 method subclass"); 	
		
		System.out.println(Parent.a);				
	}
	
	public void m5() 
	{
		int y = 120;
		
		System.out.println(y);
				
		//y=this.y;
		System.out.println(this.y);		// class level variable access by (this.variable) keyword
		
		System.out.println(Parent.a);			// static variable from parent class (classname.variable)
		System.out.println(super.b);			// non static variable from parent class using super keyword (super.variable)
	}
		
	public Child() 
	{
		System.out.println("6 method constructor without arg");
	}
	
	public Child(int z) 
	{
		System.out.println("7 method constructor with arg");
	}
	
	public static void main(String[] args) 
	{
		m4();							// static method from this class itself
		Parent.m1();							// static method called from parent class directly without creating object
	
		Child in = new Child();				// object creation for non static method calling
		
		in.m2();
		in.m5();
		
		new Child();					// calling constructor from parent class
		new Child(60);
		
		new Parent();					// calling class from child class
		
	}
	
}

		