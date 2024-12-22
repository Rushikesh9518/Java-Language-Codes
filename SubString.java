package Java;

import java.util.Scanner;

public class SubString {

	public static void main (String []args) {

		System.out.println("Enter the main String");
		Scanner sc = new Scanner (System.in);

		String str1 = sc.nextLine();

		char ch1[] = str1.toCharArray();

		String str2 = sc.nextLine();

		char ch2[] = str2.toCharArray();
		int find=0;

		for(int i=0;i<ch1.length;i++) {
			int k=i,j=0;

			while(k<ch1.length && j<ch2.length && ch1[k]==ch2[j]) {

				j++;
				k++;
			}
			if(j==ch2.length) {

				find++;
				System.out.println(find+ " times "+str2+" present betweeen "+i+ " to "+k+" indexes ");
			}


		}if(find==0) {
			System.out.println("not found");
		}

	}
}
