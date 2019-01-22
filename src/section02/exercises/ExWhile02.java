package section02.exercises;

//		Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema

//		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Locale;
import java.util.Scanner;

public class ExWhile02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("\t\t=====Infinity Cartesian Plane=====\n\n\n");
		float X = 1, Y = 1;
		
		System.out.println("     Y+");
		System.out.println("_____|_____");		
		System.out.println("|    |    |");
		System.out.println("| Q2 | Q1 |");
		System.out.println("|____|____|____> X+");
		System.out.println("|    |    |");
		System.out.println("| Q3 | Q4 |");
		System.out.println("|____|____|");
		
		
		

		while (X != 0 || Y != 0) {
			System.out.println("\nEnter with the Axis X and Y:");
			X = sc.nextFloat();
			Y = sc.nextFloat();

			if (X == 0 || Y == 0)
				System.out.println("FINISHED");
			else if (X > 0 && Y > 0)
				System.out.println("Quadrant Q1");
			else if (X > 0 && Y < 0)
				System.out.println("Quadrant Q4");
			else if (X < 0 && Y > 0)
				System.out.println("Quadrant Q2");
			else
				System.out.println("Quadrant Q3");
		}
		sc.close();

	}

}
