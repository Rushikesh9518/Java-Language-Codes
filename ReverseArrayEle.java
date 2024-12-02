package Array;

import java.util.Scanner;

public class ReverseArrayEle {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array Size");
		
		int length =sc.nextInt();
		
		int[] arr =new int[length];
		
		System.out.println("Enter The "+length+" Elements");
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
			
			
		}
		
		System.out.println("Array Elements Before Reverse:");
		for(int j=0;j<arr.length;j++) {
			
			System.out.println("arr["+j+"] ----> "+arr[j]);
		}
		
		for(int i=0;i<arr.length/2;i++) {
			
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
			
		}
		
		System.out.println("After Reverse of an Array :");
		
		for(int i =0; i<arr.length; i++) {
			
			System.out.println("arr["+i+"]---->"+arr[i]);		}
		
		
		sc.close();
	}	
	

}
