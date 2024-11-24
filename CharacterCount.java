package Java;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		String input = "hello world";
		
		countCharacterOccurrences(input);
		
	}
	
	public static void countCharacterOccurrences (String str) {
		
		Map<Character ,Integer> charCountMap = new HashMap<>();
		
		char[] chars = str.toCharArray();
		
		for (char c : chars) {
			if (Character.isWhitespace(c)) {
				continue;
			}
			
			charCountMap.put(c,charCountMap.getOrDefault(c,0) +1);
		}
		
		for (Map.Entry<Character,Integer> entry : charCountMap.entrySet()) {
			System.out.println("Character '"+ entry.getKey() + "'occurs" +entry.getValue()+ "times.");
		}
	}

}
