package section03.application;

import java.util.Locale;
import java.util.Scanner;

import section03.entities.CurrencyConverter;

public class DollarQuotation {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double amount = sc.nextDouble();

		System.out.print("Amount to be paid in reais = " + CurrencyConverter.convertion(amount, dollarPrice));
		
		
		sc.close();

	}

}
