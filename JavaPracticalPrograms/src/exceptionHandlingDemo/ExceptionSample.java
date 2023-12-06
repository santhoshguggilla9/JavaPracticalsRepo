package exceptionHandlingDemo;

import java.util.Scanner;

public class ExceptionSample {

	public static void main(String[] args) {

		int a,b,res;

		Scanner myInput = new Scanner( System.in );

		System.out.print( "Enter first integer: " );
		a = myInput.nextInt();
		
		System.out.print( "Enter second integer: " );
		b = myInput.nextInt();
		
		try 
		{
			res= a/b;
			System.out.println("the result is " + res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("we cannot divide an number by 0" + e);
		}
		
		
		System.out.println("the program is terminated");

	}

}
