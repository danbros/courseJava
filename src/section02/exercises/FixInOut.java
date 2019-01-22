package section02.exercises;

import java.util.Locale;
import java.util.Scanner;

       //----------------------------------------------------------------//
      //	  Fazer um programa para executar o seguinte procedimento   //
     //    de entrada de dados, e depois mostrar os dados na tela:     //
    //----------------------------------------------------------------//


public class FixInOut {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter you full name: ");
		String name = sc.nextLine();
		System.out.println();
		System.out.print("How many bedrooms are there in you house? ");
		int bedroom = sc.nextInt();
		System.out.println();
		System.out.print("Enter product price: ");
		double price = sc.nextDouble();
		System.out.println();
		System.out.print("Enter you last name, age and height (same line): ");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println();
		System.out.println();
		
		System.out.println(name);
		System.out.println(bedroom);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();

	}

}
