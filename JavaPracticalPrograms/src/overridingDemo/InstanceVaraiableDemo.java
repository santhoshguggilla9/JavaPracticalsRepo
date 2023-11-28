package overridingDemo;

class parent
{
	public int x=10;
}
class child extends parent
{
	public int x=20;
	
	public void showval()
	{
		System.out.println("x value:" +x);
		System.out.println("parent x value:" +super.x);
	}
}
public class InstanceVaraiableDemo {

	public static void main(String[] args) {
		
		child obj = new child();
		obj.showval();

	}
}
