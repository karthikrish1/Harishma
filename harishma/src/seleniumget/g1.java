package seleniumget;

import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		System.out.println(ob.getTitle());
		
		System.out.println(ob.getCurrentUrl());
		
		//size:  height and width of the window
		//Dimension  
		System.out.println(ob.manage().window().getSize());
		
		//position: x and y value of the window
		// Point
		
		System.out.println(ob.manage().window().getPosition());
		
		//browser details: capabilities
		System.out.println(ob.getCapabilities());
		
		ob.quit();
	}

}
