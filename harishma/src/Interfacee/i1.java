package Interfacee;

public class i1 implements Intro{

	
	public static void main(String[] args) {
		
		i1 ob= new i1();
		ob.ab();
		ob.n();
	}

	@Override
	public void ab() {
		System.out.println("im abstract method");
		
	}
}
