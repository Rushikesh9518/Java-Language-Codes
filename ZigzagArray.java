package DSA;

public class ZigzagArray {

	
	public static void main(String [] args) {
		
		
		int arr1 [] = {12, 13, 23, 15, 11, 16};
		int arr2 [] ={53,26,23,15,18,13,23,45};
		
		int[] zigzagArr = new int [arr1.length+arr2.length];
		
		int i=0,j=0;
		
		for (int k =0;k<zigzagArr.length;) {
			
			if(i<arr1.length) {
				
				zigzagArr[k] = arr1[i];
				i++;
				k++;
			}
			
			if(i<arr2.length) {
				
				zigzagArr[k] = arr2[j];
				j++;
				k++;
			}
			
		} 
		
		System.out.println("Zigzag Array is: ");
		for(int k= 0;k<zigzagArr.length;k++) {
			
			System.out.println(+zigzagArr[k]);
		}
		
		
	}

}
