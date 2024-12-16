package Java;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		System.out.println("Enter The String");
		String st = sc.nextLine();

		String newstr="";

		char ch[] =st.toCharArray();

		for(int i=0;i<ch.length/2;i++) {

			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;

		}

		newstr =new String(ch);

		if(newstr.equalsIgnoreCase(st)){
			System.out.println(st+" is Palindrome String");
		}else {
			System.out.println(st+" is not Palindrome String");
		}


		sc.close();
	}

}
