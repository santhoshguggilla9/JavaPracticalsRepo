package multithreadingDemo;

public class ThreadsExample {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread( ) ;
		System.out.println ( "Current thread: " + t ) ;
		t.setName ( "mythread" ) ;
		System.out.println ( "After name change: " + t ) ;
		String str = t.getName( ) ;
		System.out.println ( "Thread name: " + str ) ;
	}

}
