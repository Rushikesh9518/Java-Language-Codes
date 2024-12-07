package Java;

public class FindPalindrome {
	
	static void display(int[]arr) {
	
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(arr[i]+",");
			}
			System.out.println(".");
	} 
	
	static int reverseDigit(int n) {
		
		int reverse=0;
		
		while(n>0) {
			
			int temp=n%10;
			reverse = reverse*10+temp;
			n=n/10;
		}
		return reverse;
	}
	
	public static void main (String [] args) {
		
		int[] arr ={232, 12, 78, 898, 34543, 45};
		
		display(arr);
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==reverseDigit(arr[i]))
				count++;
	
		}
		
		System.out.println("------------------------");
		System.out.println("Palindrome in Array is :"+count);
		
		
	}
}
