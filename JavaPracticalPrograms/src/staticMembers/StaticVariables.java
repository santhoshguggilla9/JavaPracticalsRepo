package staticMembers;

class staticexample
{
	private static int x; // static var
	private int y; //non static var
	
	public void setval()
	{
		y=20;
	}
	public void showval()
	{
		System.out.println("x=" + x + "y=" +y);
	}
	
}
public class StaticVariables {

	public static void main(String[] args) {

		staticexample obj1 = new staticexample();
		staticexample obj2 = new staticexample();
		
		
		
	}
}
