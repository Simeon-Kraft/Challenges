package gcdemos;

import java.util.Scanner;

public class longerName {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String firstName1;
		String lastName1;
		String firstName2;
		String lastName2;

		System.out.println("Enter two names, and I'll tell you which is longer."
				+ " Please enter the given name of the first person: ");
		firstName1 = scnr.next();
		System.out.println("Now enter their surname: ");
		lastName1 = scnr.next();

		System.out.println("Please enter the given name of the second person: ");
		firstName2 = scnr.next();
		System.out.println("Enter the second person's surname: ");
		lastName2 = scnr.next();

		if ((firstName1.length() + (lastName1.length())) > (firstName2.length()) + (lastName2.length())) {
			System.out.println(firstName1 + " has the longer name.");
		} else if ((firstName1.length() + (lastName1.length())) < (firstName2.length() + lastName2.length())) {
			System.out.println(firstName2 + " has the longer name.");
		} else if ((firstName1.length() + (lastName1.length())) == (firstName2.length()) + lastName2.length()) {
			System.out.println("The names are equal in length, though perhaps not in beauty.");
		}

	}

}
