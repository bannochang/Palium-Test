package ObjectPart1;

public class Wrapper 
{

	public static void main(String[] args) 
	{
		String x = "100";
		System.out.println(x+20);
		int i = Integer.parseInt(x);
		System.out.println(x+20);
		System.out.println(i+20);
		
		String y = "12.256";
		double f = Double.parseDouble(y);
		System.out.println(f+20);
		
		int k = 250;
		System.out.println(k+256);
		String S= String.valueOf(k);
		System.out.println(S+236);
		
		
		
	}

}
