package overloading;
public class o2 {
public static void main(String[] args) {
		o2 ob= new o2();
		ob.area();
		ob.area(3);
		ob.area(3.4);
		ob.area(30, 4.5);
		ob.area(3.4, 20);
}public  void area()//0
	{
		System.out.println("hi");
	}
	public  void area(int s)//1
	{
		System.out.println("area of square is "+ s*s);
	}
	public  void area(double r)
	{
		System.out.println("area of circle is "+ 3.14*r*r);
	}
	public  void area(int a, double b)
	{
		System.out.println("area of rectangle is "+ a*b);
	}
	public  void area(double b, int a)
	{
		System.out.println("area of triangle is "+ 0.5*a*b);
	}
	
	

}
