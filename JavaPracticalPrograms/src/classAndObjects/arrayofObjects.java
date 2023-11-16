package classAndObjects;


class students
{
	private int sid;
	private String sname;
	private int totMarks;
	double fee;
	
	public void setStudent(int stud_id, String s_name, int t_marks, double fees)
	{
		sid=stud_id;
		sname=s_name;
		totMarks=t_marks;
		fee=fees;
	}
	public void printStudent()
	{
		System.out.println("Student name:" + sname + " Student id:" + sid );
		System.out.println("Student Total Marks:" + totMarks + " Student fee:" + fee );
	}
}
public class arrayofObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		students studObjects[] = new students[2];
		
		studObjects[0]=new students();
		studObjects[1]=new students();
		
		studObjects[0].setStudent(101, "santhosh", 100, 100.00);
		studObjects[1].setStudent(102, "Sam", 80, 80.00);
		
		studObjects[0].printStudent();
		studObjects[1].printStudent();
		
	}
}
