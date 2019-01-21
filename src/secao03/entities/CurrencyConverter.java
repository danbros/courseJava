package secao03.entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double convertion(double amount, double dollarPrice) {
		return amount * dollarPrice * ( 1.00 + IOF); //106% OU return amount * dollarPrice + (amount * dollarPrice * IOF)
	}
	
}
