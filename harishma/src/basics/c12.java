package basics;

public class c12 {

	public static void main(String[] args) {
		// constructor
		// take classname as its name
		// doesnot contin returntype
		// automatically will be called whenever an object is created
		
		//syntax for creation: public classname(){}
		//syntax for calling:  classname objectname= new classname();
		
		c12 ob= new c12();
		ob.ab();
		
		
		}
	public c12()
	{
		int l=30;
		int b=300;
		System.out.println("Area of rectangle is "+ l*b);
	}

	
	public void ab()
	{
		System.out.println("im nonstatic ");
	}
}
