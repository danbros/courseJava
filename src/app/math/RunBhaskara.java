package app.math;

import java.util.Locale;
import java.util.Scanner;
import app.math.SubBhaskara;


public class RunBhaskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\t\t=Quadratic Equation=\n\nEnter with a, b, c: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		SubBhaskara bk = new SubBhaskara(a, b, c);
		
		System.out.print("Delta: " + bk.delta());	
		if(bk.delta() > 0)
			System.out.print("\nRaiz real 1: " + bk.bhask1() + "\nRaiz real 2: " + bk.bhask2());
			
		if(bk.delta() == 0)
			System.out.println("As duas raizes são iguais (delta = 0): " + bk.bhask1());
		
		if(bk.delta() < 0)
			System.out.println("Delta é negativo, raizes são imaginárias.");
				
		System.out.println("\n" + bk.expressao(a, b, c));
		sc.close();
	}

}
