package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {

	public static void main(String[] args) {
		
		//xpath: xml path language
		// absolute xpath
		     //    starts with /
		     //    finding the element from the root
		     //    copy=> copy full xpath
		
		//relative xpath
		     // starts with //
		    // copy=> copy xpath
		
		    // syntax: //*[@loct/attribute='value']    or //taggname[@loc/attribute='value']
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		//ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input").sendKeys("hi");
	//ob.findElementByXPath("//*[@id=\"user\"]").sendKeys("hi");
		//loc
		
		//ob.findElementByXPath("//*[@id='user']").sendKeys("Dhivyakarthi123");
		
		//attribute 
		
		//Findelement=> WebElement
		//findElements=> List<WebElement>
		
		//xpath=> total number of elements, images, links, elemnts with common tag 
		//  tagname=> images, links elements with common tag 
		
		System.out.println("Number of images"+ ob.findElementsByTagName("img").size());
		
		System.out.println("total number of elements "+ ob.findElementsByXPath("//*").size());
		
		
		System.out.println("Number of images "+ ob.findElementsByXPath("//img").size());
		
		System.out.println("Number of links "+ ob.findElementsByXPath("//a").size());
		
		System.out.println("Number of elemnts  with div "+ ob.findElementsByXPath("//div").size());
		
		ob.quit();
	
	
	}
}


