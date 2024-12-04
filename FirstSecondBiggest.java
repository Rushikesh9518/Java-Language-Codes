package Java;

public class FirstSecondBiggest {

	public static void main (String[] args) {
		
		int arr[] = {23,12,14,91,22,9};
		
		int fbig = arr[0];
		int sbig = arr[1];
		
		for (int i=1;i<arr.length;i++) {
			
			if(fbig<arr[i]) {
				
				sbig = fbig;
				fbig = arr[i];
				
			}else if(sbig<arr[i]) {
				
				sbig = arr[i];
				
			}
			
			
		}
		System.out.println ("First Biggest Element Is :"+fbig);
		System.out.println("Second Biggest Element Is :"+sbig);
		
		
		
		
	}
}
