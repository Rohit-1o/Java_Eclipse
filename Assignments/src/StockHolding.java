
public class StockHolding {

	private int stockId;
    private int dematAccountNo;
    private int quantity;

    public StockHolding(int stockId, int dematAccountNo, int quantity) {
        this.stockId = stockId;
        this.dematAccountNo = dematAccountNo;
        this.quantity = quantity;
    }

    public int getStockId() {
        return stockId;
    }

    public int getDematAccountNo() {
        return dematAccountNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
	
}
