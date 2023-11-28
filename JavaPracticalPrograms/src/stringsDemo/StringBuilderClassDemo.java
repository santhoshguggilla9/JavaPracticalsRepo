package stringsDemo;

public class StringBuilderClassDemo {

	public static void main(String[] args) {
		
		StringBuilder sobj = new StringBuilder("Hello");
		
		
		sobj.append("java");
		System.out.println("length =" + sobj.length());
		
		System.out.println("char at index 6:" +sobj.charAt(5));
		

	}

}
