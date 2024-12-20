package Java;
import java.util.Scanner;
public class RevSentence {

	public static void main(String[] args) {

		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the Sentence");
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		String revStr =" ";

		for (int i=ch.length-1;i>=0;i--) {

			int k = i;

			while(i>=0 && ch[i]!=' ') {
				i--;
			}

			int j=i+1;
			while(j<=k) {

				revStr =revStr+ch[j];
				j++;
			}

			revStr = revStr+' ';
		}
		System.out.println ("The reverse sentence is: \n"+revStr);
		sc.close();
	}


}
