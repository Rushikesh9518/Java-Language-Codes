package Java;

import java.util.Scanner;
public class LeapYearOrNot {

	public static void main(String[] args ) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter a year To check whether Leap year or not :");
		
		int year=scanner.nextInt();
		
		if(year%4==0 && year%100!=0 ||year%400==0) {
			
			System.out.println(year+" is a Leap Year !!!");
			
		}else {
			
			System.out.println(year+" is not a Leap Year...");
		}
		scanner.close();
	}
}
