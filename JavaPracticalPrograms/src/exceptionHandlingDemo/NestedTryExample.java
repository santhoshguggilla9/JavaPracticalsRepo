package exceptionHandlingDemo;

public class NestedTryExample {
	
    public static void main(String[] args) {
    	
        try {
            // Outer try block
            System.out.println("Outer try block starts");

            // Some code that may cause an exception
            int[] array = {1, 2, 3};
            System.out.println("Array element at index 3: " + array[3]);

            try {
                // Inner try block
                System.out.println("Inner try block starts");

                // Some code that may cause another exception
                String str = null;
                System.out.println("Length of the string: " + str.length());

                System.out.println("Inner try block ends");
            } catch (NullPointerException innerException) {
                // Handle the exception from the inner try block
                System.out.println("Caught inner exception: " + innerException.getMessage());
            }

            System.out.println("Outer try block ends");
            
        } catch (ArrayIndexOutOfBoundsException outerException) {
            // Handle the exception from the outer try block
            System.out.println("Caught outer exception: " + outerException.getMessage());
        }
        finally 
        {
        	try {
                // Inner try block
                System.out.println("Finally try block starts");

                // Some code that may cause another exception
                String str = null;
                System.out.println("Length of the string: " + str.length());

                System.out.println("Finally try block ends");
            } catch (NullPointerException innerException) {
                // Handle the exception from the inner try block
                System.out.println("Caught inner exception: " + innerException.getMessage());
            }
        	finally
        	{
        		System.out.println("this is final for finally");
        	}
        	
        }
    }
}
