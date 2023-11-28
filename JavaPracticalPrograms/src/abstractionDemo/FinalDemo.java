package abstractionDemo;

class car
{
	final int x=10;
	
	public final void display()
	{
		System.out.println("this is car display");
	}
}
class maruti extends car
{
	public void showx()
	{
		System.out.println(x);
	}
	public void display1()
	{
		System.out.println("this is maruti display");
	}
}
public class FinalDemo {

	public static void main(String[] args) {

		maruti obj = new maruti();
		obj.showx();
		obj.display();
	}
}
