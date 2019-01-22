package section02.exercises;
import java.util.Locale;
import java.util.Scanner;

//		Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//	 	 Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//    	ordem crescente ou decrescente.

public class ExCondicional03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====Checks if two numbers are multiple of each other====");
		
		System.out.println("\nEnter with 2 numbers integers");
		int x = sc.nextInt();
		int y	 = sc.nextInt();
		
		
		if(x % y == 0 || y % x == 0)
			System.out.println("Are multiples");
		else 
			System.out.println("Not are multiples");
		
		
		sc.close();
		
	}
	
}
