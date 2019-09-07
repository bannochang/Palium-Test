package TestNG.Start;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics 

{
	@BeforeSuite
	public void setup()
	{
		System.out.println("System set up for chrome");
	}
	
	@BeforeClass
	public void launchbrowser()
	{
		System.out.println("Launch Chrome Browser");
		
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("Login to Chrome Browser");
		
	}

	@Test
	public void GoogleTitleCheck()
	{
		System.out.println("Check the Title of Google");
	}
	
	@AfterMethod
	public void DelCookies()
	{
		System.out.println("Delete all Cookies`2");
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("Close Chrome Browser");
		
	}
	
	@AfterTest
	public void logout()
	{
		System.out.println("Logout of Chrome Browser");
	}
	
	
	@AfterSuite
	public void Report()
	{
		System.out.println("Generate Test Report");
	}	
}
