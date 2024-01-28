import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListByUserRange {

    static ArrayList<Integer> ArrayListRange(int start, int end) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i = start; i <= end; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {

                    count++;

                }
            }

            if (count == 2) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Start To Get ArrayList : ");
        int start = scanner.nextInt();

        System.out.println("Enter End Number of ArrayList : ");
        int end = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList = ArrayListRange(start, end);

        for (int i : arrayList) {

            System.out.println(i);
        }

        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println(arrayList.get(i) + " ");
        }

        System.out.println(+arrayList.size());
        scanner.close();

    }

}
