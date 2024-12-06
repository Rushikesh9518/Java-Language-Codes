package Java;

import java.util.Scanner;

public class FibonacciSeries {

    static void fibonacciSeries(int num) {
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= num; i++) {
            System.out.print(+firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci Series upto : ");
        int num = sc.nextInt();

        fibonacciSeries(num);

        sc.close();
    }
}
