package java_project;

public class InterfaceMain {
	
	public static void main(String[] args) {
		
		System.out.println("Todays conversion rate..!");
		System.out.println("USD to INR  : " + CurrencyConverter.DOLLAR_TO_RUPEE);
		System.out.println("POUND to INR  : " + CurrencyConverter.POUND_TO_RUPEE);
		System.out.println("=============================");
		
		CurrencyConverter converter;
		converter = new DollarToRupeeConverter();
		float inr = converter.doConvert(10000);
		System.out.println("$10000 = INR : " +inr);
		
		System.out.println("=============================");
		
		converter = new RupeeToPoundConvertor();
		float gbp = converter.doConvert(50000);
		System.out.println("INR 50000 = GBP : " + gbp);
	}

}
