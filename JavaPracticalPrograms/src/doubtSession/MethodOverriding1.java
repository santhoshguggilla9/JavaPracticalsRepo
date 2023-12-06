package doubtSession;

class parent
{
	parent()
	{
		System.out.println("parent's cons");
	}
}
class child extends parent
{
	child()
	{
		
		System.out.println("Childs's cons");
	}
}

public class MethodOverriding1 {

	public static void main(String args[])
	{
		child obj = new child();
		
	}
}
