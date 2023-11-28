package inheritance;

//parent class or super class
class calc
{
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
}

//child class or sub class
class advcalc extends calc
{
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		advcalc opr1 = new advcalc();
		
		int result; 
		
		result= opr1.sum(2,3);
		System.out.println("sum:" + result);
		result = opr1.sub(4,2);
		System.out.println("sub:" + result);
		
		opr1.mul(2, 3);
		System.out.println("mult:" + result);
		opr1.div(4, 2);
		System.out.println("div:" + result);
		
	}

}
