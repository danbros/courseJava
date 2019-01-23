package section05.application;

import java.util.Locale;
import java.util.Scanner;

public class Matrixx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter with the N lines: ");
		int m = sc.nextInt();
		System.out.print("\nEnter with the N column: ");
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter with a number of matrix: ");
		int x = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x)
					System.out.println("Position " + i + "," + j);
				if (j > 0)
					System.out.println("Left: " + matriz[i][j - 1]);
				if (j < matriz[i].length - 1)
					System.out.println("Right: " + matriz[i][j + 1]);
				if (i > 0)
					System.out.println("Up: " + matriz[i - 1][j]);
				if (i < matriz.length - 1)
					System.out.println("Down: " + matriz[i + 1][j]);

			}
		}
		//Another ay of calculated the index of a position
		// int x = 42;
		// int[] matriz = {1, 2, 3, 42};

		// Spoiler alert: index == 3
		// int index = Ints.indexOf(matriz, x);

		// Library Guava...

		sc.close();

	}

}
