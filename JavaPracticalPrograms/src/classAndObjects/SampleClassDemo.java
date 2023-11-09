package classAndObjects;

class car
{
	private int cid;
	private String cname;
	private double cost;
	
	public void readValues()
	{
		cid=100;
		cname="Mercedes";
		cost=100.00;
	}
	public void showValues()
	{
		System.out.println("car id:" +cid);
		System.out.println("car Name:" +cname);
		System.out.println("car Cost:" +cost);
	}
}
public class SampleClassDemo {

	public static void main(String args[])
	{
		car carObj = new car();
		
		carObj.readValues();
		carObj.showValues();
	}
}
