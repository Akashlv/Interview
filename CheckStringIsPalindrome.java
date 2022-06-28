
public class CheckStringIsPalindrome {

	public static void main(String[] args) {

		String s = "abcd";
		String reverse = null;

		for (int i = s.length() - 1; i >= 0; i--) {

			if (reverse == null) {
				reverse = Character.toString(s.charAt(i));
			} else {
				reverse = reverse.concat(Character.toString(s.charAt(i)));
			}
		}
		System.out.println(reverse);
	}
}
