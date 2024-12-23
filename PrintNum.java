package Java;
import java.util.Scanner;
public class PrintNum {

	public static void main (String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number to Print series: ");
		int number = sc.nextInt();
		
		
		System.out.println("Serial numbers Series : ");
		printSerial(number);
		System.out.println("Reverse number Series : ");
		printReverse(number);
		System.out.println("Sum of numbers upto "+number+": ");
		printSum(number);
	}
	
	static void printSerial(int n) {
		
		for(int i =1;i<=n;i++) {
			System.out.println (+i);
		}
	}
	
	static void printReverse(int n) {
		
		for(int i=n;i>=1;i-- ) {
			
			System.out.println (+i);
		}
	}
	
	static void printSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
	 System.out.print(+sum);
	}
	
}
