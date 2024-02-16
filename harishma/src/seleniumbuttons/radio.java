package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {
	public static void main(String[] args) throws InterruptedException {
		
		//only one option can be selected at a time
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		//method1
		
		/*ob.findElementById("bmwradio").click();
		Thread.sleep(2000);
		ob.findElementById("benzradio").click();
		Thread.sleep(2000);
		ob.findElementById("hondaradio").click();
		Thread.sleep(2000);*/
		
		//method2
		//collecting all the buttons
		// storing in a list
		//iterating through it
		// during iteration, click on
		
		List<WebElement> l = ob.findElementsByXPath("//*[@name='cars' and @type='radio']");
		for(WebElement x:l)
		{
			if(x.isDisplayed())
			{
				x.click();
				Thread.sleep(2000);
			}
		}
		ob.quit();
	}

}
