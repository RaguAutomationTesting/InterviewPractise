package org.syntaxbased;

public class ArmstrongNumberOrNot {
	public static void main(String[] args) {
		int num = 153;
		int res = 0;
		int temp = num;

		while (num > 0) {

			int remainder = num % 10;

			res = res + (remainder * remainder * remainder);

			num = num / 10;
			
			//System.out.println(remainder);
			System.out.println(num);

		}
		if (temp == res) {
			System.out.println(temp + " is an armstrong number");

		} else {
			System.out.println(temp + " is not a armstrong number");

		}

	}

}
