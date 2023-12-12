package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class SearchElementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers= new ArrayList<Integer>();
		
		numbers.add(5);
		numbers.add(8);
		numbers.add(10);
		numbers.add(4);
		numbers.add(6);
		
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
		int search_key = 6;
		
		int index = Collections.binarySearch(numbers, search_key);
		
		System.out.println(index);
		
		if(index>=0)
		{
			System.out.println(search_key + " found at index no " + index);
		}
		else
			System.out.println("Wrong Key " +search_key);
		
	}

}
