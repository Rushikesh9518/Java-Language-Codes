package Java;

import java.util.Scanner;

public class BiggestMatrixEle {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Order");
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int arr[][] =new int[m][n];
		
		System.out.println("Enter " + m*n+" Elements");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Entered Matrix :");
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+"("+i+","+j+")");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			
			int big =arr[i][0];
			for(int j=i;j<arr[i].length;j++) {
				
				if(big<arr[i][j])
					big =arr[i][j];
				break;
			}
			System.out.println(i+1+" row biggest element "+big);
		}
		
		for(int i=0;i<arr[0].length;i++) {
			
			int big =arr[0][i];
			for(int j=0;j<arr.length;j++) {
				if(big<arr[j][i])
					big=arr[j][i];
			}
			System.out.println(i+1+" Column biggest element "+big);
		}
	}
	
}
