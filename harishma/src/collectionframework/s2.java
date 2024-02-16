package collectionframework;

import java.util.TreeSet;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>t= new TreeSet<>();
		t.add(90);
		t.add(3);
		t.add(400);
		t.add(10);
		t.add(0);
		t.add(10);
		System.out.println(t);
		
		t.remove(0);
		System.out.println(t);
		
		for(int x:t)
		{
			System.out.println(x);
		}
	}

}
