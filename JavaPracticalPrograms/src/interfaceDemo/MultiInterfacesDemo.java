package interfaceDemo;


interface dog1
{
	public void bark();
}
interface lion1
{
	public void roar();
}

class animal1 implements dog1,lion1
{

	@Override
	public void roar() {
		System.out.println("lion roaring");
		
	}
	@Override
	public void bark() {
		System.out.println("dog is barking");
		
	}
	
}
public class MultiInterfacesDemo {

	public static void main(String[] args) {
		
		animal1 obj = new animal1();
		obj.roar();
		obj.bark();

	}

}
