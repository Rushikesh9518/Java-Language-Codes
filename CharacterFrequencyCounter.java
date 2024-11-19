package Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

    public static void main(String[] args) {
    	
        String filePath = "C:/Users/rshin/OneDrive/Desktop/input.txt"; 

        Map<Character, Integer> charCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int c;
            while ((c = reader.read()) != -1) {
                char character = (char) c;

                charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
