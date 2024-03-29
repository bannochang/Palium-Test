package Com.Mercury.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodRepository {
	
	WebDriver driver;
	
	public void browserAppLaunch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(4000);
	}
	
	public void login(String userName, String password) throws InterruptedException
	{
		WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));
		uName.sendKeys(userName);	
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys(password);
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		Thread.sleep(4000);
	}
	
	public boolean verifyValidLogin()
	{	
			String expTitle = "Find a Flight: Mercury Tours:";
			String actTitle = driver.getTitle();
			if(expTitle.equals(actTitle)) {
				return true;
			}else {
				return false;
			}
	}
	
	public boolean verifyInValidLogin()
	{
		String expTitle = "Find a Flight: Mercury Tours:";
		String actTitle = driver.getTitle();
		
		if(expTitle!=(actTitle)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verifyDefaultSelectionRoundTrip() {
		
		WebElement radioBtnOneWay = driver.findElement(By.xpath("//input[@value='oneway']"));
		WebElement radioBtnRoundTrip = driver.findElement(By.xpath("//input[@value='roundtrip']"));
		
		if(radioBtnRoundTrip.isSelected() == true && radioBtnOneWay.isSelected() == false)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public boolean departingFromValueSelection()
	{
		WebElement drpdwnDepartingFrom = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s1 = new Select(drpdwnDepartingFrom);
		
		Utility.waitTill(3000);
		
		s1.selectByVisibleText("London");
		
		Utility.waitTill(5000);
		
		if(drpdwnDepartingFrom.getText().equals("London"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public void appClose()
	{
		driver.close();
	}
}
