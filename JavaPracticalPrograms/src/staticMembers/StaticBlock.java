package staticMembers;

class staticblockex
{
	private static int x;
	private int y;
	
	static
	{
		x=200;
		System.out.println("this is static block");
		System.out.println("x val" +x);
		staticmethod();
	}
	public static void staticmethod()
	{
		x=400;
		System.out.println("after calling method x val is" +x);
	}
	public void display()
	{
		System.out.println("this is display method");
	}
	public void show()
	{
		System.out.println("this is show method");
	}
	
}
public class StaticBlock {

	public static void main(String[] args) {
		
		staticblockex obj = new staticblockex();
		
		obj.show();
		obj.display();
		
		staticblockex obj1 = new staticblockex();

	}

}
