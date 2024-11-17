package Java;

public class SubtractWithoutMinus {
	
	
	public static int subtractNumbers(int a,int b) {
	
	while (b != 0) {
		
		int borrow = (~a) & b;
		
		a = a^b;
		
		b = borrow << 1;
	}
	return a;
	}
	
	public static void main(String[] args) { 
		
		int num1 = 20;
		int num2 = 13;
		
		int result = subtractNumbers(num1,num2);
		
		System.out.println("The result of(" + num1 + "-" + num2+ ")is : " + result);
	} 
}
