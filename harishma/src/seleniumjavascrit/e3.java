package seleniumjavascrit;

import org.openqa.selenium.chrome.ChromeDriver;

public class e3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.seleniumeasy.com");
		
		//vertical scroll: along y axis, x axis
		//horizontl     : alomg x axis, y value
		
	/*	ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");// down : y
		Thread.sleep(3000);
		
		ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");//up : -y
		Thread.sleep(3000);
		*/
		
		ob.executeScript("window.scrollBy(0,1000)");// down : y
		Thread.sleep(3000);
		
		ob.executeScript("window.scrollBy(0,-1000)");//up : -y
		Thread.sleep(3000);
		ob.quit();
	}

}
