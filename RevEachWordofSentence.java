package Java;
import java.util.Scanner;
public class RevEachWordofSentence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Sentence: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();

		String revStr=" ";

		for(int i=0;i<ch.length;i++) {

			int k=i;
			while(i<ch.length && ch[i]!=' ') {
				i++;

			}
			int j =i-1;

			while(k<=j) {
				revStr =revStr+ch[j];
				j--;
			}
			revStr =revStr+' ';
		}
		System.out.println("Each Word of Sentence is Reversed : \n"+ revStr);	
		sc.close();
	}
}
