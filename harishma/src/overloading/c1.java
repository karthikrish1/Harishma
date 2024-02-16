package overloading;
public class c1 {
	public static void main(String[] args) {
		 new c1();
		 new c1(3);
		 new c1(3.4);
		 new c1(3,4.5);
		 new c1(4.5,10);
		 
		 //average of two numbers, three numbers, four numbers
		 //static, nonstatic and constructor 
		}
	public c1()
	{
		System.out.println("constructor");
	}
	public c1(int s)
	{
		System.out.println("Area of square is "+ s*s);
	}
	public c1(double d)
	{
		System.out.println("Area of circle is "+ 3.14*d*d);
	}
	public c1(int s, double r)
	{
		System.out.println("Area of rectangle is "+ s*r);
	}
	public c1(double r, int s)
	{
		System.out.println("Area of triangle is "+ 0.5*r*s);
	}

}
