package section02.exercises;

import java.util.Locale;
import java.util.Scanner;

//-------------------------------------------------------------------------------------------------------------------//
//    Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe     //
//        por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário       //
//                                            com duas casas decimais.                                               //
//-------------------------------------------------------------------------------------------------------------------//

public class Ex04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("=====Calculating salary=====");
		System.out.println();

		System.out.println("Enter whith you code number");
		int code = sc.nextInt();

		System.out.println("Enter whith you worked hours");
		double workHour = sc.nextDouble();

		System.out.println("Enter whith the value per hour");
		double valueHour = sc.nextDouble();

		System.out.println();
		System.out.printf("Employee number \"%d\", you salary is R$\"%.2f\"   Thanks for work!!!", code,
				workHour * valueHour);

		sc.close();
	}

}
