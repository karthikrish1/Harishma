package collectionframework;

import java.util.ArrayList;

public class l1 {
// store large amount of data under single name:  
	// list, queue, map, set, table
	public static void main(String[] args) {
		/*list
		 *   index based
		 *   add 
		 *   remove
		 *   retrive
		 *   iterate 
		 *   accept duplicates
		 *   syntax:
		 *      ArrayList<Datatype> name= new ArrayList<>();
		 *      int=>Integer
		 *      String=> String
		 *      boolean=> Boolean
		 *      char=> Character 
		* */
		ArrayList<String>l= new ArrayList<>();
		l.add("hi");
		l.add("ab");
		l.add("cd");
		l.add("ef");
		l.add("hi");
		//   index       0     1   2     3    4    
		//               30   20   10   20   400
		System.out.println(l);
		
		//remove :  know the index 
		l.remove(2);
		System.out.println(l);
		
		//retrival: know the index
		System.out.println(l.get(0));
		
		System.out.println("Elements are :");
		//enhanced for /for each 
		//for(datatype temovariable:nameofthecollection)
		for(String x:l)
		{
			System.out.println(x);
		}
		
		
	}
}
