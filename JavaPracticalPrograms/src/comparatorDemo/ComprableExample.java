package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class students implements Comparable<students>
{
	int age;
	String sname;
		
	public students(int age, String sname) {
		this.age = age;
		this.sname = sname;
	}
	public String toString() {
		return "student [age=" + age + ", sname=" + sname + "]";
	}
	public int compareTo(students that) 
	{
		if(this.age > that.age)
			return 1;
		else
			return -1;
	}
}
public class ComprableExample {

	public static void main(String[] args) {
		
		List <students> studs = new ArrayList<students>();

		studs.add(new students(85,"Santhosh"));
		studs.add(new students(65,"kumar"));
		studs.add(new students(45,"varun"));
		studs.add(new students(15,"lavanya"));
		studs.add(new students(85,"nehal"));
		studs.add(new students(25,"nikitha"));

		Collections.sort(studs);

		for(students s : studs)
		{
			System.out.println(s);
		}
		//System.out.println(nums);
	}

}
