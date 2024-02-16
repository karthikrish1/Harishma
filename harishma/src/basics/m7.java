package basics;

public class m7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m7 ob=new m7();
		ob.rectangle(3, 4);
		System.out.println("Addition is "+ ob.add(3, 5));

	}
	
	public void rectangle(int l, int b)
	{
		System.out.println("area is "+ l*b);
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
}
