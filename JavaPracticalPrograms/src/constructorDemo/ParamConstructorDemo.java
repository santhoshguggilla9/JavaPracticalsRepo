package constructorDemo;


class person
{
	private int age,rollno;
	private String name;
	
//	//default constructor
//	person()
//	{
//		age=20;
//		name="santhosh";
//	}
	
	//parameterized constructor
	
	
	//dummy constructor
	person()
	{
		
	};
	
	person(int a, String pname)
	{
		age=a;
		name=pname;
	}
	
	person(int page, String pername, int rno)
	{
		this.age= page;
		this.name=pername;
		this.rollno=rno;
	}
	public void showperson()
	{
		System.out.println("person's age:" + age);
		System.out.println("person's name:" + name);
		System.out.println("person's rollno:" + rollno);
	}
}
public class ParamConstructorDemo {

	public static void main(String[] args) {
		
//		person p1 = new person();
//		p1.showperson();

		person p2 = new person(30,"Kumar");
		p2.showperson();
		
		person p3 = new person(40,"Varun", 3);
		p3.showperson();
	}

}
