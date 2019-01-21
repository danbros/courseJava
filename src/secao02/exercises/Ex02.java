package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

        //---------------------------------------------------------------------------------------//
	   //   Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor   //
	  //    	   da área deste círculo com quatro casas decimais conforme exemplos.          //
	 //---------------------------------------------------------------------------------------//

public class Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======Value of radius of a circle======");
		System.out.println();
		System.out.print("Enter whith the radius: ");
		double radius = sc.nextDouble();
		double area = 3.14159 * (radius * radius);
		System.out.println();
		System.out.printf("The area of circle is \"%.4f\"", area);
		
		sc.close();

	}

}
