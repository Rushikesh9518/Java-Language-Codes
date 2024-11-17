package Java;

public class FibonacciNonRecursive {


	public static void main(String[] args) {

		int n =10;
		int first = 0,second = 1;


		System.out.println("Fibonacci Series up to " + n + "terms: ");

		System.out.print(first + " ");

		if (n > 1) {

			System.out.print(second + " ");
		}

		for (int i = 3; i <= n; i++) {
			int next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}
	}


}
