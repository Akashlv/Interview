
// MediBuddy
public class SwapEveryTwoCharacterInAString {

	public static void main(String[] args) {

		String st = "ground";
		String ot = "rguodn";

		char[] c = st.toCharArray();
		for (int i = 1; i < c.length; i = i + 2) {
			char temp;
			temp = c[i - 1]; // g
			c[i - 1] = c[i]; // r
			c[i] = temp; // g

		}
		System.out.println(c);
	}
}
