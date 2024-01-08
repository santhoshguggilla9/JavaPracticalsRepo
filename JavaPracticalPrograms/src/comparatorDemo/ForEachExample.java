package comparatorDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
	
	
		List<String> names = Arrays.asList("santhosh","raju","kumar","varun","vishu");
		List<Integer> nums = Arrays.asList(5,6,7,8,2,1);
		
				
		names.forEach(s -> System.out.println(s));
		names.forEach(number -> System.out.println(nums));
		
		//System.out.println(names);
		
		

	}

}
