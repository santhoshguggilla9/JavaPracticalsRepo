package classAndObjects;

class anonymous
{
	anonymous()
	{
		System.out.println("Constructor called");
	}
	
	public void show()
	{
		System.out.println("this is show method");
	}
}
public class AnonymousObjDemo {

	public static void main(String[] args) {
		
		new anonymous();
	}
}
