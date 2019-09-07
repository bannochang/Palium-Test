package JavaPractice.JavaSession1_0312.ObjectPart1;

public class Call {
	int p;
	int q;

	public static void main(String[] args) 
	{
		Call obj = new Call();
		obj.Sum(10,20);
		
		int x= 65;
		int y = 35;
		
		obj.Sum(x,y);
		System.out.println(obj.Sum(x, y));
		
		obj.p= 236;
		obj.q = 234;
		
		obj.Swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		

	}
	
	public int Sum(int a,int b)
	{
	//a = 20;
	//b = 30;
	int c = a+b;
	return c;
	}
	
	public void Swap(Call t)
	{
		int temp;
		temp = t.p;
		t.p=t.q;
		t.q=temp;
	}
	
}
