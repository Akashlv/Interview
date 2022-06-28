
public class ReverseStringWithoutChangingPositionOfSpecialCharacter {

	public static void main(String[] args) {

//		Write a program to reverse the string without changing the places of special characters

		String s = "s@mpl#";
		String reverse = null;
		String output = "l@pms#";

		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) == '@' || s.charAt(i) == '#') {

			} else {
				if (reverse == null) {
					reverse = Character.toString(s.charAt(i));
				} else {
					reverse = reverse.concat(Character.toString(s.charAt(i)));
				}
			}

		}
		System.out.println(reverse);
		StringBuilder s1 = new StringBuilder(reverse);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '@' || s.charAt(i) == '#') {
				s1.insert(i, s.charAt(i));
			}
		}
		System.out.println(s1);
	}
}
