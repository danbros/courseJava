package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class ExCondicional001 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====Checks if a integer is negative or positive====");
		
		System.out.println("\nEnter whith a whole number");
		int n = sc.nextInt();
		
		if(n == 0)
			System.out.println("The number 0 is neutral");
		else if(n > 0)
			System.out.println("The number is positive");
		else
			System.out.println("The number is negative");
		
		sc.close();
		
	}

}
