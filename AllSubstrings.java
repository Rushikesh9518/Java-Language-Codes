package Java;

public class AllSubstrings {

	public static void main(String [] args) {
		
		String input = "abc";
		findAllSubstrings(input);
		
	}
	
	
	public static void findAllSubstrings(String str) {
		
		int length = str.length();
		System.out.println("All Possible substrings of \"" +str + "\":");
		
		for(int i =0;i<length;i++) {
			for(int j =i+1;j<=length;j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}
}
