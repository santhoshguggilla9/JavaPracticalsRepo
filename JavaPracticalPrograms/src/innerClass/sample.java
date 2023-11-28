package innerClass;

class Abc
{
	Abc()
	{
		System.out.println("Constructor called!!!");
	}
	public void show()
	{
		System.out.println("this is show");
	}
}
public class sample {

	public static void main(String[] args) {

		Abc obj=new Abc();// allocation of memory for Abc
		obj.show();
	}
}
