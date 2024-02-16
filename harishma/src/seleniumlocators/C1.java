package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		//form-control ng-pristine ng-invalid ng-invalid-required ng-touched
		
		//css: casecade style sheet
		//syntax : 7 ways
		// shortcut: copy=> copy selector
		
		// 1. tagname and id       tagname#id
		//ob.findElementByCssSelector("input#user").sendKeys("hi");
		
		//2.tagname and classname    tagname.classname
		//ob.findElementByCssSelector("input.txt_log").sendKeys("hello");
		
		//3. tagname and attribute  tagname[attribute='value']
		//ob.findElementByCssSelector("input[type='text']").sendKeys("hi");
		
		//4.tagname and prefix of attribute  tagname[attribute^='prefix value']
		//ob.findElementByCssSelector("input[type^='te']").sendKeys("hi");
		
		//5.tagname and suffix of attribute  tagname[attribute$='suffix value']
		//ob.findElementByCssSelector("input[type$='xt']").sendKeys("hi");
		
		//6.tagname and substrng  of attribute  tagname[attribute*='substring value']
		//ob.findElementByCssSelector("input[type*='ex']").sendKeys("hi");
		
		//7.tagname , classname and attribute  tagname.classname[attribute=' value']
		//ob.findElementByCssSelector("input.txt_log[type='text']").sendKeys("hi");
		
		//copy=> copy selector
		ob.findElementByCssSelector("#user").sendKeys("hi");
		
		Thread.sleep(3000);
		ob.quit();
		
	}

}
