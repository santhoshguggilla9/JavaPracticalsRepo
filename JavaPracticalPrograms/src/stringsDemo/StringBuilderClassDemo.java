package stringsDemo;

public class StringBuilderClassDemo {

	public static void main(String[] args) {
		
		
		StringBuilder sobj1 = new StringBuilder("Hello");
		
		System.out.println(sobj1);
				
		sobj1.append("java");
		
		System.out.println(sobj1);
			
		System.out.println("length =" + sobj1.length());
		
		System.out.println("char 5th loc:" +sobj1.charAt(5));
	

	}

}
