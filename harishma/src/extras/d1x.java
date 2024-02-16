package extras;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class d1x {
public static void main(String[] args) {
	
	
	//dynamic xpath
	
	//1. and 
	
	//2. contains            syntax:  //*[contains(@loc/attrbute,'value')]
	
	//3.starts-with         syntax:   //*[starts-with(@loc/attribute,'value')]
	
	//4.text                syntax: //*[text()='value']
	
	//5. following         syntax: sourcelementxpath//following:: tagnameofdesired element 
	
	//6. preceding          syntax: sourcelementxpath//preceding:: tagnameofdesired element
	
	//7. parent              syntax: childxpath//parent::tagnameofparent
	
	//8. child                syntax:parentxpath//child::tagnameofchild 
	
	//9. following-sibling     syntax: siblingxpath//following-sibling::tagnameofdesiredsibling
	
	//10.preceding-sibling      syntax: siblingxpath//preceding-sibling::tagnameofdesiredsibling
	
	//11.ancestor:   parent, grandparent
	
	//12. descendant :  child, grandchild
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("http://www.mycontactform.com");
	
	//username text box   
	//ob.findElementByXPath("//*[contains(@name,'user')]").sendKeys("hi");
	
	
	//ob.findElementByXPath("//*[starts-with(@name,'user')]").sendKeys("hi");
	
	//ob.findElementByXPath("//*[text()='Help']").click();
	
	//ob.findElementByXPath("//*[@id=\"user\"]//following::input[2]").click();
	
	//ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input//preceding::input[2]").sendKeys("hi");
	
//Point p = ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[3]//parent::div").getLocation();
//System.out.println(p);
	
	//String text=ob.findElementByXPath("//*[@id=\"right_col_bottom\"]//child::p[2]").getText();
	//System.out.println(text);
	
	System.out.println(ob.findElementByXPath("//*[@id=\"right_col_bottom\"]/p[4]//preceding-sibling::p[1]").getText());

ob.quit();
}
}
