package stringsDemo;

public class StringBufferClassDemo {

	public static void main(String[] args) {
		
		StringBuffer sobj = new StringBuffer("Hello");
		
		
		sobj.append("java");
		System.out.println("length =" + sobj.length());
		
		System.out.println("char at index 6:" +sobj.charAt(5));
		

	}

}
