package practicePrograms;

public class CompundAssignmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		
		++x;
		System.out.println("Current val x:" + x);
		
//		//increase the value morethan one
		x=x+10;
		System.out.println("Current val x:" + x);
		
//		//using compund assignment opt
		x+=10;
		System.out.println("Current val x:" + x);
		
		x-=10; // x= x-10
		System.out.println("Current val x:" + x);
		
		
	}

}
