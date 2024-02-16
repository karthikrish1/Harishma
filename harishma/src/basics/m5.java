package basics;

public class m5 {

	public static void main(String[] args) {
		m5 ob=new m5();
		ob.div();
		ob.add();

	}
	public void div()
	{
		int a=40;
		int b=4;
		System.out.println("Division of two numbrs "+ a/b);
	}
	
	private void add()
	{
		double a=3.4;
		double b=4.5;
		System.out.println("Addition is "+ (a+b));
	}

}
/*nonstatic: doesnot contain fixed memory space
 * allocate separate memory space 
 * 
 * syntax for creation:   acccesmodifier returntype name(){}
 * 
 * syntax for calling:
 *  creating and naming object   :classname objectname=new classname();
 *  calling                       objectname.methodname();                 
 *** 
 * */
 