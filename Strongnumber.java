package Java;

public class Strongnumber {

    static int factorial(int num) {
        // int fact = 1;
        // for (int i = 1; i <= num; i++) {

        // fact = fact * i;
        // }
        if (num == 1 || num == 0) {

            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        int num = 145;
        int copy = num;
        int sum = 0;

        while (copy > 0) {
            sum += factorial(copy % 10);
            copy /= 10;
        }

        if (sum == num) {

            System.out.println("Given Number is Strong Number " + sum);

        } else {

            System.out.println("Given Number is Not A strong Number ");
        }

    }
}
