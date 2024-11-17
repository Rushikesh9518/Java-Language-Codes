package Java;

import java.util.Scanner;

public class BinaryChecker {
	
	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter A number: ");
		String number = scanner.nextLine();
		
		if (isBinary(number)) { 
			
			System.out.println(number + "is in binary format.");
			
		}else {
			
			System.out.println(number + "is not a binary format.");
			
		}
		
		scanner.close();
	}
	
	public static boolean isBinary(String number) {
		
		for (char ch : number.toCharArray()) {
			
			if(ch != '0' && ch != '1') {
				
				return false;
			}
		}
		return true;
	}

}
