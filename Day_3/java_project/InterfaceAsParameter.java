package java_project;

import java.sql.ResultSet;

public class InterfaceAsParameter {
	
	private static float performCurrencyConversion(CurrencyConverter convertor, float amount) {
		float convertedAmount = convertor.doConvert(amount);
		return convertedAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float resultantAmount = performCurrencyConversion(new DollarToRupeeConverter(), 1000);
		System.out.println(resultantAmount);
		System.out.println("========= ");
		
		resultantAmount = performCurrencyConversion(new RupeeToPoundConvertor(), 10000);
		System.out.println(resultantAmount);

	}

}
