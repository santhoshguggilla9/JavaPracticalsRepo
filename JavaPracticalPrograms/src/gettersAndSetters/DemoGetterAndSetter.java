package gettersAndSetters;

class demoGS
{
	private int age;
	private String name;
	
	public void getAge() {
		System.out.println(age);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
public class DemoGetterAndSetter {

	public static void main(String[] args) {
		
		demoGS obj = new demoGS();
		
		obj.setAge(30);
		obj.getAge();
		
	}

}
