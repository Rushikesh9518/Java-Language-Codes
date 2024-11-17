package Java;

public class AddWithoutPlus {
	
	public static int addNumbers(int a, int b) {
		while (b != 0) {
			
			int carry = a & b;
			
			a = a^b;
			
			b = carry << 1;
			
		}
		return a;
	}

	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 32;
		
		int result = addNumbers(num1,num2);
		
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
		
	}
}
