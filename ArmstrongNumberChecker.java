package Java;

//ArmStrong Number = The Number Whose sum of power of its digits is the Number ex:num =153 :1^3 + 5^3 + 3^3 =153;

import java.util.Scanner;

public class ArmstrongNumberChecker {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter A Number : ");
		int number = scanner.nextInt();
		
		if(isArmstrong(number)) {
			
			System.out.println(number+ " is an Armstrong number.");
			
		}else {
			
			System.out.println(number + " is not an Armstrong number " );
			
	
		}
		
		scanner.close();
		
	}
	
	public static boolean isArmstrong(int number) {
		int originalNumber = number ;
		int sum = 0;
		int numberOfDigits = String.valueOf(number).length();
		
		while (number!=0) {
			int digit = number %10;
			sum += Math.pow(digit,numberOfDigits);
			number /=10;
		}
		
		return sum == originalNumber;
	}
	
}
