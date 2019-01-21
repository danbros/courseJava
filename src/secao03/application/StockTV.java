package secao03.application;

import java.util.Locale;
import java.util.Scanner;
import secao03.entities.ProductS;

public class StockTV {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter product data:\nName: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		ProductS p = new ProductS(name, price);
		
		System.out.println("#-Product data: " + p + "#-");
		System.out.println();
		System.out.print("\nEnter the number of products to be added in stock: ");
		p.addProducts(sc.nextInt());
		System.out.println("\n#-Updated data: " + p + "-#");
		System.out.print("\n\nEnter the number of products to be removed from stock: ");
		p.removeProducts(sc.nextInt()); 
		System.out.println("\n#-Updated data: " + p + "-#");
		
		
		
		sc.close();
	}

}
