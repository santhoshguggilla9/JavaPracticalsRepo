package overridingDemo;

class superClass
{
	public void showval()
	{
		System.out.println("this is super class method");
	}
	public void showval(int a)
	{
		System.out.println(" integer is " + a);
	}
}
class subClass extends superClass
{
	public void showval()
	{
		System.out.println("this is sub class method");
		super.showval();
		super.showval(10);
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {

		subClass obj = new subClass();
		obj.showval();
	}

}
