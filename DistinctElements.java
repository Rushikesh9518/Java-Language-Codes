package DSA;

public class DistinctElements {

	public static void main(String[] args) {
		
		int[] arr1 = {12,13,23,15,11,16};
		int[] arr2 = {53,26,23,15,18,13};
		
		System.out.println("Distict array Elements are : ");
		
		for(int i=0;i<arr1.length;i++) {
			
			int found = 0;
			
			for(int j = 0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j]) {
					
					found =1;
					break;
				}
			}
			if(found==0) {
				
				System.out.println(+arr1[i]);
				
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			
			int found = 0;
			
			for(int j = 0;j<arr1.length;j++) {
				
				if(arr2[i]==arr1[j]) {
					
					found =1;
					break;
				}
			}
			if(found==0) {
				
				System.out.println(+arr2[i]);
				
			}
		}
	}
}
