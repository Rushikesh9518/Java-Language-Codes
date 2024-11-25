package Java;

public class SecondLargestInArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {12,35,1,10,34,1};
		
		int secondLargest = findSecondLargest(numbers);
		
		if(secondLargest != Integer.MIN_VALUE) {
			System.out.println("The Second Largest number is : " + secondLargest);
		}else {
			System.out.println("There is no second largest number.");
		}
	}
	public static int findSecondLargest(int[] arr) {
		
		if(arr == null || arr.length < 2) {
			return Integer.MIN_VALUE;
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num>largest) {
				
				secondLargest = largest;
				largest = num;
			}else if (num > secondLargest && num < largest) {
				secondLargest = num;
			}
		}
	
	return secondLargest;
	}
}
