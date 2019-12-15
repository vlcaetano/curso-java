package util;

public class CurrencyConverter {
	public static double dollarPrice;
	public static double dollarsBought;
	public static final double IOF = 0.06;
	
	public static double finalPrice() {
		return dollarPrice * dollarsBought * (1 + IOF);
	}
}
