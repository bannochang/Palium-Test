package Com.Mercury.Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MR 
{

	static WebDriver driver; 

     // ===============================================================================

       /*  

     *   Browser launch and application launch

     */

    public void browserMercuryAppLaunch() throws InterruptedException 
    {

          System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

          driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(3000);

          driver.get("http://newtours.demoaut.com/");
          
          //WebElement username = driver.findElement(By.name("userName"));
          //username.sendKeys("dasd");
          

          //WebElement pwd = driver.findElement(By.name("password"));
          //pwd.sendKeys("dasd");
          
          //WebElement login = driver.findElement(By.name("login"));
          //login.click();

          Thread.sleep(3000);
          
    }  
          
          /*

           * Simple login process with xpath locator

           */

       /* public void loginMercury() throws IOException, InterruptedException 
          {

              WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));
              uName.sendKeys("dasd");

              Thread.sleep(3000);
              
              WebElement pwd = driver.findElement(By.name("password"));

              pwd.sendKeys("dasd");

              Thread.sleep(3000);

          }  */
        
        
        /*

         * Simple login process with parameterized login method.

         */
        public void loginwithParameter(String Uname ,String Pwd)throws IOException, InterruptedException
        {
        	WebElement Username = driver.findElement(By.xpath(("//input[@name='userName']")));
        	Username.sendKeys(Uname);
        	WebElement Password = driver.findElement(By.xpath(("//input[@name= 'password']")));
        	Password.sendKeys(Pwd);
        }
        
        public void loginMercuryClick() throws IOException, InterruptedException
        
        {

              WebElement login = driver.findElement(By.name("login"));

              login.click();
        }
        
        //Verify Login
         
        public void verifylogin()
        {
        	String Exptitle =  "Welcome: Mercury Tours";
        	String ActualTitle = driver.getTitle();
        	System.out.println("Actual Title of the page "+ ActualTitle );
        	if (ActualTitle.equals(Exptitle))
        	{	
        	System.out.println("Test Case Passed");
        	}
        	else
        	{
             System.out.println("Test case failed");
        	}
        		
        }
        
       /* public void selectcity ()
        {
      	  WebElement departfrom = driver.findElement(By.name("fromPort"));
      	  Select sel = new Select(departfrom);
      	  //sel.selectByValue("New York");
      	  //sel.selectByVisibleText("Paris");
      	  sel.selectByIndex(6);
					
		}*/
        
        public void selectcity ()
        {
           WebElement departfrom = driver.findElement(By.name("fromPort"));
           if(departfrom.isDisplayed())
           {
           Select sel = new Select(departfrom);
           //sel.selectByValue("New York");
           //sel.selectByVisibleText("Paris");
           sel.selectByIndex(6);
           System.out.println("Source City Identified");
           }    
           
        }  
       public void flyers() 
       {
        WebElement Passenger = driver.findElement(By.xpath(("//select[@name = 'passCount']")));
        Select sel = new Select(Passenger);
        sel.selectByValue("3");
        System.out.println("Three Passengers Will be Flying");         
                  
       }
        
      public void arrivalcity()
      {
       WebElement destcity = driver.findElement(By.xpath(("//select[@name = 'toPort']")));
       Select sel = new Select(destcity);
       sel.selectByVisibleText("London");
       System.out.println("Three Passengers Will be Arriving @ LONDON");
       
      }
      
      public void airlines ()
      {
       WebElement Airlines = driver.findElement(By.xpath("//select[@name = 'airline' ]"));
       Select sel = new Select(Airlines);
      // sel.selectByValue("Unified Airlines");
       sel.selectByVisibleText("Unified Airlines");
       System.out.println("Three Passengers Will be traveling by Unified Airlines");
       
            
      } 
      
      public void contd()
      {
    	WebElement cont = driver.findElement(By.xpath("//input[@type = 'image']"));
    	if (cont.isDisplayed());
    	{
    		cont.click();
    		System.out.println("Booking Successful");
    	}
    	
    	  
      }
}
        
   
              
              /*public void selectcity ()
              {
            	  WebElement departfrom = driver.findElement(By.name("fromPort"));
            	  Select sel = new Select(departfrom);
            	  sel.selectByValue("NewYork");
            	  //sel.selectByVisibleText("Paris");
            	  //sel.selectByIndex(6);
            	  
            	  
    }
              //Login With Robot
              
              
              
		
    public void MMT() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.get("https://www.makemytrip.com");
        
        driver.close();
         
        

        Thread.sleep(3000);

    }

	

}*/
