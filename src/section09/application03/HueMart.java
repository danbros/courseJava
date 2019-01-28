package section09.application03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section09.entities03.ImportedProduct;
import section09.entities03.Product;
import section09.entities03.UsedProduct;

public class HueMart {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int num = sc.nextInt();
		
		List<Product> listProd = new ArrayList<>();
		
		for(int i=0; i<=num; i++) {
			System.out.print("Product #" + i + " data:\n");
			System.out.print("Common, used or imported (c/u/i)? ");
			char valid = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			
			if(valid == 'c')
				listProd.add(new Product(name, price));
			
			else if(valid == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date dateProd = sdf.parse(sc.next());
				listProd.add(new UsedProduct(name, price, dateProd));
			}
			else if(valid == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				listProd.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println("PRICE TAGS:");
		for(Product x : listProd) {
			System.out.println(x.priceTag());
		}
		sc.close();
	}

}
