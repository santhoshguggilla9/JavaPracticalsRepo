package stringsDemo;

public class StringMethodsDemo {

	public static void main(String[] args) 
	{

		String s1 = "kicit" ;
		String s2 = "Nagpur" ;
		System.out.println ( "Char at 3rd pos: " + s1.charAt ( 2 ) ) ;
		
		String s3 ;
		s3 = s1.concat ( s2 ) ;
		System.out.println ( s3 ) ;
		System.out.println ( "Length of s3: " + s3.length( ) ) ;
		
		s3 = s3.replace ( "p", "P" ) ;
		System.out.println ( s3 ) ;
		
		s3 = String.copyValueOf ( s2.toCharArray( ) ) ;
		System.out.println ( s3 ) ;
		
		int c ;
		c = s2.compareTo ( s3 ) ;
		if ( c < 0 )
			System.out.println ( "s2 is less than s3" ) ;
		else if ( c == 0 )
			System.out.println ( "s2 is equal to s3" ) ;
		else
			System.out.println ( "s2 is greater than s3" ) ;
		
		if ( s1 == s3 )
			System.out.println ( "s1 is equal to s3" ) ;
		else
			System.out.println ( "s1 is not equal to s3" ) ;
		
		s3 = s1.toUpperCase( ) ;
		System.out.println ( s3 ) ;
		
		s3 = s2.concat ( "Mumbai" ) ;
		System.out.println ( s3 ) ;
		
		s3 = s2.replace ( s2.charAt ( 0 ), ' ' ) ;
		System.out.println ( s3 ) ;
		
		int fin, lin ;
		fin = s1.indexOf ( "i" ) ;
		System.out.println ( "First index of i in s1: " + fin ) ;
		
		lin = s1.lastIndexOf ( "i" ) ;
		System.out.println ( "Last index of i in s1: " + lin ) ;
		
		String s ;
		s = s1.substring ( fin, lin + 1 ) ;
		System.out.println ( "Substring: " + s ) ;
		
		int i = 10 ;
		float f = 9.8f ;
		s3 = String.format ( "Value of i = %d Value of f = %f" , i, f ) ;
		System.out.println ( s3 ) ;


	}

}
