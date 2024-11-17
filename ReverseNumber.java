package Java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Number to reverse : ");
		int number = scanner.nextInt();

		int reversedNumber = 0;
		int originalNumber = number;

		while (number!=0) {

			int digit = number % 10;
			reversedNumber = reversedNumber * 10 +digit;
			number /= 10;

		}

		System.out.print("The Reverse of " + originalNumber + "is: " + reversedNumber );

		scanner.close();
	}
}
