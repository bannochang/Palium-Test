package Com.Mercury.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable 
{

	static WebDriver driver; 
	
	public void webTable() throws InterruptedException 
    
	{
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

    driver = new ChromeDriver();

    driver.manage().window().maximize();

    Thread.sleep(3000);
    
    driver.get("http://demo.guru99.com/test/web-table-element.php");
		

	}
}

