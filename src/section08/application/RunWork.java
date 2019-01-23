package section08.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import section08.entities.Department;
import section08.entities.HourContract;
import section08.entities.Worker;
import section08.entities.enums.WorkerLevel;

public class RunWork {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String deptName = sc.nextLine();
		
		System.out.print("Enter worker data:\nName: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double salary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), salary, new Department(deptName));
		
		System.out.print("\nHow many contracts to this worker? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("\nEnter contract #" + (i + 1) + " data:\nDate (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());//section 06/81
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, value, hours);
			worker.addContract(contract);//associa dados do contrato com o trabalhador
		}
		
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("\nName: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getDeptName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
		//O .parse é utilizado quando você converte uma informação que você recebeu e quer ela em um determinado tipo.
		//O .format é quando você tem a informação em um determinado tipo e quer apresentar ela em um formato diferente.
		
	}

}
