package Java;

import java.util.Scanner;

public class FactorialCalculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println("Factorial 0f " + number + " is : " + factorial(number));
		
		scanner.close();
	}
	
	
	public static long factorial(int number) {
		
		long result = 1;
		
		
		for(int i = 1; i <= number; i++) {
				result *= i;
		}
		
		return result;
	}
	
	

}
