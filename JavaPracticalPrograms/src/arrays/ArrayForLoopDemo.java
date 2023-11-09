package arrays;

public class ArrayForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {3,5,2,6,7};
		System.out.println("the length of array:" + arr.length);
		
		for(int i : arr)
		{
			System.out.println(i);
		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println("arr[" + i + "]" + arr[i]);
//		}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
//		for (int i = 0; i < cars.length; i++) {
//		  System.out.println(cars[i]);
//		}
		
		for(String i : cars)
		{
			System.out.println(i);
		}
		
	}

}
