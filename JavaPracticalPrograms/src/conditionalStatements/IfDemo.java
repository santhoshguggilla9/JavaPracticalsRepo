package conditionalStatements;

public class IfDemo {

	public static void main(String [] args)
	{
		int age;
		age=21;
		
		if(age>=18)
		{
			String status = "Eligible";
			System.out.println("Voter is :" + status);
		}
		else
		{
			System.out.println("Not elgble");
		}
		
	}
}
