package Com.Mercury.Test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightFinderRegressionSuite {
	
	WebDriver driver;
	MethodRepository mr = new MethodRepository();
	
	@BeforeMethod
	public void appLaunch() throws InterruptedException
	{
		mr.browserAppLaunch();
	}
	
	/*
	 * TC_001: Verifying default selection of flight type.
	 */
	@Test(priority = 0, enabled=true, description="TC_001: Verifying default selection of flight type.")
	public void verifyDefaultSelectionFlightType() {
		try {
			mr.login("dasd", "dasd");
			Assert.assertEquals(true, mr.verifyDefaultSelectionRoundTrip());
		}
		catch(Exception e) {
			System.out.println(e);
			}
		}
	
	/*
	 * TC_002: Verifying departing from desired value selection.
	 */
	@Test(priority = 1, enabled=true, description="TC_002: Verifying departing from desired value selection.")
	public void verifyDepartingFromValueSelection() {
		try {
			mr.login("dasd", "dasd");
			Assert.assertEquals(true, mr.departingFromValueSelection());
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	@AfterMethod
	public void closeApp() {
		mr.appClose();
	}

}
