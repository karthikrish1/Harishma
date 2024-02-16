package basics;

public class m66 {

	public static void main(String[] args) {
		
		//parameter: variable passed to a function definition
		// argument: value assigned to the parameter while calling it
		
		m66.details("dhivya", 10);
		System.out.println(m66.add(30, 50));
		
	}
	
	public static void details(String name, int age )
	{
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
	}
	
	
	public static int add(int a, int b)
	{
		return a+b;
	}
}
