package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ly {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.mycontactform.com");
	
	
	List<WebElement> l1 = ob.findElementsByTagName("a");
	System.out.println("Number of links "+ l1.size());
	for(WebElement x: l1)
	{
		System.out.println(x.getAttribute("href"));
	}
	
	ob.quit();
}
}
