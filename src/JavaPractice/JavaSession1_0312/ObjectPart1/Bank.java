package JavaPractice.JavaSession1_0312.ObjectPart1;

public abstract class Bank 
{
    //Abstract class can have abstract method and non abstract method
	//By declaring abstract class and method we are implementing partial abstraction
	//Abstraction means to hide the implementation logic
	//below are partial abstraction as we have an abstract method along with full methods
	
	
	public abstract void loan();//abstract method- no method body
	
	public void Credit()
	{
	  System.out.println("Bank offers Credit card");
	}
	
	public void Debit()
	{
	  System.out.println("Bank offers Debit card");
	}
	
}
