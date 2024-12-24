package Java;

import java.util.Scanner;

public class CheckPrimeSeries {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println ("enter number");
		int num=sc.nextInt();

		System.out.println("Prime numbers between 1 and " + num);

		for (int i=1; i < num; i++)
		{

			boolean isPrime = true;

			for (int j=2; j < i ; j++)
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				System.out.print (i + " ");
		}
	}
}



