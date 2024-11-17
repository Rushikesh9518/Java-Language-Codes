package Java;

public class EvenOrOdd {


	public static void checkEvenOrOdd(int number) {

		if ((number & 1)==0) {

			System.out.println(number + " is Even.");

		}else { 

			System.out.println(number + " is Odd.");

		}
	}
	public static void main(String[] args) {

		int num1 = 42;
		int num2 = 27;

		checkEvenOrOdd(num1);
		checkEvenOrOdd(num2);
	}

}

