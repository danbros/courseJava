package secao05.application;

import java.util.Locale;
import java.util.Scanner;

import secao05.entities.Rooms;

public class HostelRooms {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented?: ");
		int n = sc.nextInt();
		Rooms[] vect = new Rooms[10];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("\nRent #%d:\nName: ", i + 1);
			String name = sc.nextLine();
			System.out.print("Email: ");
			String mail = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rooms(name, mail, room);

		}

		System.out.println("\nBusy rooms: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.print(i + ": " + vect[i].getName() + ", " + vect[i].getMail() + "\n");
				
			}
		}

		sc.close();

	}

}
