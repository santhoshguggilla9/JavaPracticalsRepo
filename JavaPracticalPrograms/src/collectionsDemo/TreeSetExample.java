package collectionsDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<String> str = new TreeSet<String>();

		str.add("Bac");
		str.add("Efg");
		str.add("Abc");
		str.add("Def");
		str.add("Res");

		Iterator<String> itr = str.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
