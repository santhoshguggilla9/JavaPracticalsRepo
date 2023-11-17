package staticMembers;

class staticmethodex
{
	private static int x=200;
	private int y=100;
	
	public void showvar() 
	{
		System.out.println("static x" + x);
		System.out.println("non static y" +y);
	}
	public static void showval()
	{
		System.out.println("static x" + x);
		//System.out.println("non static y" +y);
	}
	
}
public class StaticMethods {

	public static void main(String[] args) {
		
		staticmethodex obj = new staticmethodex();
		
		obj.showvar();
		staticmethodex.showval();

	}

}
