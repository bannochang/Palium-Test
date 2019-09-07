package Com.Mercury.Test;

import jxl.read.biff.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelPrint 

{
	static WebDriver driver;
	
	public static void main(String[] args)throws BiffException, IOException, InterruptedException 
	
	{
			
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				driver = new ChromeDriver();

				driver.manage().window().maximize();

				Thread.sleep(3000);

				driver.get("http://newtours.demoaut.com/");
		
	    
				FileInputStream F1 = new FileInputStream("./ExcelTest/Excel-Palium.xls");
		
				Workbook WB = Workbook.getWorkbook(F1);
		
				Sheet sh1 = WB.getSheet("TestData");
		
				int rows = sh1.getRows();
				
				int cols = sh1.getColumns();
		
				for(int i=1;i<rows;i++)
				{
					for (int c = 0;c<=cols;c++)
					{
						
					String uname = sh1.getCell(c, i).getContents();
					//String PWD = sh1.getCell(1, i).getContents();
			
					Thread.sleep(2000);
			
					WebElement Username = driver.findElement(By.xpath(("//input[@name='userName']")));
					Username.sendKeys(uname);
					
					
					
					String PWD = sh1.getCell(c, i).getContents();
					
					WebElement Password = driver.findElement(By.xpath(("//input[@name= 'password']")));
					Password.sendKeys(PWD);
					
					Thread.sleep(2000);
					
	    	
					WebElement login = driver.findElement(By.name("login"));
					login.click();
	        
	        
					driver.navigate().back();
					
					WebElement Username1 = driver.findElement(By.xpath(("//input[@name='userName']")));
					
					Username1.clear();
					
					}
	        
	    	} 
		
	}
}


	


