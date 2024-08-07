import java.util.Vector;
import java.util.List;
import java.util.ArrayList;

public class binearySearchAlgo  {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start(); // Start the thread

        // Sleep for 5 seconds to allow the thread to run
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.stopThread(); // Stop the thread
        
    }

    public static class MyThread extends Thread {
        private volatile boolean running = true; // Volatile to ensure visibility across threads

        public void run() {
            while (running) {
                System.out.println("Thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                     e.printStackTrace();
                }
            }
            System.out.println("Thread stopped.");
        }

        public void stopThread() {
            running = false;
        }
    }
}
