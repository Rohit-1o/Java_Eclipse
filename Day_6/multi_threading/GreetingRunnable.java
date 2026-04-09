package multi_threading;

public class GreetingRunnable implements Runnable {
	//prints a greeting message 10 times with some time gap in between
	private String message;
	private int timegap; //mlliseconds
	
	public GreetingRunnable(String message, int timegap) {
		super();
		this.message = message;
		this.timegap = timegap;
	}

	public void run() {
		for(int a=1; a<=10; a++) {
			System.out.println(message);
			try {
				Thread.sleep(timegap);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
