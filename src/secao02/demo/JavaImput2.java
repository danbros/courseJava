package secao02.demo;

import java.util.Locale;
import java.util.Scanner;

public class JavaImput2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //Declarei um objeto do tipo Scanner
		
		// •Ler um número inteiro
		
		System.out.print("Enter a code number: ");
		int n1 = sc.nextInt();						//Captura o valor do objeto sc (next) e converte em int (Int) para n1
		System.out.println();
		
		
		//•Ler um texto até a quebra de linha
		
		System.out.print("Enter you name: ");
		sc.nextLine();								//Serve para consumir o nextLine anterior (flush)
		String name = sc.nextLine(); 				//captura tudo até a prox linha em uma var string
		
		
		//•Ler um código composto de uma letra e um dígito (exemplo: "a3"). Armazenar os valores
		//um em uma variável tipo char e outra tipo int, respectivamente.
		//"char gender = sc.next().charArt(0);" pega a primeira letra digitada (0) da string e manda pra "gender"
		
		System.out.println();
		System.out.print("enter you authenthication code : ");
		String s = sc.next();
		System.out.println();
		char letter = s.charAt(0);  //charAt captura um caractere da var string de acordo com a posicao informada (0)
		int digit = Integer.parseInt(s.substring(1));// integer.parseInt converte string para int, sub a IDE explica bem
		
		
		//• Ler um número double
		
		System.out.print("Enter you zone:");
		double zone = sc.nextDouble(); //converte os dados em double
		
		
		//• Ler um nome (única palavra), sexo (caractere F ou M), idade (inteiro) e altura (double) na
		//mesma linha, armazenando-os em quatro variáveis com os devidos tipos 
		//Exemplo da entrada: "Maria F 23 1.68"
		
		
		System.out.print("%nEnter the data of clients: Name Gender Age Height    ");
		String name2 = sc.next();
		char gender2 = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		//Percebe-se que não pecisamos especificar o lugar dos dados a serem "next", já que ele recorta os dados da var "sc"
		
		
		
		System.out.println();
		System.out.printf("The code %d was accepted", n1);
		System.out.println();
		System.out.printf("Welcome %s", name);
		System.out.println();
		System.out.printf("The letter of you code |%c|, and the digit |%d| was authenthicated",letter ,digit);
		System.out.println();
		System.out.printf("You will be directed to %.2f", zone);
		System.out.println();
		System.out.printf("The data of clients is correct? %s | %c | %d | %.2f", name2, gender2, age, height);
		
		sc.close();

	}

}
