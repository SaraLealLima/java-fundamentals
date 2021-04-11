package util;

public class CurrencyConverter {

	public static double amount(double dollarPrice, double dollarQuantity) {
		double conversion = dollarQuantity * dollarPrice;
		return conversion + (dollarQuantity * dollarPrice * 0.06) ;
	}
}
