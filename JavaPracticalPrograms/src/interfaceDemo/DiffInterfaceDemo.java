package interfaceDemo;

interface actor
{
	public void present();
}
class movie
{
	public void  show()
	{
		System.out.println("show is running");
	}
}
class amitab extends movie implements actor
{
	public void character()
	{
		System.out.println("its good");
	}
	@Override
	public void present() {
		System.out.println("amitab presenting his act");
	}
}
public class DiffInterfaceDemo {

	public static void main(String[] args) {
		
		amitab obj = new amitab();
		
		obj.character();
		obj.show();
		obj.present();

	}
}
