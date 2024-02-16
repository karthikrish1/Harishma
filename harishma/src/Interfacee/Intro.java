package Interfacee;

public interface Intro {
	
	/*interface 
	 *    blue print of class
	 *    will not have static method
	 *    will not have main method
	 *    it will have abstract method without abstract keyword
	 *    it will have nonstatic method with default keyword
	 *    
	 *      its content will be revealed in class to which interface cnnects
	 *      class<=> class: extens
	 *      class<=> interface : implements
	 *      
	 *      class definition=> implements interfacename* 
	 * */
	
	default public void n()
	{
		System.out.println("nonstatic method");
	}

	
	public void ab();
	
}
