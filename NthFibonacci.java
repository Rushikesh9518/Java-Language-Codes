package Java;

import java.util.Scanner;

public class NthFibonacci {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the position (n) to find the n-th Fibonacci number: ");
		int n = scanner.nextInt();
		
		System.out.println("The " + n + " -th Fibonacci number is : " + findFibonacci(n));
		
		
		scanner.close();
	}
		public static long findFibonacci(int n) {
			if(n <= 0) {
				return 0 ;
				
			}else if (n == 1) {
				return 1;
			}
			
			long a = 0,b =1,fib = 1;
			
			for(int i =2; i <= n;i++) {
				fib = a + b;
				
				a = b;
				b = fib;
			}
			
			return fib;
		}
		
}

