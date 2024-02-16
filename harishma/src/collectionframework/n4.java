package collectionframework;

import java.util.Hashtable;
import java.util.TreeMap;

public class n4 {
public static void main(String[] args) {
	//HashMap:  for every run=> diff order
	//Hashtable: first => order
	
	//hashtable
	//key:Double
	// element:float 
	
	Hashtable<String,Character> n= new Hashtable<>();
	n.put("goa", 'a');
	n.put("chennai", 'l');
	n.put("punjab", 'l');
	n.put("kerala", 'b');
	n.put("karnataka", 'd');
	n.put("delhi", 'z');
	System.out.println(n);
	
	//remove:  know the key
	n.remove("delhi");
	System.out.println(n);
	
	//retrive : know the key
	System.out.println(n.get("goa"));
	
	//keys
	System.out.println(n.keySet());
	
	//values
	System.out.println(n.values());
}
}
