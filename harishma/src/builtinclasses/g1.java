package builtinclasses;

import java.util.Scanner;

public class g1 {
public static void main(String[] args) {
	
	//scanner: get input from the user at run time
	//nonstatic
	//string: nextLine()
	//integer: nextInt()
	//double: nextDouble()
	//float: nextFloat()
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter your name: ");
	String n = s.nextLine();
	System.out.println("Enter ur age :");
	int age=s.nextInt();
	System.out.println("Enter ur salary :");
	double sal=s.nextDouble();
	System.out.println("Name is "+ n);
	System.out.println("Age is "+ age);
	System.out.println("Salary is "+sal);
}
}
