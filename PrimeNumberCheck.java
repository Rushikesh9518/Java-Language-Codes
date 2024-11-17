package Java;

import java.util.Scanner;

public class PrimeNumberCheck {


	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number =scanner.nextInt();

		if (isprime(number)) {

			System.out.println(number + " is a prime number.");

		}else {

			System.out.println(number + "is not a prime number");
		}
		scanner.close();
	}


	private static boolean isprime(int number) {
		if(number <= 1) {
			return false;

		}

		for(int i =2;i<=Math.sqrt(number);i++) {

			if(number % i ==0) {
				return false;
			}

		}
		return true;
	}
}


