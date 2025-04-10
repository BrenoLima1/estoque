package application;

import java.util.Scanner;

import entities.Room;
import entities.Student;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented: ");
		int nRent = sc.nextInt();

		if (nRent <= 10) {

			sc.nextLine();
			Room[] vectRooms = new Room[10];

			for (int i = 1; i <= nRent; i++) {

				System.out.println("Rent #" + (i + 1) + ":");
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Email: ");
				String email = sc.next();

				Student st = new Student(name, email);

				System.out.print("Room: ");
				int nRoom = sc.nextInt();
				sc.nextLine();

				if (vectRooms[nRoom] == null) {
					Room room = new Room(nRoom);
					vectRooms[nRoom] = room;
					room.setOccupant(st);
				} else {
					System.out.println("Room already taken.");
					i--;
				}

			}

			System.out.println("Busy rooms:");
			for (Room room : vectRooms) {
				if (room != null)
					System.out.println(room);
			}

		} else {
			System.out.println("There are only 10 rooms");
		}

	}
}
