// Walmart
public class permutationCombinationOfStringUsingRecursion {

	static void printPermutn(String str, String ans, int y) {

		if (str.length() == 0) {
			System.out.print(ans + " ");
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutn(ros, ans + ch, y++);
		}

	}

	public static void main(String[] args) {
		String s = "abc";
		printPermutn(s, "", 0);
	}
}
