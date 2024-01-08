package streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample 
{
	public static void main(String[] args) 
	{
		List<Integer> nums= Arrays.asList(12,3,8,7,6,2);
		
	long count = nums.stream()
						.filter(n -> n %2 == 0)
						.map(n -> n*2)
						.count();
						//.reduce(0,(c,e)-> c+e);
						
						
		
		//System.out.println("Result = " + result);
	System.out.println("Count = " + count);
		//s1.forEach(n -> System.out.println(n));//Stream will execute only once

	}
}
