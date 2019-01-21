package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//		Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//		começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//		exemplo.

public class ExFor07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("\t\t===Enter with a integer positive:");
		int X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
		}

		sc.close();
	}

}
