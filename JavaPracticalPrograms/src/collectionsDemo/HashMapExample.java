package collectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> bankMap = new HashMap<Integer,String>();
		
		bankMap.put(101, "Santhosh");
		bankMap.put(102, "Lavanya");
		bankMap.put(103, "Nikitha");
		bankMap.put(104, "Vidya");
		bankMap.put(105, "Nehal");
		
		bankMap.put(null, null);
				
		for(Map.Entry<Integer,String> onePair : bankMap.entrySet())
		{
			System.out.println(onePair.getKey() + " " + onePair.getValue());
		}

	}

}
