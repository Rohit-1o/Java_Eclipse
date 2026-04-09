package multi_threading;

public class MessageThread extends Thread{
	private Message messageObject;
	private String pattern;
	
	
	
	public MessageThread(Message messageObject, String pattern) {
		super();
		this.messageObject = messageObject;
		this.pattern = pattern;
	}



	@Override
	public void run() {
		synchronized (messageObject) {
		
			try {
				messageObject.print(pattern);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}