package Java;

public class MultiplyByTwoWithoutOperator {
	
	public static int multiplyByTwo(int number) { 
		
		return number << 1;
	}
	
	public static void main(String[] args) {
		
		int num = 7;
		
		int result = multiplyByTwo(num);
		
		System.out.println("The result of multiplying " + num + " by 2 is: " + result);
		
	}

}
