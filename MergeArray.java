package DSA;

public class MergeArray {

	public static void main(String[] args) {
		
		int arr1 [] = {12, 13, 23, 15, 11, 16};
		int arr2 [] = {53, 26, 23, 15, 18, 13};
		
		int[] mergeArr = new int[arr1.length +arr2.length];
		int j =0;
		for(int i=0;i<arr1.length;i++,j++) {
			
			mergeArr[j]= arr1[i];
 		}
		
		for(int i=0;i<arr2.length;i++,j++) {
			
			mergeArr[j]= arr2[i];
			
		}
		
		for(int i=0;i<mergeArr.length;i++) {
			
			System.out.println(+mergeArr[i]);
		}
		
	}
}
