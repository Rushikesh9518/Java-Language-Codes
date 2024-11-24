package Java;

import java.util.Arrays;

public class CircularRotation {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int k = 2;

		System.out.println("Original Array : " + Arrays.toString(array));
		System.out.println("After left Rotation: " + Arrays.toString(leftRotate(array,k)));
		System.out.println("After Right Rotattion: " + Arrays.toString(rightRotate(array,k)));

	}
	public static int[] leftRotate(int[] arr,int k) {
		int n = arr.length;
		k = k % n;
		int[] result = new int [n];

		for(int i = 0;i<n;i++) {

			result[i] = arr[(i+k)%n];

		}
		return result;
	}

	public static int[] rightRotate(int[] arr,int k) {
		int n = arr.length;
		k = k%n;
		int[] result = new int[n];

		for(int i =0;i<n;i++) {
			result [(i+k)% n] = arr[i];

		}
		return result;
	}
}

