package ObjectPart1;

public class Car 
{
	
	int model;//global variable
	int wheel;//car class

	public static void main(String[] args) 
	{
		
		//new car() is the object of car class
		
		Car bmw = new Car();
		Car audi = new Car();
		Car merc = new Car();
		
		bmw.model = 2018;
		audi.model = 2017;
		merc.model = 2016;
		
		bmw.wheel = 5;
		audi.wheel = 5;
		merc.wheel = 5;
		
		System.out.println("before switching the references");
		
		System.out.println(bmw.model);
		
		bmw = audi;
		audi = merc;
		merc = bmw;
		
		System.out.println("after switching the references");
		
		 bmw.wheel = 8;
		 bmw.model = 2020;
		 
		 audi.model = 2019;
		 audi.wheel = 6;
		 
		 merc.model= 2022;
		 merc.wheel = 3;
		 
		 System.out.println(bmw.model);
		 System.out.println(audi.model);
		 System.out.println(merc.model);
		 

	}

}
