package org.syntaxbased;

public class EvenOrOddWithNormalForLoop {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Given number: " + i + " is even");

			} else {
				System.out.println("Given number: " + i + " is odd");

			}

		}
	}

}
