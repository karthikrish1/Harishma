package seleniumbuttons;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	
	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
				 ChromeDriver ob = new ChromeDriver();
				ob.get("https://www.letskodeit.com/practice");
				//method1
				
				/*ob.findElementById("bmwcheck").click();
				Thread.sleep(2000);
				ob.findElementById("benzcheck").click();
				Thread.sleep(2000);
				ob.findElementById("hondacheck").click();
				Thread.sleep(2000);*/
				
				//method2
				//collecting all the boxes 
				// storing in a list
				//iterating through it
				// during iteration, click on
				
				List<WebElement> l = ob.findElementsByXPath("//*[@name='cars' and @type='checkbox']");
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
