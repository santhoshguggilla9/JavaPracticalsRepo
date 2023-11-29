package interfaceDemo;

interface human
{
	public void living();
}
interface santhosh extends human
{
	public void sleep();
}

class friend implements santhosh
{
	@Override
	public void living() {
		System.out.println("Human lives");
	}
	@Override
	public void sleep() {
		System.out.println("he is sleeping");
	}
}
public class LastInterfaceExample {

	public static void main(String[] args) {
		
		friend obj = new friend();

		obj.living();
		obj.sleep();
	}
}
