package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//-------------------------------------------------------------------------------------------------------------------//
//       Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença     //
//              do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).          //
//----------------------------------------------------------------------------------------------------------------//

public class Ex03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====difference between product of A.B e C.D====");
		
		System.out.println("Enter whith the value of A");
		int A = sc.nextInt();
		
		System.out.println("Enter whith the value of B");
		int B = sc.nextInt();
		
		System.out.println("Enter whith the value of C");
		int C = sc.nextInt();
		
		System.out.println("Enter whith the value of D");
		int D = sc.nextInt();
		
		System.out.println();
		System.out.printf("%d . %d - %d . %d = \"%d\"", A, B, C, D, A*B-C*D);
		
		
		
		sc.close();
	}

}
