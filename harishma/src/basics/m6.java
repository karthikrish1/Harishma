package basics;

public class m6 {

	public static void main(String[] args) {
		m6 ob= new m6();
		System.out.println("Addition is "+ ob.div());
		System.out.println("Area is "+ob.area());

	}
	
	public int div()
	{
		int a=40;
		int b=4;
		return a/b;
	}
	
	private double area()
	{
		double s=3.4;
		return s*s;
	}

}
