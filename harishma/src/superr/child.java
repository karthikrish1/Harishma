package superr;

public class child extends parent{
	int age=0;
public static void main(String[] args) {
	
	child c= new child();
	c.display();
	
}

public void display()
{
	System.out.println(age);
	super.display();//parent display ,ethod
	System.out.println(super.age);//
	
}
}
