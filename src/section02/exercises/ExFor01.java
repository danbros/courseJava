package section02.exercises;

import java.util.Scanner;

//		Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//		X, se for o caso.


public class ExFor01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t===Show number odd number up to X===\nEnter with a number: ");
		int X = sc.nextInt();
		
		for(int i = 1; i <= X; i++) {
			if(i % 2 == 1)
				System.out.println(i);
				
			
		}
		
		sc.close();
	}

}
