package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;


//		Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//		seguir, calcule e mostre o valor da conta a pagar.

//		(1) Cachorro-quente = 4.00   |  (2) X-salada = 4.50			 |  (5) Refrigerante = 1.50
//		(3) X-Bacon = 5.00			 |  (4) Torrada Simples = 2.00


public class ExCondicional05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t=====Corner Snack Bar=====");
		
		
		System.out.println("\nEnter the order code:\n\n(1) Hot-Dog = 4.00\n(2) X-salad = 4.50");
		System.out.println("(3) X-Bacon = 5.00\n(4) Simple Toast = 2.00\n(5) Soda = 1.50\n");
		int cod = sc.nextInt();
		System.out.println("\nEnter the quantity:\n");
		int quant = sc.nextInt();
		double tot = 0;
		
		if(cod == 1)
			tot =+ 4 * quant;
		else if(cod == 2)
			tot =+ 4.5 * quant;
		else if(cod == 3)
			tot =+ 5 * quant;
		else if(cod == 4)
			tot =+ 2 * quant;
		else if(cod == 5)
			tot =+ 1.5 * quant;
		
		System.out.printf("\nThe total price was: %.2f", tot);
		
		sc.close();
	}
}
