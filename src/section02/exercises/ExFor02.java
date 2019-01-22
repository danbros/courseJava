package section02.exercises;

import java.util.Scanner;

//		Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//		Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//		essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).


public class ExFor02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t===Enter with the number of integer that will be read: ");
		int X = sc.nextInt();
		int in = 0, out = 0;
		
		for(int i = 1; i <= X; i++) {
			System.out.print("\nEnter with the " + i + "ª number : ");
			int aux = sc.nextInt();
			if(aux >= 10 && aux <=20)
				in++;
			else
				out++;
		}
		System.out.println("\n\n" + in + " in\n" + out + " out");
		
		sc.close();
	}

}
