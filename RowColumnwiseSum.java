package Java;

import java.util.Scanner;

public class RowColumnwiseSum {
	
	static int[][] readMat() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Order");
		int m= sc.nextInt();
		int n= sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter "+m*n+" elements");
		
	for(int i=0;i<arr.length;i++) {
		
		for(int j=0;j<arr[i].length;j++) {
			
			arr[i][j] =sc.nextInt();
		}
	}
	return arr;
	}
	
	static void display(int arr[][]) { 
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length;j++) {
				
				System.out.print(arr[i][j]+"("+i+","+j+")");
				
			}
			System.out.println();
		}
	}

		
	public static void main(String[]args) {
		
		int arr[][] =readMat();
		System.out.println("Entered Matrix");
		display(arr);
		
		for(int i=0;i<arr.length;i++) {
			int rsum=0;
			int csum=0;
			
			for(int j=0;j<arr.length;j++) {
				
				rsum=rsum+arr[i][j];
				csum=csum+arr[j][i];
			}
			
	System.out.println(i+1+" row sum is:"+rsum);
	System.out.println(i+1+" Column sum is:"+csum);
		}
	}

}
