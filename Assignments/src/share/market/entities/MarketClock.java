package share.market.entities;

public class MarketClock implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Market is Open!");
	        Thread.sleep(2000);
	    } catch (Exception e) {
	        System.out.println("Thread interrupted");
	    }
	}
	
}
