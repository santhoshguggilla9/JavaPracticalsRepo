package conditionalStatements;

public class NIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		
		x=10;
		y=20;
		
		if(x>y)
		{
			System.out.println("x is big");
		}
		else if(y>x)
		{
			System.out.println("y is big");
		}
		else if(x==y)
		{
			System.out.println("both  are equal");
		}
		else
		{
			System.out.println("not x");
		}
		
	}
}
