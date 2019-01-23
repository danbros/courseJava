package section03.application;

import java.util.Locale;
import java.util.Scanner;

import section03.entities.Student;


public class University {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.println("Enter with you name: ");
		st.nameS = sc.nextLine();
		System.out.println("Enter with you tree entry: ");
		st.grade1 = sc.nextDouble();
		st.grade2 = sc.nextDouble();
		st.grade3 = sc.nextDouble();
		
		System.out.println("\n\nFINAL GRADE = " + st);
		System.out.println(st.passNo());
		
		sc.close();

	}

}
