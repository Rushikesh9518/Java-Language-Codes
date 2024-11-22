package Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchString {

	public static void main(String[] args) {

		String[] testStrings = {

				"abbbb",  
				"abbbbbb", 
				"a",       
				"ab",      
				"abbbbbbb", 
				"abbbbbbbb", 
				"abbbbbbbbb" 
		};

		String regex = "ab{4,8}";

		Pattern pattern = Pattern.compile(regex);

		for(String s : testStrings) {

			Matcher matcher = pattern.matcher(s);

			if (matcher.matches()) {
				System.out.println(s + " -> matches.");
			}else {
				System.out.println(s + " -> does not match.");
			}

		}
	}
}

