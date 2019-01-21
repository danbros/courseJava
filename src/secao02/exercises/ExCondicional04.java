package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//    começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class ExCondicional04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====Checks the quantity of hours than you played, between 1 and 24 hours====");
		
		System.out.println("\nEnter with the start time and the end time of the game");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		if(start == end)
			System.out.println("The game lasted 24 hous");
		else if(start > end) {
			start = 24 - start;
			start = start + end;
			System.out.println("The game lasted " + start + " hours");
		}else
			System.out.println("The game lasted " + (end - start) + " hours");
		
			
		
		
		sc.close();
		
	}
	
}
