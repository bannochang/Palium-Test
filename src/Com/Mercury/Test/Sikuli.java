package Com.Mercury.Test;

import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.gargoylesoftware.htmlunit.javascript.host.Screen;

public class Sikuli {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	
	  {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

         driver = new ChromeDriver();

         driver.manage().window().maximize();

         Thread.sleep(3000);

         driver.get("http://newtours.demoaut.com/");
         
         Screen screen = new Screen();
         
         Pattern Uname = new Pattern("./sikuliApps/UserName.PNG");
         
         screen.
         
         
         

         //Screen screen = new Screen();

         Pattern btnLogin = new Pattern("./sikuliApps/BTNLOGIN.PNG");

         screen.click(BTNLOGIN);

   }
	}


