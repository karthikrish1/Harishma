package seleniumbrowserutility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class rep {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.facebook.com");
	
	//create an object for point class
	//pass desired x and y in it
	// apply it on the window
	
	Point d= new Point(100,300);
	ob.manage().window().setPosition(d);

}
}
