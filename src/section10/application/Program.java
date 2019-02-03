package section10.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import section10.entities.Account;
import section10.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter account data\nNumber: ");

			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.print("\nEnter amount for withdraw: ");
			double amount = sc.nextDouble();

			account.withdraw(amount);
			System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		} 
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch (InputMismatchException e) {		//erro quando o dado da entrada que estou lendo não é do formato esperado do scanner.
			System.out.println("Invalid entry");
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		
		sc.close();
	}

}
