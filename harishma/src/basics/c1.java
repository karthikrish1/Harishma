package basics;

public class c1 {
public static void main(String[] args) {
		// constructor:   special method 
		//  take classname as its name
		//  initialisation
		//  doesnot contain retyrntype
		//syntax for creation: accesmodifier classname(){}
		// syntax for calling: new classname();
		// automatically invoked whenever an object is created 
		new c1();
		new c1(3);
		// default constructor: details, name,age
		// parameterised cons  : area of rectangle 

	}
	//default constructor
	public c1()
	{
		int s=3;
		System.out.println("Area of square is "+ s*s);
	}
	
	//parameterised constructor
	public c1(int r)
	{
		System.out.println("Area of circle is "+ 3.14*r*r);
	}

}
