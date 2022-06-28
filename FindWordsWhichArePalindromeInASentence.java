
// Walmart
public class FindWordsWhichArePalindromeInASentence {

	public static void main(String[] args) {

		String s = "can u refer to the next level";
		String[] sa = s.split(" ");

		for (int i = 0; i < sa.length; i++) {

			System.out.println(sa[i]);

			String s1 = sa[i];
			String rev = null;

			for (int j = s1.length() - 1; j >= 0; j--) {
				if (rev == null) {
					rev = Character.toString(s1.charAt(j));
				} else {
					rev = rev.concat(Character.toString(s1.charAt(j)));
				}
			}

			if (rev.equals(s1)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not Palindrome");
			}

		}
	}
}
