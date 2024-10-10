package org.syntaxbased;

public class OddAndEvenCount {
	public static void main(String[] args) {
		int oddCount = 0, evenCount = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenCount++;
				System.out.println("Given number: " + i + " is even");

			} else {
				oddCount++;
				System.out.println("Given number: " + i + " is odd");

			}

		}

		System.out.println("Odd number count: " + oddCount);
		System.out.println("Even number count: " + evenCount);
	}

}
