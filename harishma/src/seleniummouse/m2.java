package seleniummouse;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob = new ChromeDriver();
		ob.get("https://jqueryui.com/droppable/");
		
		//webelements: inside the frame
		// switch your control to that frame
		//frame id, name or index
		ob.switchTo().frame(0);
		Actions ac= new Actions(ob);
		WebElement e1 = ob.findElementById("draggable");
		WebElement e2 = ob.findElementById("droppable");
		//ac.dragAndDrop(e1, e2).build().perform();
		
		//otherway
		ac.clickAndHold(e1).pause(Duration.ofSeconds(10)).moveToElement(e2).build().perform();
		ac.release(e1).build().perform();
	}

}
