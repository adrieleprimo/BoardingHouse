package application;


import java.util.Scanner;

import entities.Rent;


public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[10];
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();	
		int number = 1;
		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.print("Rent #" + number + ": \n");
			number++;
			System.out.print("Name: ");
			sc.nextLine();
			String Name = sc.nextLine();
			System.out.print("Email: ");
			String Email = sc.next();
			System.out.print("Room: ");
			int Room = sc.nextInt();
			vect[Room] = new Rent(Name, Email);
		
		}
		int total = 0;
		System.out.println();
		System.out.print("Busy rooms:\n");
		for(int i = 0; i<10;i++) {
			if (vect[i] != null) {
			
			System.out.println(i + ": " + vect[i]);
		}
		}
	
		sc.close();

	}

}
