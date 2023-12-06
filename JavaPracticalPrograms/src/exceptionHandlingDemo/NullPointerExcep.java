package exceptionHandlingDemo;

class sample
{
	int x=10;
}
public class NullPointerExcep {

	public static void main(String[] args) {

		sample obj[]=new sample[2];

		try
		{
			
			
			System.out.println("obj[0]:" +obj[0]);
			System.out.println("obj[1]:" +obj[1]);

			System.out.println("obj[0].x:" +obj[0].x);
			System.out.println("obj[1].x:" +obj[1].x);
		}
		catch(NullPointerException e)
		{
			obj[0] = new sample();
			obj[1] = new sample();
			
			System.out.println("obj[0].x:" +obj[0].x);
			System.out.println("obj[1].x:" +obj[1].x);
		}
		System.out.println("program terminates");
	}
}
