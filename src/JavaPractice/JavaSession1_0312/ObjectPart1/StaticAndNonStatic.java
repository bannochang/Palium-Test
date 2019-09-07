package ObjectPart1;

public class StaticAndNonStatic 
{ //Declare Global Variable
	
	String name = "Abhijit";
	int age = 36;
	static int DOB = 241283;

	public static void main(String[] args) 
	{
		StaticAndNonStatic obj = new StaticAndNonStatic ();
		
		obj.Test();
		
		Sum();//Direct Calling
		
		StaticAndNonStatic.Sum();//Calling by Class Name 
		
		System.out.println(DOB);//Direct Calling
		System.out.println(StaticAndNonStatic.DOB);//Calling by Class Name
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
	}	
		public void Test()
		{
		System.out.println("no Input");
		}
		
	  	public static void Sum()
	  	{
	  		System.out.println("Sum method");
	  	}

	}


