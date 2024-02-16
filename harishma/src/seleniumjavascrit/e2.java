package seleniumjavascrit;

import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
	 ChromeDriver ob = new ChromeDriver();
	ob.get("http://www.google.com");
	// in -> >100
	// out->  <100
	// nrml=> 100
	ob.executeScript("document.body.style.zoom='200%'");
	Thread.sleep(3000);
	ob.executeScript("document.body.style.zoom='100%'");
	Thread.sleep(3000);
	ob.executeScript("document.body.style.zoom='20%'");
	Thread.sleep(3000);
	ob.quit();
}
}
