package Java;

import java.util.Scanner;

public class StringUptoLow {

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();

		char ch[] =str.toCharArray();

		for(int i=0;i<ch.length;i++) {

			if(ch[i]>=65 && ch[i]<=90) {
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>=97 && ch[i]<=122) {
				ch[i]=(char) (ch[i]-32);
			}
		}
		str=new String(ch);


		System.out.println("converted String in Case: "+str);
		sc.close();
	}
}