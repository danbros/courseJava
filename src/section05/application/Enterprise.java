package section05.application;

import java.util.Locale;
import java.util.Scanner;

//import secao05.entities.Employee;

public class Enterprise {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		//String name = sc.nextLine();
		System.out.print("Gloss salary: ");
		//double glossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		//double tax = sc.nextDouble();
		
		//Employee ee = Employee(name, glossSalary, tax);
		
		//System.out.println("\nEmployee: " + ee);
		//System.out.print("\nWhich percentage to increase salary? ");
		//ee.increaseSalary(sc.nextDouble());
		//System.out.println("\nUpdate data: " + ee);
		
		sc.close();
	}

}
