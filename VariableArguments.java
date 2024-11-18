//Write a program which takes a variable number of arguments.

package Java;

public class VariableArguments {
	
	
	public static int calculateSum(int... numbers) {
		
		int sum = 0;
		for(int num : numbers) {
			
			sum+=num;
			
		}
		return sum;
		
	}
	
	public static void main (String[] args) {
		
		System.out.println("Sum of 1,2,3: " + calculateSum(1,2,3));
		System.out.println("Sum of 5,10,15,20: " + calculateSum(5,10,15,20));
		System.out.println("Sum of no numbers: " + calculateSum());
	}
}

