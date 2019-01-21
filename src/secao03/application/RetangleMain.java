package secao03.application;

import java.util.Locale;
import java.util.Scanner;
import secao03.entities.Retangle;

public class RetangleMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangle r = new Retangle();
		
		
		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println("AREA = " + r.area());
		System.out.println("PERIMETER = " + r.perimeter());
		System.out.print("DIAGONAL = " + r.diagonal());
		
		sc.close();
	}

}
