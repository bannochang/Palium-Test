package JavaSession1_0312;

public class Array {

	public static void main(String[] args) 
	{
		int x[] = new int [7];
		x[0] = 125;
		x[1] = 150;
		x[2] = 170;
		x[3] = 180;
		x[4] = 190;
		x[5] = 130;
		x[6] = 120;
		
		System.out.println(x[6]);
		System.out.println(x.length);
		
		for (int y =0;y< x.length;y++)
		{
			System.out.println(x[y]);
		}
		
		String s[]=new String [6];
		s[0] = "Abhi";
		s[1] = "Ina";
		s[2] = "Bebo";
		s[3] = "Buddho";
		s[4] = "Baba";
		s[5] = "Ma";
				
		for(int d=0;d<s.length;d++)
		{
			System.out.println(s[d]);
		}
		//object array
		//object is a class
		
		Object ob []= new Object [6];
		ob[0] = "Abhijit";
		ob[1] = "37";
		ob[2] = "kolkata";
		ob[4] = "700003";
		ob[5] = "18E";
		
		for (int k =0;k<ob.length;k++)
		{
			System.out.println(ob[k]);
		}
			//2D Array
		
		String mdar[][]=new String [3][5];//total number of rows/columns
		System.out.println(mdar.length);//total number of rows
		System.out.println(mdar[0].length);//total number of columns
		System.out.println(mdar[2].length);
		
		mdar[0][0]= "Abhijit";
		mdar[0][1]= "works";
		mdar[0][2]= "@";
		mdar[0][3]= "cognizant";
		mdar[0][4]= "bantala";
		
		mdar[1][0]= "1Abhijit";
		mdar[1][1]= "1works";
		mdar[1][2]= "1@";
		mdar[1][3]= "1cognizant";
		mdar[1][4]= "1bantala";
		
		
		mdar[2][0]= "2Abhijit";
		mdar[2][1]= "2works";
		mdar[2][2]= "2@";
		mdar[2][3]= "2cognizant";
		mdar[2][4]= "2bantala";
		
		for(int row = 0;row<mdar.length;row ++)
		{
			for (int col =0;col<mdar[0].length;col ++)
			{
				System.out.println(mdar[row][col]);
			}
		}
		
		
		}
				
	}


