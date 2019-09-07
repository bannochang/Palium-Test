package JavaPractice.JavaSession1_0312.ObjectPart1;

public class TestBank {

	public static void main(String[] args) 
	
	{
		SBI obj = new SBI();
		obj.Credit();
		obj.Debit();
		obj.loan();
		obj.SBIwealth();//This cannot be accessed by master class or Parent cLass
		
		Bank obj1 = new SBI(); //dynamic polymorphism
		obj1.Credit();
		obj1.Debit();
		obj1.loan();
		

	} 

}
