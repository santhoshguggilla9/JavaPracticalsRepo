package classAndObjects;

class passobj
{
	private int x;
	
	public void setx(int a)
	{
		x=a;
	}
	public void showx()
	{
		System.out.println("x=" + x);
	}
	public passobj sum(passobj ob2)
	{
		passobj temp = new passobj();
		temp.x = x + ob2.x;
		return temp;
	}
}
public class passingObjectsDemo {

	public static void main(String args[])
	{
		passobj obj1 = new passobj();
		passobj obj2 = new passobj();
		passobj sumObj = new passobj();
		
		obj1.setx(60);
		obj2.setx(20);
		//sumObj.sum(obj1,obj2);
		sumObj=obj1.sum(obj2);
		
		sumObj.showx();
	}
}
