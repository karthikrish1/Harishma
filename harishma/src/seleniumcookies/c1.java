package seleniumcookies;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("http://www.google.com");
		System.out.println("Number of cookies before deletion "+ob.manage().getCookies().size());
		
		ob.manage().deleteAllCookies();
		System.out.println("Number of cookies after deletion "+ob.manage().getCookies().size());
		ob.quit();

	}

}
