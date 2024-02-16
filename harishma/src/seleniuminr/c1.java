package seleniuminr;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {
	
	// right click=> project=> properties=> java buildpath-> libraries
	//        -> select class path-> add external jar=> browse=> selenium hq server standalone jar
	
	//once a project 
	
	public static void main(String[] args) throws InterruptedException {
		//STEP1: CONFGURING THE CHROME DRIVER
		//step2: creating object for chromdriver class
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
		
		//max
		ob.manage().window().maximize();
		
		//refresh
		
		ob.navigate().refresh();
		
		//hold the page 
		
		Thread.sleep(3000);
		
		
		//close,quit
		ob.quit();
	}

}                                                                                                                                                                                     
