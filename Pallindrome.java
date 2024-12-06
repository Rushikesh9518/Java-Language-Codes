package Java;

public class Pallindrome {

    static int digitcount(int copy) {
        int count = 0;
        while (copy > 0) {
            count++;
            copy /= 10;
        }
        return count;
    }

    static boolean isPallindrome(int copy) {

        String numStr = Integer.toString(copy);
        int left = 0;
        int right = (digitcount(copy) - 1);
        // numStr.length()-1
        // digitcount not needed if .length()is used

        while (left < right) {

            if (numStr.charAt(left) != numStr.charAt(right)) {

                return false;

            }

            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {

        int num = 23;
        int copy = num;

        if (isPallindrome(copy)) {

            System.out.println(num + " is a pallindrome no ");

        } else {

            System.out.println(num + " is not a pallindrome no");
        }

    }
}
