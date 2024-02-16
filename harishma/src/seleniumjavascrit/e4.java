package seleniumjavascrit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e4 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
	 ChromeDriver ob = new ChromeDriver();
	ob.get("http://www.mycontactform.com");
	
	//alert: popup, messagebox
	
	//ob.executeScript("alert('time out')");
	
	ob.executeScript("window.confirm('time out')");
	Thread.sleep(3000);
	Alert al = ob.switchTo().alert();
	al.accept();
}
}
