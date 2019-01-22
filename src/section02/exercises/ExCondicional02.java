package section02.exercises;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class ExCondicional02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====Checks if a integer is pair or odd====");
		
		System.out.println("\nEnter whith a whole number");
		int n = sc.nextInt();
		
		if(n == 0)
			System.out.println("The number 0 is neutral");
		else if(n % 2 == 1)
			System.out.println("The number is odd");
		else
			System.out.println("The number is pair");
	
		
		sc.close();
		
	}
	
}
