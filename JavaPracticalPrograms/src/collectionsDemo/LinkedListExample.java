package collectionsDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> al = new LinkedList<String>();  
	
		
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		
		Collections.sort(al);
		
		System.out.println(al);
//		Iterator<String> itr = al.iterator();  //it is alternative to for loop
//		//		 while(itr.hasNext())
////		 {
////			System.out.println(itr.next());
////		 }
//		
//		
//		System.out.println(itr.next());
	}
}
