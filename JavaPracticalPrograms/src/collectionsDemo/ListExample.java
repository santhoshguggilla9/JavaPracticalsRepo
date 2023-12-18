package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List <String> names = new ArrayList<String>();
		
		names.add("santhosh");
		names.add("kumar");
		names.add("varun");
		names.add("raj");
		
		Iterator<String> itr = names.iterator();
		
		System.out.println("name:" +itr.next());
				
//		for(String name : names)
//		{
//			System.out.println(name);
//		}
	}

}
