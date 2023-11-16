package classAndObjects;

class sumDesign
{
	private int x,y,result;
	
	public void showVal()
	{
		System.out.println("x val:" +x);
		System.out.println("y val:" +y);
	}
	public void setVal(int x, int y)
	{
		this.x=x;
		this.y=y;
		result =x+y;
	}
	public void showResult()
	{
		System.out.println("The Result is" + result);
	}
}

public class multiObjectDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sumDesign sum1 = new sumDesign();
		sumDesign sum2 = new sumDesign();
		
		sum1.setVal(10,20);
		sum1.showVal();
		//sum1.showResult();
		
		sum2.setVal(30,50);
		sum2.showVal();
		//sum2.showResult();
	}
}
