package org.syntaxbased;

public class PalindromeOrNot {
	public static void main(String[] args) {
		int num = 121;
		int res = 0;
		int temp = num;

		while (num > 0) {
			int remainder = num % 10;

			res = (res * 10) + remainder;

			num = num / 10;

		}
		if (res == temp) {
			System.out.println(res + " is palindrome");

		} else {
			System.out.println(res + " is not palindrome");

		}
		System.out.println("Value in num =  " + num);

	}

}
