package Array;

import java.util.Scanner;

public class InsertAtPosition {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size : ");
		int length = sc.nextInt();

		int [] arr = new int[length];

		System.out.println ("Enter the "+length+ " Elements :");

		for(int i = 0; i< arr.length;i++) {

			arr[i] = sc.nextInt();

		}

		System.out.println("Array Size Before Imserting an Element : "+length);
		for(int i = 0;i< arr.length;i++) {

			System.out.println("arr["+i+"]--->"+arr[i]);
		}

		System.out.println("Enter Index for Inserting Element : ");

		int index = sc.nextInt();

		System.out.println("Enter an Element to Insert in aray:");

		int ele = sc.nextInt();

		arr = insert(arr,index,ele);
		
		for(int i=0;i<arr.length;i++) {

			System.out.println("arr["+i+"]--->"+arr[i]);
		}

	}


	static int[] insert(int[] arr, int index, int ele) {


		if (index > arr.length || index < 0) {

			System.out.println("Invalid Index : ");

			return arr;

		}else

		{
			int[] newarr = new int [arr.length+1];

			for(int i=0;i<index;i++) {


				newarr [i] =arr[i];

			}

			newarr[index] = ele;

			for(int i = index;i<arr.length;i++) {

				newarr[i+1]=arr[i];
			}

			System.out.println("Arrray Length After Inserting an Element : "+newarr.length);

		
			return newarr;
		}


	}
}




