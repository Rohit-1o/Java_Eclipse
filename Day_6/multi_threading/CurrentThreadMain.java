package multi_threading;

public class CurrentThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		String mainThreadName = mainThread.getName();
		int mainThreadPriority = mainThread.getPriority();
		System.out.println("Thread Name : "+mainThreadName);
		System.out.println("Thread Priority : " + mainThreadPriority);
		//mainThread.stop();
		//System.out.println("Main Threas is over..!!");
	}

}
