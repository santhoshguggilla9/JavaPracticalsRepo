package innerClass;

class outerClass
{
	class innerClass
	{
		public void display()
		{
			System.out.println("this is innerclass display");
		}
	}
	public void show()
	{
		System.out.println("this is outerclass show");
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		
		outerClass oobj = new outerClass();
		outerClass.innerClass iobj = oobj.new innerClass();
		
		oobj.show();
		iobj.display();
		
		
	}

}
