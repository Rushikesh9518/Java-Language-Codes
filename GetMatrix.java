package Java;

import java.util.Scanner;

public class GetMatrix {
	
	static int[][] readMat() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Row : ");
		int row=scanner.nextInt();
		
		System.out.print("Enter Column  : ");
		int column=scanner.nextInt();
		
		int[][] arr= new int[row][column];
		
		System.out.println("Enter "+row*column+" Matrix Elements");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				arr[i][j]=scanner.nextInt();
			
			}
		}
		
		return arr;
	}
	
	static void display(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] arr=readMat();
		
		display(arr);}

}
