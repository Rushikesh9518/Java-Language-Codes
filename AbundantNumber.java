import java.util.Scanner;

public class AbundantNumber {

    static boolean isAbundant(int num) {

        int sum = 0;

        for (int i = 1; i < num / 2; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        if (sum > num) {

            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number tO check Abundant Or Not : ");

        int num = scanner.nextInt();

        if (isAbundant(num)) {

            System.out.println(+num + " is an Abundant Number ");

        } else {

            System.out.println(+num + " is not an Abundant Number ");

        }
        scanner.close();
    }
}
