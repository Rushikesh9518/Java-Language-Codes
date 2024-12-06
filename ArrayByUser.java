package Java;

import java.util.Scanner;

public class ArrayByUser {
    static void printArray(int arr[]) {
        System.out.println("Array Elements are :");
        for (int i = 0; i < arr.length; i++) {

            System.out.println(+arr[i]);

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size ");

        int arrSize = sc.nextInt();

        int[] userArray = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter Array Elements " + (i + 1) + " :");
            userArray[i] = sc.nextInt();
        }
        printArray(userArray);

    }

}
