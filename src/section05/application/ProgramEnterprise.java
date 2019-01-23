package section05.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import section05.entities.Employee;

public class ProgramEnterprise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("\nEmployee #%d:\nID: ", i + 1);
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("\nEnter the employee ID that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("\nThis ID does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		
		
		System.out.println("\nList of employees:");
		for(Employee x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
