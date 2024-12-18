package Java;
import java.util.Scanner;

public class CountofCharOcc {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the String ");
		String str =sc.nextLine();
		int length = str.length();
		char ch[] = str.toCharArray();

		for(int i=0;i<length;i++) {

			int count = 1;

			for(int j=i+1;j<length;j++) {

				if(ch[i]==ch[j]) {

					count++;

					int k=j;
					while(k<length-1) {
						ch[k]=ch[k+1];
						k++;
					}
					length--;
					j--;
				}


			}
			System.out.println(ch[i]+"occured"+count+"times");

		}
		String newStr=" ";
		for (int i=0;i<length ;i++ )
		{
			newStr=newStr + ch[i];
		}

		System.out.println(newStr);


	}
}