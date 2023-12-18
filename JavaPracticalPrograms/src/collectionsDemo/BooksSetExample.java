package collectionsDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class books
{
	int bid;
	String bname;

	books(int b_id,String bname)
	{
		this.bid = b_id;
		this.bname = bname;
	}
}
public class BooksSetExample {

	public static void main(String[] args) {

		Set<books> bookSet = new LinkedHashSet<books>();

		books b1 = new books(101,"Let us C");
		books b2 = new books(102,"Let us Java");
		books b3 = new books(103, "Let us python");

		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);

		Iterator<books> itr = bookSet.iterator();

		while(itr.hasNext())
		{
			books book = itr.next();
			System.out.println(book.bid);
			System.out.println(book.bname);
		}

//		for(books book : bookSet)
//		{
//			System.out.println(book.bid);
//			System.out.println(book.bname);
//		}

	}

}
