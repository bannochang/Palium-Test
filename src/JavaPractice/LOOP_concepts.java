package JavaPractice;

public class LOOP_concepts 
{

	public static void main(String[] args) 
	{
		// while loop
		int a = 1;//initialization
		while(a<=10)//conditional
		{
			System.out.println(a);
			a=a+1;
		}
		
	System.out.println("_________________");
	
	for(int b=1;b<=30;b++)
	
	{
		System.out.println(b);
		
	}
	
	System.out.println("*******************");
	
	for(int c=26;c>=-10;c--)
	{
		System.out.println(c);
			
	}	
	
	//increment Operator ++
	//decrementOperator --
	//Post Increment
	
	int x = 5;
	int y = x++;
	
	System.out.println(x);
	System.out.println(y);
	
	//pre increment
	
	int z= ++x;
	
	System.out.println(z);
	System.out.println(x);
	
	int t= z--;
	int u = --z;
	
	System.out.println(t);
	System.out.println(u);
		
	}
}
	


