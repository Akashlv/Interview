import java.util.ArrayList;

// Swiggy
public class FindCombinationOfStringAndCheckIfAnyConmbinationIsPalindrome {

	static void printPermutn(String str, String ans, int y) {

		ArrayList<String> ar = new ArrayList<String>();

		if (str.length() == 0) {
			System.out.print(ans + " ");
			ar.add(ans);
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutn(ros, ans + ch, y++);
		}
		System.out.println(ar);

	}

	public static void main(String[] args) {

		String s1 = "abc";
		printPermutn(s1, "", 0);

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("rra");
		ar.add("rar");
		ar.add("arr");

		for (int k = 0; k < ar.size(); k++) {

			String s = ar.get(k);
			String news = null;

			char[] c = s.toCharArray();

			for (int i = c.length - 1; i >= 0; i--) {
				if (news == null) {
					news = Character.toString(c[i]);
				} else {
					news = news.concat(Character.toString(c[i]));
				}
			}
			System.out.println(news);

			if (s.equals(news)) {

				System.out.println("Palindrome");
			} else {
				System.out.println("Not Palindrome");
			}
		}
	}
}
