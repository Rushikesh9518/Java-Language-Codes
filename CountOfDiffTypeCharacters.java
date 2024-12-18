package Java;

import java.util.Scanner;
public class CountOfDiffTypeCharacters {

	public static void main (String []args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();

		int upperCase=0,lowerCase=0,digit=0,spaces=0,specialSymbol=0;
		for(int i =0;i<ch.length;i++) {

			if(ch [i]>=65 && ch[i] <= 90) {
				
				upperCase++;
				
			}else if(ch[i] >= 97 && ch[i] <= 122){
				
				lowerCase++;
			
			}else if(ch[i] >= 48 && ch[i] <= 57) {
				
				digit++;
			
			}else if (ch[i]==' ') {
				
				spaces++;
			
			}else {
				specialSymbol++;
			}
		}
		System.out.println("no :of upper case letter "+upperCase);
		System.out.println("no: of lower case letter " +lowerCase);
		System.out.println("no: of decimal number " +digit);
		System.out.println("no: of spaces "+spaces);
		System.out.println("no: of special characters " + specialSymbol);



		sc.close();

	}

}
