package seleniumnavigation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nav {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.get("http:\\www.google.com");
    driver.manage().window().maximize();
    
    //step1: visiting google,com, opening seleniumeasy.com in nearby tab
   //open seleniumeasy.com in new tab   
 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");


 
//step2:
 // getting control of first tab; driver.getwindowhandle()=> google.com ; parent=google.com
 // getting control of both tabs: driver.getwindowhandles()=> s1={google.com, seleniumeasy.com}

  String parent=driver.getWindowHandle();// control will be in the parent window //google
 // collecting all the handle
  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
  
  
  //step3: iteration
 
  
// iterate through the elements present in set
 
  Iterator<String> I1 = s1.iterator();  // hasNext , next()

  // hasnext=> whether content is there
  // next -> read the content 
  
 
while(I1.hasNext())// whether any content is there 
    {
      String child_window=I1.next();
      if(!parent.equals(child_window))// picking the seleniumeasy.com
    	  { // control is moved to child window 
        driver.switchTo().window(child_window);
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.findElementByLinkText("Maven").click();
        Thread.sleep(4000);
        driver.close();
      } 
      
      /*parent=google     s1={google, seleniumeasy.com}
       * 
       * first iteration: I1 points to google.com
       *    I1.hasnext=> have content 
       *        I1.next reads google => child_window = google
       *         
       *         if parent!=child_window
       *            google!=gooogle//loop terminate ; no match
       *            
       * second iteration   
       * 
       * I1 points to seleniumeasy.com
       *   I1.hasnext => ahve content
       *       I1.next => selenium    child_window=seleniumeasy.com
       *       
       *       if parent!=child_window
       *          google!=seleniumeasy.com
       *              switching control to child_wn, seleniumeasy.com
       *              title
       *              4 seconds
       *              mave 
       *              4 seconds
       *              close 
       *  third iteration: i1 points to nothing 
       *       * * 
       * 
       * 
       * 
       * */
  }

    driver.switchTo().window(parent);//google 
    System.out.println(driver.getTitle());// google
    //driver.findElement(By.linkText("Images")).click();
    Thread.sleep(5000);
    driver.findElementByLinkText("Images").click();
    Thread.sleep(5000);
    driver.quit();
}
}



 





