package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student
{
	int age;
	String sname;
		
	//constructor 
	public student(int age, String sname) 
	{
		this.age = age;
		this.sname = sname;
	}
	
	public String toString() {
		return "student [age=" + age + ", sname=" + sname + "]";
	}
	
}
public class ComparatorExample 
{
	public static void main(String[] args) 
	{

		//Comparator<student> com = (i, j) -> i.age > j.age ? 1 : -1;

		Comparator<student> com = new Comparator<student>() 
									{ 
										public int compare(student i, student j)
										{
											if(i.age>j.age)
												return 1;
											else
												return -1;
										}
									};
		
		Comparator <student> nameComp = new Comparator<student>()
				{
					public int compare(student i, student j)
					{
						return i.sname.compareTo(j.sname);
					}
				};
		List <student> studs = new ArrayList<student>();

		studs.add(new student(85,"santhosh"));
		studs.add(new student(65,"kumar"));
		studs.add(new student(45,"varun"));
		studs.add(new student(15,"lavanya"));
		studs.add(new student(85,"nehal"));
		studs.add(new student(25,"nikitha"));

		Collections.sort(studs,com);
		for(student s : studs)
		{
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println();
		
		Collections.sort(studs,nameComp);
		for(student s : studs)
		{
			System.out.println(s);
		}
	}
}

