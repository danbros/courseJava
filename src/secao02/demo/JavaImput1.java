package secao02.demo;

import java.util.Scanner;

public class JavaImput1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//Chama Scanner e atribui a entrada para a var sc
		
		String sentence = sc.nextLine();  //nextLine() captura proxima linha digitada, para ao pular linha(enter)
										  //para ao pular linha(dar enter)
		String x, y, z;					  	
		
		x = sc.next();		//next() captura proxima palavra digitada, parando de capturar no proximo espaço ou Enter
		y = sc.next();
		z = sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
	}

}
