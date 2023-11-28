package abstractionDemo;

abstract class shape
{
	double b,h,area;
	
	abstract public void showres(double r);
	
}
class rectangle extends shape
{
	public double drawrect()
	{
		b=10.5;
		h=24.3;
		
		area = 0.5 * b * h;
		return area;
	}
	public void showres(double r)
	{
		area=r;
		System.out.println(area);
	}
}
class square extends rectangle
{
	public double drawsqu()
	{
		b=20.5;
		h=44.3;
		
		area = 0.5 * b * h;
		return area;
	}
	public void showres(double r)
	{
		area=r;
		System.out.println(area);
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		square obj = new square();
		
		double result;
		
		result = obj.drawrect();
		obj.showres(result);
		
		result= obj.drawsqu();
		obj.showres(result);
	}

}
