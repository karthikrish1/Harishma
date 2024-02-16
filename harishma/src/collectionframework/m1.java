package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {

	public static void main(String[] args) {
		/*map
		 *   container where elements will be stored along with its key
		 *   
		 *   key: any datatype
		 *   element: any datatype
		 *   add
		 *   remove
		 *   retrive
		 *   
		 *   TreeMap       : keys:  alphabeticaal/ascnding 
		 *   LinkedHashMap: keys: insertion order
		 *   HashMap    : keys: random order
		 *   
		 *   TreeMap<dtyeofkye,dtypeofelement> name= new TreeMap<>();
		 * 
		 * */

		
		TreeMap<Integer,Character> n= new TreeMap<>();
		n.put(20, 'a');
		n.put(0, 'l');
		n.put(90, 'l');
		n.put(200, 'b');
		n.put(60, 'd');
		n.put(20, 'z');
		System.out.println(n);
		
		
	LinkedHashMap<Integer,Character> n1= new LinkedHashMap<>();
		n1.put(20, 'a');
		n1.put(0, 'k');
		n1.put(90, 'l');
		n1.put(200, 'b');
		n1.put(60, 'd');
		System.out.println(n1);
		
		HashMap<Integer,Character> n11= new HashMap<>();
		n11.put(20, 'a');
		n11.put(0, 'k');
		n11.put(90, 'l');
		n11.put(200, 'b');
		n11.put(60, 'd');
		System.out.println(n11);
	}

}
