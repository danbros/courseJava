package section08.application3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import section08.entities3.Client;
import section08.entities3.Order;
import section08.entities3.OrderItem;
import section08.entities3.Product;
import section08.entities3.enums.OrderStatus;

public class RunMarket {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter cliente data:\nName: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.nextLine());
		System.out.print("Enter order data:\nStatus: ");
		String orderStatus = sc.nextLine();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), new Client(name, email, birthDate));
		
		for(int i=0; i<n; i++) {
			System.out.printf("Enter #%d item data:\nProduct name: ", i + 1);
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, prodPrice, new Product(prodName, prodPrice));
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println(order);
		
		
		sc.close();
	}

}
