package innerClass;

class outerClass {
	
    static class innerClass {
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

        //outerClass.innerClass iobj = oobj. new innerClass(); // non static inner class
        outerClass.innerClass iobj = new outerClass.innerClass(); // static inner class
        iobj.display();
    }
}
