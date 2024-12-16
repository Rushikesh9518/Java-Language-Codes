package Java;

import java.util.Scanner;

public class StringReverse {

	public static void main (String[] args) {

		Scanner sc =new Scanner (System.in);

		System.out.println("Enter The String to reverse");

		String str=sc.nextLine();

		char ch[]=str.toCharArray();
		String newStr="";

		for(int i=0;i<ch.length/2;i++) {

			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;

		}

		newStr =new String(ch);

		System.out.println("Reversed String is as follows : "+newStr);

		sc.close();

	}
}
