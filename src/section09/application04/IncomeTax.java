package section09.application04;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import section09.entities04.*;
import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> listAccount = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int payer = sc.nextInt();
		
		for(int i=1; i<=payer; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char account = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if(account == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpend = sc.nextDouble();
				
				listAccount.add(new IndividualPerson(name, income, healthSpend));
			}
			else {
				System.out.print("Number of employees: ");
				int numEmployee = sc.nextInt();
				
				listAccount.add(new LegalPerson(name, income, numEmployee));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		for(Person x : listAccount) {
			System.out.println(x);
		}
		
		Double totalTaxes = 0.0;
		
		for(Person x : listAccount) {
			totalTaxes += x.taxValue();
		}
		
		System.out.print("\n\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
		sc.close();

	}

}
