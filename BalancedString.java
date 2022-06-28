
import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		String expr = "((({}{}))()";

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
			} else {

				switch (x) {
				case ')':
					if (stack.pop() != '[')
						break;

				case '}':
					if (stack.pop() != '[')
						break;

				case ']':
					if (stack.pop() != '{')
						break;
				}
			}

		}
		System.out.println(stack);
		if (stack.isEmpty()) {
			System.out.println("Balanced ");
		} else {
			System.out.println("Not Balanced ");
		}

	}
}
