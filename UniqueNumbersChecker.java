
//Write a program which takes a sequence of numbers and check if all numbers are unique

package Java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumbersChecker {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a sequence of numbers separated by spaces:");
		String input = scanner.nextLine();
		
		String[] numbersArray = input.split("\\s+");
		
		Set<String> uniqueNumbers = new HashSet<>();
		boolean allUnique = true;
		
		for (String number : numbersArray) {
			if (!uniqueNumbers.add(number)) {
				allUnique = false;
				break;
			}
		}
		
		if (allUnique) {
			System.out.println("All numbers are unique.");
		} else {
			System.out.println("There are duplicate numbers in the sequence.");
		}
		
		scanner.close();
	}
}





