package basics;

public class m2 {

	public static void main(String[] args) {

		// method should be created outside the main method, inside the class
		// method should be called inside the main method
		// returntype other than void-> int, double, float, boolean...
		// creation: add return statement
		// calling:  sysout statement 
		
		System.out.println("Prduct is "+ m2.product());
		System.out.println("Average is "+ m2.average());;
		
}
	public static int product()
	{
		int m=4;
		int n=2;
		return m*n;
	}
	
	private static double average()
	{
		double a=3.2;
		double b=4.3;
		double c=(a+b)/2;
		return c;
	}

}
