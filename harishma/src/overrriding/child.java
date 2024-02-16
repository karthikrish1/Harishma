package overrriding;

public class child extends parent {

	public static void main(String[] args) {
		
		//call overriden method
		
		parent p= new parent();
		p.area();
		
		//call overriding method
		
		child c= new child();
		c.area();
	}
	
	
	//overriding method
	public void area()
	{
		int l=50;
		int b=30;
		System.out.println("Area of rectangle is "+ l*b);
	}
}


