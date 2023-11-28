package overridingDemo;

class car
{
	public void show()
	{
		System.out.println("this is show method");
	}
}
class model extends car
{
	public void modelShow()
	{
		System.out.println("this is Model Show method");
	}
}
public class ObjectComposition {

	public static void main(String[] args) {
		
//		car	obj = new car();
//		 model mobj = new model();
//		 obj = mobj;
		 
		car obj = new model(); //valid statement
		
		obj.show();//
		//obj.modelShow();// it is not allowed due to type mismatch
		
		model mobj = (model) obj; // type casted the obj to model
		mobj.modelShow();
		
			 
	}

}
