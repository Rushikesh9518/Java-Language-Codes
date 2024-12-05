package Java;

public class ExchangeofElements {

	public static void main(String[] args) {
		int arr[] = {21,12,15,32,16,17,22};
		System.out.println("Array before Exchange :");
		display(arr);
		int n;

		if(arr.length%2==0) {
			n=arr.length/2;
		}else {
			n=(arr.length/2)+1;

		}

		for(int i = 0;i<arr.length/2;i++) {

			int temp=arr[i];
			arr[i]=arr[n+i];
			arr[n+i]=temp;
		}

		System.out.println("\nArray After Exchange :");
		display(arr);
	}

	public static void display(int[]arr) {
		for(int i =0;i<arr.length;i++) {

			System.out.print(" "+arr[i]);

		}
	}

}
