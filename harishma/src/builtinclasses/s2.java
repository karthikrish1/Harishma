package builtinclasses;

public class s2 {

	public static void main(String[] args) {
		// String buffer
		
		StringBuffer n= new StringBuffer("Welcome");
	//  index     0   1   2   3    4   5   6     
			//   W   e    l   c    o   m   e
			System.out.println(n.length());
			
			System.out.println(n.charAt(1));
			
			System.out.println(n.indexOf("c"));
			
			//apppend
			System.out.println(n.append("hello"));
			//insert
			System.out.println(n.insert(1, "m"));
			
			//delete
			System.out.println(n.deleteCharAt(1));
			System.out.println(n.delete(7, 12));
			
			//reverse
			System.out.println(n.reverse());
			System.out.println(n.reverse());
			
			System.out.println(n.replace(0, 3, "RRR"));
			
			System.out.println(n);
	}

}
