package innerClass;

class anonymousInnerDemo
{
	public void show()
	{
		System.out.println("this is old implementation for show");
	}

}

public class anonInnerClassDemo {

	public static void main(String[] args) {

		anonymousInnerDemo obj=new anonymousInnerDemo()
		{
			public void show()
			{
				System.out.println("this is NEW implementation for show");
			}
		};

		obj.show();

	}

}
