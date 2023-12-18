package collectionsDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Textbooks
{
	double amt;
	String bname;

	Textbooks(String bname, double amt)
	{
		this.amt = amt;
		this.bname = bname;
	}
}

public class BooksMapExample {

	public static void main(String[] args) {

		List<Integer> code = new ArrayList<Integer>();
		
		code.add(1001);
		code.add(1002);
		code.add(1003);
		
		Map<Integer,Textbooks> Textbookset = new HashMap<Integer,Textbooks>();

		Textbooks b1 = new Textbooks("Let us C",100.00);
		Textbooks b2 = new Textbooks("Let us Java",200.00);
		Textbooks b3 = new Textbooks("Let us python",300.00);
				
		Textbookset.put(code.get(0),b1);
		Textbookset.put(code.get(1),b2);
		Textbookset.put(code.get(2),b3);

		for(Map.Entry<Integer, Textbooks> book : Textbookset.entrySet())
		{
			System.out.println(book.getKey() + "-" + book.getValue().bname + " Rs." + book.getValue().amt);
		}

	}

}
