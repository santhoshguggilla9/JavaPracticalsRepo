package practicePrograms;

public class IncreDecrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		
		System.out.println("initially x=:" + x);// x before incrementing
		System.out.println("after incre x:" + ++x);// pre incre ( x + 1 = x)
		System.out.println("current val of x:" + x++);
		System.out.println("current val of x:" + x);
		
//		System.out.println("current val of x:" + x--);
//		System.out.println("current val of x:" + --x);
//		System.out.println("current val of x:" + x);
//	
//		System.out.println("current val of x:" + x++);
//		System.out.println("current val of x:" + --x);
//		System.out.println("current val of x:" + x);
//		
		System.out.println("current val of x:" + x-- + " " + ++x);
		System.out.println("current val of x:" + --x + " " + x++);
		System.out.println("current val of x:" + x);
	}

}
