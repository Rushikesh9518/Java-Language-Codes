package Java;

import java.util.Scanner;

class ArrayMethods {

    void printArray(int arr[]) {

        int num = arr.length;

        System.out.println("Array : ");
        for (int i = 0; i < num; i++) {

            System.out.print(" " + arr[i]);
        }
    }

    int maxArray(int arr[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }
        return max;
    }

    int sumofArray(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }
        return sum;
    }

    void reverseArray(int arr[]) {

        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int temp = 0;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArray(arr);
    }

    public int averageofArray(int[] userArray) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'averageofArray'");
    }

}

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayMethods obj = new ArrayMethods();

        System.out.print("Enter The Size of Array : ");

        int arrSize = sc.nextInt();

        int[] userArray = new int[arrSize];
        System.out.println();
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter the + " + (i + 1) + " element : ");
            userArray[i] = sc.nextInt();
        }

        System.out.print("Array You Entered : ");

        for (int i = 0; i < arrSize; i++) {

            System.out.print(" " + userArray[i]);

        }
        System.out.println();
        int choice;
        char ch;
        do {
            System.out.println("1.Print Array : ");
            System.out.println("2.Find Maximum Element In Array : ");
            System.out.println("3.Calculate Sum Of Array Elemnts : ");
            System.out.println("4.Reverse the Given Array : ");
            System.out.println("5.Find Average of Array Elements : ");
            System.out.println("6.Search Given Element in Array : ");
            System.out.println("7.Calculate Count Of Odd and Even Number in Array : ");

            System.out.println("Enter The no of Operation You want to Perform on Array : ");
            choice = sc.nextInt();
            switch (choice) {

                case 1:

                    obj.printArray(userArray);
                    break;

                case 2:

                    int index = obj.maxArray(userArray);
                    System.out.println("Maximum Element in Array : " + index);
                    break;

                case 3:

                    int sum = obj.sumofArray(userArray);
                    System.out.println("Sum Of Array Elements Are : " + sum);
                    break;

                case 4:

                    System.out.print("Given Array: ");
                    obj.printArray(userArray);

                    System.out.print("Reversed Array : ");
                    obj.reverseArray(userArray);
                    break;

                case 5:

                    int Avg = obj.averageofArray(userArray);
                    System.out.println(Avg);

                default:
                    System.out.println("No Match Found ");
                    break;
            }
            System.out.println("Do You Want To Continue (Y/n) : ");
            ch = sc.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        sc.close();
    }
}
