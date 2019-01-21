package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//---------------------------------------------------------------------------------------------------------------//
//     Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1   //
//     o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor   //
//                                                       a ser pago.                                             //
//---------------------------------------------------------------------------------------------------------------//


public class Ex05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======Clothes Store======");
		System.out.println();
		
		System.out.println("Enter whith the data of piece 1: code piece | amount | price");
		int code = sc.nextInt();
		int amount = sc.nextInt();
		double price = sc.nextDouble();
		
		System.out.println("Enter whith the data of piece 2: code piece | amount | price");
		int code1 = sc.nextInt();
		int amount1 = sc.nextInt();
		double price1 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("The Value of pieces whith code \"%d\" and \"%d\" are: %.2f", code, code1, amount * price + amount1 * price1);
		
		sc.close();
		
	}
	
}
