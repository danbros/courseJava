package secao02.exercises;


import java.util.Locale;
import java.util.Scanner;

//		Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//		Renda:						Imposto de Renda:
//		de 0 a 2.000.00				Insento
//		de 2000.01 até 3000.00		8%
//		de 3000.01 até 4500.00		18%
//		acima de 4500.00			28%
//		Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//		salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//		de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//		duas casas decimais.


public class ExCondicional08 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\t\t=====CALCULATOR IR=====");
		
		System.out.println("Enter with you salary:");		
		double pay = sc.nextDouble();
		
		if(pay < 0)
			System.out.println("You salary is negative");
		else if(pay > 0 && pay <= 2000)
			System.out.println("Acquit");
		else if(pay > 2000 && pay <= 3000) {
			pay = pay - 2000;
			pay = pay * 0.08;
			System.out.println("R$ " + pay);
		}
		else if(pay >3000 && pay <= 4500) {
			pay = pay - 3000;
			pay = pay * 0.18 + 80;
			System.out.println("R$ " + pay);
		}
		else if(pay > 4500) {
			pay = pay - 4500;
			pay = pay * 0.28 + 80 + 270;
			System.out.println("R$ " + pay);
		}
		
		sc.close();
	}
}
