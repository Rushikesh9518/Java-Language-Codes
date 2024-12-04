package Java;
import java.util.Scanner;

public class BigEleArray {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Length of Array");
		int length = sc.nextInt();
		
		System.out.println("Enter Array of the " +length+ " Elements");
		
		int smaller=0,bigger=0;
		int[] arr = new int[length];
		for(int i =0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i=1;i<arr.length;i++) {
			
			int big = arr[0];
			int small = arr[0];
			
			if(big<arr[i]) {
				
				big = arr[i];
	
			}
			if(small>arr[i]) {
				
				small = arr[i];
				
			}
			
			smaller = small;
			bigger = big;
			
		}
		
		System.out.println("Biggest Element In Array is : " + bigger);
		System.out.println("Smallest Element In Array is : " + smaller);
		
		
		
		
	}
	
}
