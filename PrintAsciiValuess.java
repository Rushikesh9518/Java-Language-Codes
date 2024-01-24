import java.util.Scanner;

public class PrintAsciiValuess {

    static void printAsciiValues(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiValue = (int) ch;
            System.out.println("Character: " + ch + ", ASCII Value: " + asciiValue);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();

        System.out.println("ASCII values of characters in the string:");
        printAsciiValues(inputString);

        scanner.close();
    }

}
