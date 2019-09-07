package JavaPractice.JavaSession1_0312;

public class StringConcatenation {

	public static void main(String[] args) 
	
	{
		

	//+ is a concatenation operator	
		
		int a = 100;
		int b= 200;
		System.out.println(a+b);
		int c = a+b;
		System.out.println(c);
		
		String x = "Abhijit";
		String y = "Learning";
		String z = "Selenium";
		
		System.out.println(x+y+z);
		
		String H = x+y+z;
		System.out.println(H);
		
		System.out.println(H+a+b);
		System.out.println(H+c);
	}

}
