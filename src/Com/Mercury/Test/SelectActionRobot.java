package Com.Mercury.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import java.io.IOException;

public class SelectActionRobot 


{
	 
	static WebDriver driver;

/*
 * Login with Action
 */
		public void loginAction() throws InterruptedException 
  {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	          driver = new ChromeDriver();

	          driver.manage().window().maximize();

	          Thread.sleep(3000);

	          driver.get("http://newtours.demoaut.com/");
	          
	 WebElement uName =driver.findElement(By.xpath("//input[@name='userName']"));
    	 		
	 		Actions builder1 = new Actions(driver);
	 		builder1.moveToElement(uName).click().perform();
	 		builder1.sendKeys(uName,"dasd").perform();
	 			Thread.sleep(3000);
	 
	 WebElement Pwd = driver.findElement(By.xpath("//input[@name='password']"));
	 	    Actions builder2 = new Actions(driver);
	 		builder2.moveToElement(Pwd).click().perform();
	 		builder2.sendKeys(Pwd,"dasd").perform();
	    		Thread.sleep(3000);
	 
	 WebElement login =driver.findElement(By.xpath("//input[@value='Login']"));
	    	Actions builder3 = new Actions(driver);
	    	builder3.moveToElement(login).build().perform();
	    	builder3.click(login).build().perform();
	    		Thread.sleep(3000);
	     		
	    		/*
	    		 * Drag and drop down with Action
	    		 */
	    		
	  WebElement src = driver.findElement(By.xpath("//input[@name='userName']"));
	  WebElement dest = driver.findElement(By.xpath("//input[@name='password']"));
	    		
	    		Actions builder4 = new Actions(driver);
	    		builder4.dragAndDrop(src, dest).perform();
	    		  		

       
}


/*
 * Select drop down with Action
 */

	public void DepartDate() throws InterruptedException 
	{
  
		WebElement Date = driver.findElement(By.xpath("//Select[@name='fromMonth']"));
		Actions SelDate = new Actions(driver);
		SelDate.moveToElement(Date).click().perform();
		SelDate.keyDown(Date, "5").click().perform();
	}
	
	
  /*public void RobotSelDate() throws AWTException , InterruptedException 
  {
   Robot r1 = new Robot();
   r1.keyPress(KeyEvent.VK_KP_DOWN);
   
  }
  public void SelectDate()
 {
   WebElement Date = driver.findElement(By.xpath("//Select[@name='fromMonth']"));
   Actions SelDate = new Actions(driver);
   SelDate.moveToElement(Date).build().perform();
 }
  
}*/

}
