package app.math;

import java.util.Locale;
import java.util.Scanner;

public class RunRetangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SubRetangle r = new SubRetangle();
		
		
		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println("AREA = " + r.area());
		System.out.println("PERIMETER = " + r.perimeter());
		System.out.print("DIAGONAL = " + r.diagonal());
		
		sc.close();
	}

}
