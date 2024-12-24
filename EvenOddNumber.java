package Java;
import java.util.Scanner;

public class EvenOddNumber {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number to check Even or Odd : ");
		int num = sc.nextInt();
		
		
		if(num%2==0) {
			System.out.println(num+" is Even Number");
			 
		}else {
			System.out.println(num+" is odd Number");
		}
	}
}
