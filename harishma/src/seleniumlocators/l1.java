package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//id
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		
		//name
		ob.findElementByName("pass").sendKeys("12345");
		
		//classname
		ob.findElementByClassName("btn_log").click();
		
	}
	
	//before test: visit
	//after test: closing
	//tc1: both valie
	//tc2: both invalid 
	//apply parameterisation
}
