package share.market.main;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.File;
import share.market.entities.Stock;
import share.market.entities.InvalidPriceException;
import share.market.entities.InvalidPriceException;
import share.market.entities.MarketClock;

public class StockMarketTester {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Stock stock = new Stock(101, "Reliance", 2500.0f, 1973);
		System.out.print("Enter new stock price: ");
	    float userPrice = scanner.nextFloat();
	    	try {
	            stock.updatePrice(userPrice);
	        } catch (InvalidPriceException e) {
	            System.out.println(e.getMessage());
	        }

	        stock.buyStock(10);
	        saveReceipt();

	        File myFile = new File("receipt.txt");

	        if (myFile.exists()) {
	            System.out.println("File created successfully");
	        } else {
	            System.out.println("File creation failed");
	        }

	        scanner.close();
	    }

	    public static void saveReceipt() {
	        try (FileOutputStream out = new FileOutputStream("receipt.txt")) {
	            out.write("Stock purchased successfully!".getBytes());
	        } catch (Exception e) {
	            System.out.println("Error saving file.");
	        }
	    }
}
