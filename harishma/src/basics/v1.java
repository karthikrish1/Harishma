package basics;

public class v1 {

	public static void main(String[] args) {
		m1.display();
		/*
		 * variable:  name given to a memory location
		 * 
		 * syntax for variable declaration: datatype variablename=value;
		 * word:     String
		 * letter:   char
		 * number :  int
		 * 
		 *             double    : 16 digts
		 *              float     : 8 digits,f 
		 * true/false: boolean 
		 * 
		 * 
		 * */
	    String n="dhivya";
		char letter='k';
		int age=30;
		double height=162.3;
		float weight=60.5f;
		boolean result=true;
		
		System.out.println("Name is     "+n);
		System.out.println("Initial is "+ letter);
		System.out.println("Age is "+ age);
		System.out.println("Height is "+ height);
		System.out.println("Weight is "+ weight);
		System.out.println("REsult is "+ result);
		
		
		int m=3;
		int n1=30;
		System.out.println("addition of two numbers "+ (m+n1));
		System.out.println("subtractiontion of two numbers "+ (n1-m));
		System.out.println("product of two numbers "+ (m*n1));
		System.out.println("division of two numbers "+ (n1/m));
		System.out.println("Average is "+ (m+n1)/2);
		
		         //addition of three numbers
				// product of three numbers
				//division of two numbers
				//subtraction of two numbers
				// average  of three numbers 
		//area f square: side*side
		// area f rectangle: l*b
		// area of circle " 3.14*r*r
		float r=9.7f;
		System.out.println("area of circle is "+ 3.14*r*r);
		
	}
}
