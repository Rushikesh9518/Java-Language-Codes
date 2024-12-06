package Java;

import java.util.Scanner;

public class InsertArrayEle {
	
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Array Size");
	
	int length =sc.nextInt();
	
	int[] arr =new int[length];
	
	System.out.println("Enter The "+length+" Elements");
	
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
		
		
	}
	
	System.out.println("Array Elements are as Follows:");
	for(int j=0;j<arr.length;j++) {
		
		System.out.println("arr["+j+"] ----> "+arr[j]);
	}
	
	
	
}	
}
	


