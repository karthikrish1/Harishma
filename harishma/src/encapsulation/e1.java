package encapsulation;

public class e1 {
	/*
	 *encapsulation: hiding data
	 *
	 * doesnot follow inheritance
	 * declare the variable as prive
	 * must nt assign value straightly to the variable
	 * acess the variable through setter and getter 
	 * setter: assign value to the variable
	 * getter: view the value stored in the variable
	 * 
	 * setter, getter: public, nonstatic 
	 ** */
	
	private String password;
	
	public void set(String p)
	{
		password=p;
	}
	
	public void get()
	{
		System.out.println(password);
	}

}
