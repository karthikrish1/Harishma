package basics;

public class m1 {

	public static void main(String[] args) {
		
m1.display();
m1.div();
		
	}
	
	
	public static void display()
	{
		int a=4;
		int b=20;
		System.out.println("Addition of two numbers "+ (a+b));
	}
	
	
	private static void div()
	{
		int a=30;
		int b=3;
		System.out.println("division is "+ a/b);
	}
	

}




/*method: block of cde which performs certain action
 * 
 * static 
 * nonstatic methd
 * 
 * method should be created outside the main method, inside the class
 * method should be called inside the main method
 * 
 * static: fixed memory space
 * 
 * syntax for creation:  accesmodifier static returntype name(){}
 * syntax for calling :  classname.methodname();
 * 
 * 
 * accesmodifier: public, pricate, protected
 * returntype:    void, int, double, float, boolean, string, char
 ** 
 * */