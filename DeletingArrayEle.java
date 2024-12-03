package Java;

import java.util.Scanner;

public class DeletingArrayEle {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();

		int arr[] = new int [length];

		System.out.println("Enter the "+length+"Elements ");

		for(int i = 0;i<arr.length;i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Array Elements Before Deleting ");

		display(arr);

		System.out.println("Enter Position Number to Delete from Array ");

		int pos = sc.nextInt();

		arr=delete(arr,pos);

		display(arr);

	}

	public static void display (int[] arr) {

		for (int i=0; i<arr.length;i++) {

			System.out.println(+arr[i]);
		}
	}

	public static int [] delete (int [] arr,int pos) {

		if(pos>arr.length || pos < 0 ) {

			System.out.println ("Invalid Index");

		}else {

			int [] newArr = new int[arr.length - 1];

			for(int i = 0;i < pos;i++) {

				newArr[i] = arr[i];
			}

			for(int i =pos;i<arr.length;i++) {

				newArr[i-1] = arr[i];
			}
			return newArr;
		}

		return arr;

	}

}
