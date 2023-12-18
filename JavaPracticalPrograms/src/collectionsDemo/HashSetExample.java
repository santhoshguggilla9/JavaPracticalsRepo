package collectionsDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> nums = new HashSet<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		nums.add(30);
		
		
		Iterator<Integer> itr = nums.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		

	}

}
