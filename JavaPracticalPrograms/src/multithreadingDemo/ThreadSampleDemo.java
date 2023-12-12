package multithreadingDemo;

class numbers extends Thread
{
	public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("num:" +x);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class words extends Thread
{
	synchronized public void run()
	{
		for(int x=1;x<=10;x++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadSampleDemo {

	public static void main(String[] args) {
		
		numbers t1= new numbers();//created an object for class numbers
		words t2= new words();//created an object for class words
		
//		System.out.println("t1 priority:" + t1.getPriority());
//		System.out.println("t2 priority:" + t2.getPriority());
		
//		t1.setPriority(10); //1 low , 10 MAX , 5 Normal
//		t2.setPriority(1);
		
//		t1.setPriority(Thread.MAX_PRIORITY); //1 low , 10 MAX , 5 Normal
//		t2.setPriority(Thread.MIN_PRIORITY);
//		
//		System.out.println("t1 priority:" + t1.getPriority());
//		System.out.println("t2 priority:" + t2.getPriority());
//		
		t1.start();
		t2.start();
		
		

	}

}
