package seleniumlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//images: img
		// links: a
		//elements: div, li, select, input
		
		//tagname:  cannot identify a single element
		
		//facebook=> images, links, input, div 
		
		List<WebElement> l = ob.findElementsByTagName("img");
		System.out.println("Number of images "+ l.size());
		
		List<WebElement> l1 = ob.findElementsByTagName("a");
		System.out.println("Number of links "+ l1.size());
		

		List<WebElement> l11 = ob.findElementsByTagName("div");
		System.out.println("Number of elements with div "+ l11.size());
		ob.quit();
		
		
		// seleniumeasy.com 
		// Protractor (with partial linktext)
		// Find number of images, links in it 
		
	}

}
