package Java;

import java.util.Scanner;

public class AnagaramString {

    static boolean isAnagramString(String str1, String str2) {

        if (str1.length() != str2.length()) {

            return false;
        }
        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);
            int count1 = 0;
            for (int j = 0; j < str1.length(); j++) {

                if (str1.charAt(j) == ch) {
                    count1++;
                }
            }

            int count2 = 0;
            for (int j = 0; j < str2.length(); j++) {

                if (str2.charAt(j) == ch) {

                    count2++;
                }
            }
            if (count1 != count2) {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String  1 : ");

        String str1 = sc.nextLine();

        System.out.print("Enter String  2 : ");

        String str2 = sc.nextLine();

        if (isAnagramString(str1, str2)) {

            System.out.println("Given Strings Are Anagarm String. ");

        } else {

            System.out.println("Given Strings Are Not an Anagram Strings ");
        }

        sc.close();

    }
}