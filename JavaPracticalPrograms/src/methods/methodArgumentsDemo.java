package methods;

public class methodArgumentsDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y,result;

		x=10;
		y=20;
		
		result = sum(x,y);
		System.out.println(result);

	}
	public static int sum(int x,int y)
	{
		return x+y; // result is local to sum
		
	}

}
