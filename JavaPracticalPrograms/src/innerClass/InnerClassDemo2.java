package innerClass;

class A
{
	public void show()
	{
		System.out.println("old Version code");
	}
}


public class InnerClassDemo2
{
	public static void main(String[] args)
	{
		A obj = new A()
				{
					public void show()
					{
						System.out.println("New implementation for show");
					}
				};
				obj.show();
	}
}