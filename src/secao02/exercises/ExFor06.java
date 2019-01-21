package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//		Ler um número inteiro N e calcular todos os seus divisores sem resto.

public class ExFor06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("\t\t===Calculate divider without rest===\n\nEnter with a number:");
		int X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			if (X % i == 0)
				System.out.println(i);
		}

		sc.close();
	}

}
