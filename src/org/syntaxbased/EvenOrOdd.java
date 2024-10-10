package org.syntaxbased;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");

		int x = s.nextInt();

		if (x % 2 == 0) {
			System.out.println("Given number: " + x + " is even");
		} else {
			System.out.println("Given number: " + x + " is odd");

		}

	}

}
