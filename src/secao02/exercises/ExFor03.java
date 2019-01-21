package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//	Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//	de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//	conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//	peso 5.


public class ExFor03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t===Enter with the number of integer that will be read: ");
		int X = sc.nextInt();
		
		
		for(int i = 1; i <= X; i++) {
			System.out.print("\nEnter with the " + i + "ª serie of tree numbers (1ª with weight 2, 2ª with weight 3, 3ª with weight 5:\n");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double aux = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("\nAverage: %.2f", aux);	
		}
		
		
		sc.close();
	}

}
