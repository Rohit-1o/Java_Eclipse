package multi_threading;

public class ThreadMain {
	
	public static void main(String[] args) {
	    Thread th = new SimpleThread();
	    th.start(); // This starts the second thread
	    
	    // This runs on the main thread
	    //System.out.println("Main thread is also running!");
	}
}