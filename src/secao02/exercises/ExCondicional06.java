package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;


//		Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes
//		intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//		nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.


public class ExCondicional06 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t=====Range=====");
		
		
		System.out.println("Enter with a integer between 0 and 100");
		float num = sc.nextFloat();
		
		if(num >= 0 && num <= 25)
			System.out.println("Range [0, 25]");
		else if(num > 25 && num <= 50)
			System.out.println("Range [25, 50]");
		else if(num > 50 && num <= 75)
			System.out.println("Range [50, 75]");
		else if(num > 75 && num <= 100)
			System.out.println("Range [75, 100]");
		else
			System.out.println("Out of range");
		
		sc.close();
	}
}
