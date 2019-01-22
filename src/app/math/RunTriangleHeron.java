package app.math;

import java.util.Locale;
import java.util.Scanner;

public class RunTriangleHeron {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SubTriangleH y, x;
		x = new SubTriangleH();
		y = new SubTriangleH();
		
		System.out.println("\t===Receive 3 sides of triangle and calculates the area===\n");
		
		System.out.println("Enter the meansure of triagle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("\nEnter the meansure of triagle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		
		double areaX = x.areaT();
		double areaY = y.areaT();
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		if (areaX == areaY)
			System.out.println("Larger area: X and Y are equals");
		else if(areaX > areaY)
			System.out.println("Larger area: X");
		else
			System.out.println("Larger area: Y");
			
		sc.close();
	}

}
