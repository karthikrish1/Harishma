package overloading;

public class o1 {
public static void main(String[] args) {
		o1.area();
		o1.area(3);
		o1.area(3.2);
		o1.area(30, 4.5);
		o1.area(3.4, 10);
		}
	public static void area()//0
	{
		System.out.println("hi");
	}
	public static void area(int s)//1
	{
		System.out.println("area of square is "+ s*s);
	}
	
	public static void area(double r)
	{
		System.out.println("area of circle is "+ 3.14*r*r);
	}
	public static void area(int a, double b)
	{
		System.out.println("area of rectangle is "+ a*b);
	}
	public static void area(double b, int a)
	{
		System.out.println("area of triangle is "+ 0.5*a*b);
	}
	
	
	
	
}



/*inheritance
 *polymorphism: overloading and overriding 
 *abstraction
 *encapsulation
 * 
 * 
 * overloading :   using same methodname for different purpose
 *                 showing difference  in number of parameters/datatype/sequence 
 *                 
 *                 static
 *                 nonstatic
 *                 constructor
 * 
 * 
 * */