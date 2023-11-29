package interfaceDemo;

interface animal
{
	public void roar();
	public void bark();
}
class lion implements animal
{
	public void roar()
	{
		System.out.println("lion roaring");
	}
	@Override
	public void bark() {
		// TODO Auto-generated method stub
	}
}
class dog implements animal
{
	public void bark()
	{
		System.out.println("dog is barking");
	}

	@Override
	public void roar() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceExample {

	public static void main(String[] args) {

		animal aobj = new lion();
		animal aobj1 = new dog();

		aobj.roar();
		aobj1.bark();
	}

}
