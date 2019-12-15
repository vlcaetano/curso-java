package application;

import java.util.Scanner;
import entities.RoomRent;

public class Program_Secao10_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		RoomRent vect[] = new RoomRent[10];
	//  RoomRent[] vect = new RoomRent[10]; mesma coisa
		
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new RoomRent(name, email);
			
			sc.nextLine();
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		/*for (RoomRent obj : vect) { // for each
			if (obj != null) {
				System.out.println(obj); 
				// para ser usado o for each, deve-se enviar o quarto como um parametro e alterar o toString() do RoomRent
			}
		}*/ 
		
		sc.close();
	}

}
