package Com.Mercury.Test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginRegressionSuite {
	
	WebDriver driver;
	MethodRepository mr = new MethodRepository();
	
	@BeforeMethod
	public void appLaunch() throws InterruptedException
	{
		mr.browserAppLaunch();
	}
	
	/*
	 * TC_001: Verifying valid login functionality
	 */
	@Test(priority = 0, enabled=true, description="TC_001: Verifying valid login functionality")
	public void verifyValidLogin() throws InterruptedException
	{
		try {
				mr.login("dasd", "dasd");
				Assert.assertEquals(true, mr.verifyValidLogin());
			}
		catch(Exception e) {
				System.out.println(e);
			}
	}
	
	/*
	 * TC_002: Verifying invalid login functionality
	 */
	@Test(priority = 1, enabled=true, description="TC_002: Verifying invalid login functionality")
	public void verifyInvalidLogin() {
		try {
			mr.login("dasd1", "dasd1");
			Assert.assertEquals(true, mr.verifyInValidLogin());
		}
	catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@AfterMethod()
	public void appClose()
	{
		mr.appClose();
	}

}
