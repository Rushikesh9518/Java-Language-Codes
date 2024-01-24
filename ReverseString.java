
import java.util.*;

public class ReverseString {

    static String reverseString(String str) {
        int start = 0;
        int end = (str.length()) - 1;

        char[] charArray = str.toCharArray();

        while (start < end) {

            char store = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = store;

            start++;
            end--;

        }
        String str1 = new String(charArray);
        return str1;
    }

    static String reverseWithSB(String str) {

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }

    static String reverseInO_N_(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {

            if (str.charAt(start) != str.charAt(end)) {

                str.charAt(start);
                str.charAt(end);

                // swap
            }
        }
        return str;
    }

    public static void main(String[] args) {

        System.out.println("Enter String to Reverse : ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("String entered : " + str);
        String reverseStr = reverseString(str);

        System.out.println("Reverse String As Follows : " + reverseStr);
        System.out.println("REverse with SB : " + reverseWithSB(str));

        sc.close();

    }
}
