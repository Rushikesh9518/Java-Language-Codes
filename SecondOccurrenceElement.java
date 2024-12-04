package Java;

public class SecondOccurrenceElement {

	public static void main(String[] args) {

		int arr[] = {11,22,33,11,45,11};

		display(arr);
		int index = secondoccurrence(arr,11);

		if(index >=0) {

			System.out.println("Second Occurence Element Found At index "+index);

		}else {

			System.out.println("not valid or found");
		}


	}

	public static void display(int arr[]) {

		for (int i =0;i<arr.length;i++) {

			System.out.println("arr["+i+"]----->"+arr[i]);
		}
	}

	public static int secondoccurrence(int[] arr,int ele) {
		int count =0;
		for(int i =0;i<arr.length ;i++){
			if(ele==arr[i]) {
				count++;
			}
			if(count==2) {

				return i;
			}
		}
		return -1;	
	}
}