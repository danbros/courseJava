package section05.application;

import java.util.Locale;
import java.util.Scanner;

import section05.entities.ProductV;

public class Vector {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the X times: ");
		int n = sc.nextInt();
		
		double media = 0;
		ProductV[] vect = new ProductV[n];
		
		for(int i = 0; i < vect.length; i++){
			sc.nextLine();
			System.out.printf("\nEnter the name of product %d: ", i + 1);
			String name = sc.nextLine();
			System.out.printf("Enter the price of product %d: ", i+ 1);
			double price = sc.nextDouble();
			vect[i] = new ProductV(name, price);
			media += vect[i].getPrice();
		}
		
		System.out.printf("The media is %f", media / vect.length);
		
		
		
		sc.close();
	}

}
