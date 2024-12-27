package Java;
import java.util.Scanner;
public class FactorialNum {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=scn.nextInt();
		
		int fact=1;
		for (int i=1;i<=n ;i++ )
		{
			fact=fact*i;
		}
		System.out.println("Factorial is : "+fact);
	}
}
