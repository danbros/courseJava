package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//		Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//		Lembrando que, por definição, fatorial de 0 é 1.v

public class ExFor05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("\t\t===FACTORIAL===\n\nEnter with a number:");
		int X = sc.nextInt();
		double aux = 1;

		for (int i = 1; i <= X; i++) {
				aux = aux * i;
		}
		System.out.println("\nFactorial of " + X + " is: " + aux);

		sc.close();
	}

}
