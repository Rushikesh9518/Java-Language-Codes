package Java;

import java.util.Scanner;

class PrimeNumber {

    static int[] printFactorials(int[] arr) {

        int[] factArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int fact = factorial(num);
            factArr[i] = fact;
        }
        return factArr;
    }

    static int factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact *= i;
        }

        return fact;
    }

    static int primeCount(int[] arr) {

        int pCount = 0;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            if (isPrime(num)) {

                pCount++;
            }
        }
        return pCount;
    }

    // helper function to print arr
    static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    static boolean isPrime(int num) {

        int factorCount = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {

                factorCount++;
            }
        }

        if (factorCount == 2) {

            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {

            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }

        printArr(arr);
        System.out.println("Prime count is : " + primeCount(arr));
        int[] fact = printFactorials(arr);
        printArr(fact);

        sc.close();
    }
}