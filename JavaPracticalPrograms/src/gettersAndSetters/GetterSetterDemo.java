package gettersAndSetters;


class gsdemo
{
	private int age;
	String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class GetterSetterDemo {

	public static void main(String[] args) {
		
		gsdemo obj=new gsdemo();
		
		obj.setAge(10);
		obj.setName("santhosh");
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
