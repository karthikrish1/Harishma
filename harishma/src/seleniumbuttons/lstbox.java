package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lstbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		/*WebElement ele = ob.findElementById("multiple-select-example");
		Select s= new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("orange");
		s.selectByVisibleText("Peach");
		Thread.sleep(3000);
		//s.deselectAll();
		s.deselectByIndex(1);*/
		
		ob.findElementByCssSelector("#multiple-select-example > option:nth-child(1)").click();
		ob.findElementByCssSelector("#multiple-select-example > option:nth-child(2)").click();
		Thread.sleep(3000);
		ob.findElementByCssSelector("#multiple-select-example > option:nth-child(2)").click();
		
	}

}
