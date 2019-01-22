package section02.exercises;
//   Fazer um programa para ler três números inteiros na mesma linha, separados por espaço em branco.
//   Em seguida, mostrar na tela qual é o maior dos números lidos. Se houver empate, mostrar apenas um.

import java.util.Locale;
import java.util.Scanner;

public class ExCondicional01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===Insira 3 numeros, e lhe diremos qual é o maior===");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		if(a >= b && a >= c) 
			System.out.println("O maior numero é : " + a);
			
		else if(b >= c) 
			System.out.println("O maior numero é : " + b);
		
		else  
			System.out.println("O maior numero é : " + c);
		
		
		
		
		sc.close();

	}
}
