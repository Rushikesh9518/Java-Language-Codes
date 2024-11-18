package Java;

import java.util.Stack;

public class BalancedParentheses {

	public static boolean isBalanced (String expression) {

		Stack<Character> stack = new Stack<>();

		for (char ch : expression.toCharArray()) {

			if (ch == '(' || ch == '{' || ch == '[') {

				stack.push(ch);

			} 
			else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {

					return false;
				}
				char top = stack.pop();
				if (!isMatchingPair(top,ch)) {

					return false;
				}
			}
		}

		return stack.isEmpty();

	}

	private static boolean isMatchingPair(char opening,char closing) {

		return (opening == '(' && closing == ')') ||
				(opening == '{' && closing == '}') ||
				(opening == '[' && closing == ']');

	}

	public static void main (String [] args) {

		String expression1 = "{[()]}";
		String expression2 = "{[(])}";
		String expression3 = "({[()]})";


		System.out.println("Expression1 : " + expression1 + " -> " + (isBalanced(expression1) ? "Balanced" : "Not Balanced"));
		System.out.println("Expression2 : " + expression2 + " -> " + (isBalanced(expression2) ? "Balanced" : "Not Balanced"));
		System.out.println("Expression3 : " + expression3 + " -> " + (isBalanced(expression3) ? "Balanced" : "Not Balanced"));
	}

}
