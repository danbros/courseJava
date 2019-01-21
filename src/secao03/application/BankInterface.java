package secao03.application;

import java.util.Locale;
import java.util.Scanner;
import secao03.entities.Account;

public class BankInterface {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int nAccount = scanner.nextInt();
		System.out.print("Enter account holder: ");
		scanner.nextLine();
		String holder = scanner.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char key = scanner.next().charAt(0);
		
		Account acc = new Account(nAccount, holder); 					//001
		
		
		if(key == 'y' || key == 'Y') {
			System.out.print("Enter initial deposit value: ");
			acc.deposit(scanner.nextDouble());							//001
			//double deposit = scanner.nextDouble();					  //000
			//Account account = new Account(nAccount, holder, deposit); //000
			System.out.println("\nAccount data:\n" + acc);
		}
		else
			//Account account = new Account(nAccount, holder); 			//000
			System.out.println("\n\nAccount data:\n" + acc);
		
		System.out.print("\nEnter a deposit value: ");
		acc.deposit(scanner.nextDouble());
		System.out.println("Updated account data:\n" + acc);
		
		System.out.print("\nEnter a withdraw value: ");
		acc.withdraw(scanner.nextDouble());
		System.out.println("Updated account data:\t(withdraw R$ " + acc.getBalance() + ")\n" + acc);
		
		
		
		scanner.close();

	}

}
