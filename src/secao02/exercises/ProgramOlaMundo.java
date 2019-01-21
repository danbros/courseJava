package secao02.exercises; //Criei um pacote, usa funçoes básicas da JRE

import java.util.Scanner; //Precisei importar função Scanner do pacote java.util,pois meu pacote não o tem

public class ProgramOlaMundo {

	public static void main(String[] args) { // Indica que o prog vai rodar a partir daqui
	
		Scanner sc = new Scanner(System.in); // Aqui crio uma var "sc" que recebe dados da função Scanner
		System.out.println("Olá, Mundo!!!"); // KKKK muito louco man

		sc.close(); // Como a var "sc" não foi usada, chamamos a função close
					// para fecharmos, ou a IDE manda aviso
		
			
	}

}
