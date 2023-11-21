package innerClass;

class outerClass {
	
    class innerClass {
        public void display() {
            System.out.println("This is inner class display");
        }
    }
    public void show() {
        System.out.println("This is outer class show");
    }
    
}

public class InnerClassDemo {

    public static void main(String[] args) {

        // Declare oobj as an instance of outerClass with an anonymous inner class
        outerClass oobj = new outerClass();

        // Call show() method on oobj
        oobj.show();

        outerClass.innerClass iobj = oobj.new innerClass();
        iobj.display();
    }
}
