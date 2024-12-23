package Java;
import java.util.Scanner;
public class PanagramStr {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
		
		System.out.println("given string is: "+"\n"+str);
		String str1= removeSpace(str);
		
		int d = check(str1);
		if(d==-1)
			System.out.print(str+"\n"+"is not panagram");
		else
			System.out.println(str+"\n"+"is a panagram");
		
		sc.close();
		
	}
	public static String removeSpace(String str) {
	
			char ch[] =str.toCharArray();
			String nstr="";
			
			for(int i=0;i<str.length();i++) {
				if(ch[i]!=' ') {
					nstr=nstr+ch[i];
				}
			}
			return nstr;
	}
	public static int check(String str) {
		for(char i ='A';i<='Z';i++) {
			if((str.indexOf(i) < 0)&&(str.indexOf((char)(i+32))<0))
			{
				return -1;
			}
			
		}
		return 1;
	}
	
	}

