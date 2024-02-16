package basics;

public class m3 {

	public static void main(String[] args) {
		// parameter: variable passed to a function defintion
       //argument: value assigned to the parameter while calling it
		
		m3.details("hi", 30);
		m3.details("harishma", 10);
		System.out.println("Addition is "+ m3.add(3, 5));
	}
	
	public static void details(String name, int age)
	{
		System.out.println("Name is "+ name +"  "+ "Age is "+ age);
		
	}

	public static int add(int a, int b)
	{
		return a+b;
	}
}
