
public class StringOperations {

    static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {

                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        // System.out.println("Enter String 1");

        String str1 = "MADAM";

        if (isPalindrome(str1)) {

            System.out.println("Given String Is Palindrome String : ");

        } else {

            System.out.println("Given Strig Is not a Palindrome String ");

        }

    }

}