package Java;

public class SumofTwoHighestEle {

	public static void main(String[] args) {

		int arr[] = {21,12,15,32,16,17,22};

		int index = 0;
		int big = arr[0] + arr[1];

		for (int i=1;i<arr.length-1;i++) {

			if(big<arr[i] + arr[i+1]) {
				big = arr[i]+arr[i+1];
				index=i;
			}

		}
		System.out.println("the first element"+"--->"+arr[index]);
		System.out.println("the second element"+"--->"+arr[index+1]);
		System.out.println("Sum of two Elements"+"---->"+big);

	}

}
