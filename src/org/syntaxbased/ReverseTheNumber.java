package org.syntaxbased;

public class ReverseTheNumber {
	public static void main(String[] args) {
		int num = 123;
		int res = 0;

		while (num > 0) {
			int remainder = num % 10;

			res = (res*10) + remainder;

			num = num / 10;

		}
		System.out.println("Reverse of a number: "+res);
	}

}
