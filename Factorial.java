package Java;

import java.util.*;

public class Factorial {

    static int factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number To Get it's Factorial : ");

        int num = scanner.nextInt();
        factorial(num);

        scanner.close();
    }
}
