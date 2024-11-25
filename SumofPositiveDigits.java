package Java;

import java.util.Scanner;

public class SumofPositiveDigits {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a positive Integer: ");
		int number = scanner.nextInt();
		
		int sum = calculateSumofDigits(number);
		
		System.out.println("The sum of the digits of " + number + "is: " + sum);
		
		scanner.close();
	}
	
	public static int calculateSumofDigits(int n) {
		int sum = 0;
		
		while (n>0) {
			
			int digit = n % 10;
			sum+= digit;
			n /= 10;
		}
		
		return sum;
	}
	
}
