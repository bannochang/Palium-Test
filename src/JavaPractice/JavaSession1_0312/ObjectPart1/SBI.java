package JavaPractice.JavaSession1_0312.ObjectPart1;

public class SBI extends Bank

{
	public void loan()//need to define the abstract method here
	{
		System.out.println("overriding loan method");
	}
	
	public void  SBIwealth()//only restricted to SBI 
	{
		System.out.println("restricted to SBI only");
	}

}	
	
	
		

	


