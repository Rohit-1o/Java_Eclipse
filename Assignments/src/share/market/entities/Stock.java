package share.market.entities;

public class Stock {
	 private int stockId;
	    private String stockName;
	    private float stockPrice;
	    private int establishmentYear;

	    public static final String MARKET_NAME = "BSE";

	    public Stock() {
	    }

	    public Stock(int stockId, String stockName, float stockPrice, int establishmentYear) {
	        this.stockId = stockId;
	        this.stockName = stockName;
	        this.stockPrice = stockPrice;
	        this.establishmentYear = establishmentYear;
	    }

	    public int getStockId() {
	        return stockId;
	    }

	    public String getStockName() {
	        return stockName;
	    }

	    public float getStockPrice() {
	        return stockPrice;
	    }

	    public int getEstablishmentYear() {
	        return establishmentYear;
	    }

	    public void setStockPrice(float stockPrice) {
	        this.stockPrice = stockPrice;
	    }

	    public void updatePrice(float newPrice) throws InvalidPriceException {
	        if (newPrice < 0) {
	            throw new InvalidPriceException("Price cannot be negative");
	        }
	        this.stockPrice = newPrice;
	        System.out.println("Stock price updated to: " + newPrice);
	    }

	    public void updatePrice(float newPrice, String reason) throws InvalidPriceException {
	        if (newPrice < 0) {
	            throw new InvalidPriceException("Price cannot be negative");
	        }
	        this.stockPrice = newPrice;
	        System.out.println("Stock price updated to: " + newPrice);
	        System.out.println("Reason: " + reason);
	    }

	    public synchronized void buyStock(int amount) {
	        System.out.println("Stock purchased: " + amount);
	    }

	    private class StockValidator {
	    }

	    @Override
	    public String toString() {
	        return stockName;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || !(obj instanceof Stock)) return false;
	        Stock s = (Stock) obj;
	        return this.stockId == s.stockId;
	    }
}
