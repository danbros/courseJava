package section09.application02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section09.entities02.Employee;
import section09.entities02.OutsourcedEmployee;

public class Program02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int num = sc.nextInt();

		List<Employee> listEmployee = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char valid = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (valid == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);//with instance of new object temporary
				listEmployee.add(employee);	
			}
			else if(valid == 'n') {
				listEmployee.add(new Employee(name, hours, valuePerHour));//without
			}
		}
		
		System.out.println("PAYMENTS:");
		for (Employee x : listEmployee) {
			System.out.println(x);
		}

		sc.close();

	}

}
