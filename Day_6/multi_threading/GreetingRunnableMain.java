package multi_threading;

public class GreetingRunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new GreetingRunnable("Hi", 2000);
		Runnable r2 = new GreetingRunnable("Bye", 1000);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thank you for watching..!!");
	}
}
