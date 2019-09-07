package Com.Mercury.Test;

import java.io.IOException;

import jxl.read.biff.BiffException;
//This is to test GIT Push - Abhijit 0709
public class Driver 
{

	public static void main(String[] args) throws InterruptedException, IOException, BiffException 
	{
		
		ExcelReadJxl obj = new ExcelReadJxl();
		obj.ExcelRead();
		
		/*MR obj1 = new MR();
		obj1.browserMercuryAppLaunch();
		obj1.loginwithParameter("dasd", "dasd");
		obj1.loginMercuryClick();
		obj1.verifylogin();
		obj1.flyers();
		obj1.selectcity();
		obj1.arrivalcity();
		obj1.airlines();
		obj1.contd();*/
		
		/*SelectActionRobot obj2 = new SelectActionRobot();
		obj2.loginAction();
		obj2.DepartDate();
		
	}	
		
}		
		//obj1.MMT();*/
		
		//AutoIT Obj3 = new AutoIT();
		//Obj3.autoITTest();
		//Obj3.autoitpractice();
		
		
		
	}
}


