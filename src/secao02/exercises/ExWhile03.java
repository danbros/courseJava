package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//	Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//	um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//	4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//	que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//	mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//	exemplo.

public class ExWhile03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int alcohol = 0, gasoline = 0, diesel = 0, i = 0;

		while (i != 4) {
			System.out.println("\n\t\t\tGOOD DAY!!!\n\nWhat kind of fuel was supplied?");
			System.out.println("1.Alcohol\t2.Gasoline\t3.Diesel\t4.END:");
			i = sc.nextInt();

			if (i == 1) {
				alcohol++;
				System.out.println("THANK YOU!\nPress enter for continue.");
				sc.nextLine();sc.nextLine();
				System.out.println(new String(new char[30]).replace("\0", "\r\n"));
			} else if (i == 2) {
				gasoline++;
				System.out.println("THANK YOU!\nPress enter for continue.");
				sc.nextLine();sc.nextLine();
				System.out.println(new String(new char[30]).replace("\0", "\r\n"));
			} else if (i == 3) {
				diesel++;
				System.out.println("THANK YOU!\nPress enter for continue.");;
				sc.nextLine();sc.nextLine();
				System.out.println(new String(new char[30]).replace("\0", "\r\n"));
			} else if(i == 4){
				System.out.printf("\n\n\nFINISHED!\nAlcohol: %d\tGasoline: %d\tDiesel: %d\n", alcohol, gasoline, diesel);

			}
			if (i < 1 || i > 4) {
				System.out.print("\nInvalid Code, press enter and try again.");
				sc.nextLine();
				sc.nextLine();
				System.out.println(new String(new char[30]).replace("\0", "\r\n"));//Limpa tela
			}

		}

		sc.close();
	}
	
	 
	
	

}
