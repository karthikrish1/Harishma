package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		
		// linktext: word/words=> click on it a new url will be opened
		//           a
		//partial linktext: substring of linktext
	    // no need for code inspection 
		
		//ob.findElementByLinkText("Terms").click();
		
		ob.findElementByPartialLinkText("Te").click();
	}

}
