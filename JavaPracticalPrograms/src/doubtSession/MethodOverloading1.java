package doubtSession;

class MethodOverload
{
	MethodOverload()
	{
		System.out.println("no args const");
	}
	MethodOverload(String str)
	{
		System.out.println("single param" + str);
	}
	MethodOverload(String str, String str1)
	{
		System.out.println("DOuble param" + str + str1);	
	}
	public int sum(int x, int y)
	{
		return x+y;
	}
	public double sum(int x, double y)
	{
		return x+y;
	}
	public int sum(int x, int y, int z)
	{
		return x+y+z;
	}
	public int sum(int x)
	{
		return x+x;
	}
}
public class MethodOverloading1 {

	public static void main(String[] args) {
		
		MethodOverload obj = new MethodOverload();
		MethodOverload obj1 = new MethodOverload("santhosh");
		MethodOverload obj2 = new MethodOverload("santhosh", "kumar");
		
		int res= obj.sum(2, 3);
		System.out.println("res:" + res);
		
		double res1= obj.sum(2, 5.2);
		System.out.println("res:" + res1);
		
		
		res= obj.sum(2, 3, 4);
		System.out.println("res:" + res);
		res= obj.sum(2);
		System.out.println("res:" + res);
	}

}
