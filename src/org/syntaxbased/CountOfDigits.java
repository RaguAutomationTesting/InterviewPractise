package org.syntaxbased;

public class CountOfDigits {
	public static void main(String[] args) {
		int num = 12345;
		int count = 0;

		while (num > 0) {
			int remainder = num % 10;

			count++;

			num = num / 10;

		}
		System.out.println("Count of digit: " + count);

	}

}
