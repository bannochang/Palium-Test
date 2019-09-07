package Com.Mercury.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoIT 

	{
		
		static WebDriver driver;
	/*

	      * Photo Upload with AutoIT

	      */

	     public void autoITTest() throws InterruptedException, IOException {

	          System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

	          driver = new ChromeDriver();

	          driver.manage().window().maximize();

	          driver.get("https://imgbb.com/");

	          Thread.sleep(4000);

	          WebElement btnStartUpload = driver.findElement(By.xpath("//a[@class='btn btn-big blue']"));

	          btnStartUpload.click();

	          Thread.sleep(2000);

	          Runtime.getRuntime().exec("./AutoITExe/AutoIT-1.exe");

	          Thread.sleep(6000);

	          WebElement btnUpload = driver.findElement(By.xpath("//button[@class='btn btn-big green']"));

	          btnUpload.click();

	          Thread.sleep(5000);

	     }
	     
	     
	     public void autoitpractice () throws InterruptedException, IOException
	     
	     {
	     
	     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

         driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("https://imge.to/");
         
         Thread.sleep(4000);
         
         WebElement Uploadbtn = driver.findElement(By.xpath("//a[@class ='btn btn-big green']"));
         
         if (Uploadbtn.isDisplayed());
         {
        	 Uploadbtn.click();
         
        	 
         System.out.println("System is ready to upload");
         
         //Uploadbtn.click();
         
         }
         
         Thread.sleep(2000);
         
         Runtime.getRuntime().exec("./AutoITExe/AutoIT-1.exe");
         
         //WebElement btnupld = driver.findElement(By.xpath("//*[@id='anywhere-upload-submit']/div[1]/button)"));
         
         WebElement btnupld = driver.findElement(By.xpath("//button[@class='btn btn-big green']"));
         
         /*if (btnupld.isDisplayed());
         {
        	 btnupld.click();*/
         
         	Actions builder = new Actions(driver);
	    	builder.moveToElement(btnupld).build().perform();
	    	builder.click(btnupld).build().perform();
	    	Thread.sleep(3000);
         
        	 
         System.out.println("uploadSuccessful");
         }

	}


