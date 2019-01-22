package section02.exercises;

import java.util.Locale;
import java.util.Scanner;

//---------------------------------------------------------------------------------------//
//	  Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma  //
//	  desses números com uma mensagem explicativa, conforme exemplos.                  //
//------------------------------------------------------------------------------------//


public class Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============Calculator of addition============");
		System.out.println();
		System.out.print("Enter whith the first value: ");
		int v1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter whith the second value: ");
		int v2 = sc.nextInt();
		System.out.println();
		System.out.printf("The addition between the first and second value is \"%d\"", v1 + v2);
		
		sc.close();

	}

}
