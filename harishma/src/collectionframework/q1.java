package collectionframework;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {

	public static void main(String[] args) {
		// queue
		// not indexed
		//add
		//remove
		//retrive first element
		//accept duplicates
		//iterate
		//size limited
		//ArrayBlockingQueue<Datatype> name= new ArrayBlockingQueue<>(size);
		
		ArrayBlockingQueue<Double> n= new ArrayBlockingQueue<>(4);
		n.add(3.4);
		n.add(9.8);
		n.add(2.4);
		n.add(2.3);
		System.out.println(n);
		
		//remove : value
		n.remove(2.3);
		System.out.println(n);
		
		System.out.println(n.peek());
		
		for(double a:n)
		{
			System.out.println(a);
		}
	}

}
