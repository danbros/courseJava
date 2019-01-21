package secao02.demo;

//Operadores aritméticos

public class Bhaskara { 

	public static void main(String[] args) {
		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3;
		double n4 = 10.0 / 8.0;

		double a = 1.0, b = -3.0, c = -4.0; // valores para a,b e c

		// -b + V b2 - 4.a.c
		// - 2.a

		double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		// função raiz()

		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(x1);

	}

}
