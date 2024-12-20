package Java;

public class SumofDigitsbyRecursion {

	public static int sumOfDigits(int number) {

		if(number == 0) {
			return 0;
		}

		return number % 10 +sumOfDigits(number/10);

	}

	public static void main(String[] args) {

		int number = 12345;
		int result = sumOfDigits(number);

		System.out.println("The sum of the digits of " + number + " is: " + result);

	}

}
