package Java;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords{

    public static String reverseWords(String input) {

    	String[] words = input.split("\\s+");

        Collections.reverse(Arrays.asList(words));

        return String.join(" ", words);
    }

    public static void main(String[] args) {
    	
        String input = "Hello world this is Java";

        System.out.println("Original String: " + input);

        String reversed = reverseWords(input);

        System.out.println("Reversed Words: " + reversed);
    }
}
