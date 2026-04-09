package share.market.entities;

public class StockRepository {
	private static Stock[] stocks;

    static {
        stocks = new Stock[3];
        stocks[0] = new Stock(201, "Infosys", 1450.75f, 1981);
        stocks[1] = new Stock(202, "Wipro", 410.50f, 1945);
        stocks[2] = new Stock(203, "HDFC Bank", 1675.20f, 1994);
    }

    public static Stock[] getAllStocks() {
        return stocks;
    }
}
