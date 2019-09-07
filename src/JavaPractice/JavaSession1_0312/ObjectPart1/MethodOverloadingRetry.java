package JavaPractice.JavaSession1_0312.ObjectPart1;

public class MethodOverloadingRetry 
{

	public static void main(String[] args) 
	
	{
		
		MethodOverloadingRetry obj1 = new MethodOverloadingRetry();
		obj1.Test();
		System.out.println("calling Test with 0 parameter");
		
		int i = obj1.Test(20,30);
		System.out.println("calling Test with 1 parameter" + i);
		
		int j = obj1.Test(20,56,95);
		System.out.println(j);

		String O = obj1.Test("Abhijit", "Banerjee");
		System.out.println("calling Test with String parameter" + O);
		
		String C = obj1.Test("Sourav", "Ganguly");
		System.out.println("calling Test with String parameter" + C);
		
	}
	
	public void Test()
	{
	System.out.println("Good for nothing");
	}

	
	public int Test( int a ,int b )
	{
	System.out.println("Multiple Method");	
		int c = a*b;
		return c;	
	}	
	
	
	public String Test (String A,String B)
	{
		String S = (A+B);
		return S;
	}
	
	public int Test( int b ,int a,int k )
	{
	System.out.println("Multiple Method");	
		int d = a+b+k;
		return d;	
	}	
}

