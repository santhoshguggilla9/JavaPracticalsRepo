package exceptionHandlingDemo;

public class ArrayIndexoutofbound {

	public static void main(String[] args) {
		
		int[] number = {1,2,3,4,5};
		
		try
		{
			System.out.println("number[4]:" + number[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of code executing...");

	}

}
