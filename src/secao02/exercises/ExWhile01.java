package secao02.exercises;

//		Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//		impressa a mensagem "Acesso Permitido" e "o algoritmo encerrado". Considere que a senha correta é o valor 2002



import java.util.Locale;
import java.util.Scanner;

public class ExWhile01 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the correct password: ");
		int key = sc.nextInt();
		
		while(key != 2002) {
			System.out.print("\nInvalid password\nEnter the password again: ");
			key = sc.nextInt();
		}
		
		System.out.println("\n\n\nAccess Allowed");
		System.out.println("Closed algorithm");
		
		sc.close();
		
	}
	
}
