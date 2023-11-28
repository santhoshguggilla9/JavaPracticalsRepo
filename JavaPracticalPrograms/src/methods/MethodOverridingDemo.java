package methods;

class methodOverride
{
	
	public void show()
	{
		System.out.println("this is show");
	}
	public void show(int a)
	{
		System.out.println("a value is" + a);
	}
	public void show(int a, int b)
	{
		System.out.println(" the sum of a+b: " + (a+b) );
	}
	public void show(int a, int b, int c)
	{
		System.out.println(" the sum of a+b+c: " + (a+b+c) );
	}
	public void callmethods(int i, int j, int k)
	{
		show();
		show(i);
		show(i,j);
		show(i,j,k);
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		methodOverride obj = new methodOverride();
		
		int a,b,c;
		a=10;
		b=20;
		c=30;
		
		obj.callmethods(a,b,c);
	}
}
