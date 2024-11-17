package Java;

public class PalindromeCheckerbyRecursive {

	public static void main(String[] args) {
		int number = 12321;

		boolean isPalindrome = isPalindrome(number,reverseNumber(number,0));
		if(isPalindrome) {

			System.out.println(number + " is a Palindrome.");

		}else {

			System.out.println(number + "is not palindrome.");
		}
	}

	public static int reverseNumber(int num,int rev) {
		if(num == 0) {

			return rev;

		}

		return reverseNumber(num/10,rev * 10 + num % 10);

	}

	public static boolean isPalindrome(int num,int reversed) {

		return num == reversed;
	}

}
