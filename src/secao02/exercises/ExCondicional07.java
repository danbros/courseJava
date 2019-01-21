package secao02.exercises;


import java.util.Locale;
import java.util.Scanner;
//																							   Y+
//																					      _____|_____		
//																						  |    |    |
//		Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas | Q2 | Q1 |
//		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o  |____|____|____> X+
//		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).		  |	   |    |
//		Se o ponto estiver na origem, escreva a mensagem “Origem”.						  | Q3 | Q4 |
//		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for  |____|____|
//		a situação.
//		Entrada: 4.5 -2.2		Saída: Q4
//		Entrada: 0.1 0.1		Saída: Q1
//		Entrada: 0.0 0.0		Saída: Origem

public class ExCondicional07 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t=====cartesian Plane=====");
		
		System.out.println("Enter with the Axis X and Y:");		
		float X = sc.nextFloat();
		float Y = sc.nextFloat();
		
		if(X == 0 && Y == 0)
			System.out.println("Mint");
		else if(X == 0)
			System.out.println("Axis X");
		else if(Y == 0)
			System.out.println("Axis Y");
		else if(X > 0 && Y > 0)
			System.out.println("Quadrant Q1");
		else if(X > 0 && Y < 0)
			System.out.println("Quadrant Q4");
		else if(X < 0 && Y > 0)
			System.out.println("Quadrant Q2");
		else
			System.out.println("Quadrant Q3");
		
		sc.close();
	}
}
