package JavaPractice.JavaSession1_0312.ObjectPart1;

public class FUNCANDMETHODS 
{
	//Starting point of execution
	public static void main(String[] args) 
	{
		FUNCANDMETHODS obj = new FUNCANDMETHODS ();
		//one object will be created and obj is the reference variable
		obj.test();
		int var1 = obj.test2();
		System.out.println(var1);
		
		String S1 = obj.test3();
		System.out.println(S1);
		
		int div = obj.division(650, 13);
		System.out.println(div);
		
	}
			//NON STATIC METHODS
			//No Input No Output
			//void - returns no value
	
			
	public void test()
		{
			System.out.println("test method");
			System.out.println("No input provided - No Output yeilded");
			
		}
	
	//NO Input Min Output
	// return type = int
	
	public int test2
	()
	{
		System.out.println("value of test2");	
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		}
	
	//Return Type = String
	
	public String test3()
	{
		System.out.println("value of test3");
		String test = "Selenium method";
		
		return test;
		
	}
	
	//passing input arguments
	
	public int division(int x,int y)
	{
	System.out.println("division method");
	int div = x/y;
	
	return div;
	}
	

	}


