package abstraction;

abstract public class parent {
	
	public void nm()
	{
		System.out.println("im nrml method");
	}
	
	
	abstract public void ab();
	/*abstraction:    hiding implementation details
	 * follows inheritance
	 * can be achieved through abstract class and abstractmethod
	 * 
	 * class=> abstract class: add abstract keyword
	 * abstract class: nrml method and abstract method
	 * 
	 * abstract method:
	 *      nonstatic
	 *      abstract keyword
	 *      will be empty in its place
	 *      will be redefined in its child class
	 *      
	 *cannot create an object for abstrct class 
	 * 
	  * */

}
