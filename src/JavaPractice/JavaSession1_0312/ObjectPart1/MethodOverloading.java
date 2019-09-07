package JavaPractice.JavaSession1_0312.ObjectPart1;

/*public class MethodOverloading {
	
		public static void main(String[] args) {
		/*When the Method name is same with different arguments or input parameters 
		within the same class,but with diff Data types  - Method Overloading 
		
		//you can create method overloading for main method also
		//duplicate methods within same class is not allowed
		//You cannot create a method inside a method
		
	
		MethodOverloading obj = new MethodOverloading ();
		
		obj.Mul();
		//obj.Mul(50);
		
		int var1 = obj.Mul();
		System.out.println(var1);
		
		obj.Mul(32,65);
		
		}
		
		
	public void Mul()
	{
		System.out.println("no input");
	}
	
	public int Mul(int a)
	{
		System.out.println("single input");
		int i = 50;
		int j = 70;
		int k = 50*70;
		
		return k;
		
	}
	public void Mul(int j,int k)
	{
		System.out.println("double input");
	}
	public void Mul(double m)
	{
		System.out.println("diff datatypes");
	}
	
	public double Mul (double x,int y)
	{
		System.out.println("with input arguments");
		double Multi = x*y;
		
		return Multi;
	}
	
	

}*/

public class MethodOverloading {

public static void main(String[] args) {
/*When the Method name is same with different arguments or input parameters 
within the same class,but with diff Data types  - Method Overloading */
//you can create method overloading for main method also
//duplicate methods within same class is not allowed
//You cannot create a method inside a method
MethodOverloading obj = new MethodOverloading ();
obj.Mul();
int var1 = obj.Mul(50,70);
System.out.println(var1);


int var2 = obj.Mul(32,65);
System.out.println(var2 );
}
public int Mul()
{
System.out.println("no input");
return 0;
}
public int Mul(int x,int y)
{
System.out.println("single input");
return x*y;
}
}


