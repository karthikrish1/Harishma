package seleniumbrowserutility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class res {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//create an object for dimension class
		//pass desired width and height in it
		// apply it on the window
		
		Dimension d= new Dimension(100,300);
		ob.manage().window().setSize(d);
		
	}

}
