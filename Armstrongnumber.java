public class Armstrongnumber {

    static int digitcount(int copy) {
        int count = 0;
        while (copy > 0) {
            count++;
            copy /= 10;
        }
        // System.out.println(count);
        return count;
    }

    static int isArmstrong(int copy, int digit) {
        int sum = 0;
        while (copy > 0) {

            sum += (int) Math.pow(copy % 10, digit);
            copy /= 10;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        int num = 152;
        int copy = num;

        if (isArmstrong(copy, digitcount(copy)) == num) {

            System.out.println("Given Number is Armstrong Number ");

        } else {

            System.out.println("Given Number is not a Armstrong Number : ");

        }
    }

}
