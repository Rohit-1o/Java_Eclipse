package multi_threading;

public class GreetingThread extends Thread {
	//prints a greeting message 10 times with some time gap in between
	private String message;
	private int timegap; //milliseconds
	
	
	public GreetingThread(String message, int timegap) {
		super();
		this.message = message;
		this.timegap = timegap;
	}
	@Override
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
