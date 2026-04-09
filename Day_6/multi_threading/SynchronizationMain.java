package multi_threading;

public class SynchronizationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message msg = new Message("Good Morning");
		Thread t1 = new MessageThread(msg, "*******");
		Thread t2 = new MessageThread(msg, "$$$$$$$");
		
		t1.start();
		t2.start();
	}

}
