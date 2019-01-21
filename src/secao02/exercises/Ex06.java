package secao02.exercises;

import java.util.Locale;
import java.util.Scanner;

//----------------------------------------------------------------------------------------------//
//   Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.   //
//   Em seguida, calcule e mostre:																//
																								//
//   a) a área do triângulo retângulo que tem A por base e C por altura.						//
//   b) a área do círculo de raio C. (pi = 3.14159)												//
//   c) a área do trapézio que tem A e B por bases e C por altura.								//
//   d) a área do quadrado que tem lado B.														//
//   e) a área do retângulo que tem lados A e B.												//
//----------------------------------------------------------------------------------------------//

public class Ex06 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====Geometric Calculator=====");
		
		System.out.println("Enter whith value A, B, C");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		System.out.printf("\n-A) The area of rectangle triangle that has A as base and C by height is: %.3f\n", (A * C) / 2);
		
		System.out.printf("-B) The area of radius of circle C is: %.3f\n", Math.PI * Math.pow(C, 2));
		
		System.out.printf("-C) The area of trapeze that has A( and B as base, and C by height is: %.3f\n", ((A + B) * C) / 2);
		
		System.out.printf("-D) The area of square that has side B is: %.3f\n", B * B);
		
		System.out.printf("-E) The area of rectangle of side A and B is: %.3f\n", A * B);
		
		sc.close();
	}

}
