package multithreadingDemo;

class PrintNumbers extends Thread {
    
		synchronized public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);  // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread : " + i);
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create instances of the thread classes
        PrintNumbers thread1 = new PrintNumbers();
        PrintNumbers thread2 = new PrintNumbers();

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }
}
