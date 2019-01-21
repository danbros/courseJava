package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//		Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class ExFor04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("\t\t===Enter with the number of integer that will be divided: ");
		int X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			System.out.print("\n\nEnter with the " + i + "ª serie of two numbers\n");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if (y == 0)
				System.out.println("Impossible Division");
			else {
				double aux = x / y;
				System.out.printf("\nDivision: %.2f", aux);
			}
		}

		sc.close();
	}

}
