package exceptionHandlingDemo;

public class NumberFormatExcep {

	public static void main(String[] args) {

		String str="121", str2 ="12abc";

		int n,m;

		try
		{
			n = Integer.parseInt(str);
			m = Integer.parseInt(str2);
			System.out.println("n:" + n);
			System.out.println("m:" + m);
		}
		catch(ArithmeticException e)
		{
			System.out.println("execute this is if its arthemetic operation");
		}
		catch(NumberFormatException e)
		{
			System.out.println("we can not covert string value to integer");
		}
		catch(Exception e)
		{
			System.out.println("am executing this since given exception doesnt matching with any catch");
		}
		finally
		{
			System.out.println("it will execute automatically and after catch block");
		}
		System.out.println("rest of code");
	}
}
