package Java;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

		int [] arr = {10,22,34,11,33,65};

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter an Element to search  :");

		int ele = sc.nextInt();

		int idx = Search(arr,ele);

		if(idx>=0) {

			System.out.println("Element found at index : "+idx);

		}else {

			System.out.println("Element Not found ");

		}


	}
	public static int Search (int[] arr,int ele) {

		for(int i = 0;i<arr.length;i++) {
			if(ele == arr[i]) {

				return i;
			}
		}
		return -1;

	}
}
