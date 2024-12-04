package Java;

public class MissingElement {

	public static void main(String []args) {
		int[]arr = {8,15,21,34,43,60};

		System.out.println ("Missing Element in given Array are :");

		for(int i=0;i<arr.length-1;i++) {

			for(int j=arr[i]+1;j<arr[i+1];j++) {

				System.out.println(+j);		
			}
		}

	}
}