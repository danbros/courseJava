package section02.exercises;


import java.util.Scanner;

//		Fazer um programa para ler um número N (se for digitado um valor não positivo, mostrar uma
//		mensagem e ler novamente). Em seguida, N valores inteiros. Mostrar o maior dentre os N números
//		digitados. Veja exemplo:

public class ExForWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1, high = 0, cont = 0;
		System.out.println("Enter N");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println("\nMust be positive, try again:");
			n = sc.nextInt();
		}
		while (i != -1) {
			if (n >= 0) {
				System.out.println("\nEnter with #" + i + " integer positive: (Higher is " + high + ")");
				cont = sc.nextInt();
			} else
				cont = n;
			if (cont <= 0)
				System.out.println("\nMust be positive, try again:");
			else {
				high = cont;
				i++;
				if (n < i)
					i = -1;
			}
		}
		System.out.println("\nHigher is: " +high);

		sc.close();

	}
}
