package ObjectPracticeSession;

public class Car 
{
	
	//class variables or Global variables
	
	int Chasis;
	int wheel;
	int model;
	String S1 = "Transmission type Auto" ;
	String S2 = "Transmission Type Manual";
	
	String S3 = "Fuel Type Petrol";
	String S4 = "Fuel Type Disel";
	String S5 = "Fuel Type CNG";
	
	public static void main(String[] args) 
	{
		
	Car BMW	 = new Car();
	Car Merc = new Car();
	Car Honda = new Car();
	
	BMW.Chasis = 763;
	BMW.wheel = 4;
	BMW.S1 = "Transmission Type Auto";
	
	Honda.S3 = "S3";
	System.out.println(Honda.S3);
	System.out.println(BMW.S1);
	}

}
