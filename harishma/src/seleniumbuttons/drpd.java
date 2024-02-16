package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpd {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		/*create an object for select clss
		 * pass dropdown box as input to the select 
		 *      index
		 *      value
		 *      visible text
		 *      
		 * only one option at a time can be selected 
		 * 
		 * 
		 * */
		/*WebElement ele = ob.findElementById("carselect");
		Select s= new Select(ele);
		//s.selectByIndex(1);
		//s.selectByValue("benz");
		s.selectByVisibleText("Benz");*/
		
		ob.findElementByCssSelector("#carselect > option:nth-child(2)").click();
		
	}

}
