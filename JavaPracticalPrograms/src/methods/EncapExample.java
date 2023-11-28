package methods;

class bankCustomer
{
	private int accno;
	private String accname;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
}

public class EncapExample {

	public static void main(String[] args) {
		
	bankCustomer obj = new 	bankCustomer();
	
	obj.setAccno(1001);
	System.out.println(obj.getAccno());
	
	obj.setAccname("santhosh");
	System.out.println(obj.getAccname());
		

	}

}
