package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class dpd {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("https://jqueryui.com/datepicker/");
		ob.switchTo().frame(0);
		
		//datebox
		ob.findElementById("datepicker").click();
		
		for(int i=0;i<2;i=i+1)
		{
			ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		
		ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(4) > td:nth-child(6) > a").click();
	}

}
