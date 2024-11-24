package Java;

public class ReverseEachWords {
	
	public static void main (String[] args) {
		
		String input = "Hello World";
		String reversed = reverseEachWord(input);
		
		System.out.println ("Original String: " + input);
		System.out.println("Reversed Words String: " + reversed);
		
	}
	
	public static String reverseEachWord (String str) {
		
		String[] words = str.split(" ");
		
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			StringBuilder reverseWord = new StringBuilder (word);
			reverseWord.reverse();
			result.append(reverseWord).append(" ");
			
		}
		
		return result.toString().trim();
		}

}
