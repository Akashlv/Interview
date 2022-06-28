
// Airtel X Labs
public class ReverseEvery3CharacterInAString {

	public static void main(String[] args) {

		String s = "abcdef";
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i = i + 3) {

			String s1 = s.substring(i, i + 3);
			System.out.print(new StringBuffer(s1).reverse());
		}
		System.out.println();

	}
}
