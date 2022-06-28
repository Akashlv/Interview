
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		char[] s = "Akash123".toCharArray();
		char[] d = "Aaksh321".toCharArray();

		if (s.length == d.length) {
			Arrays.sort(s);
			Arrays.sort(d);

			for (int i = 0; i < s.length; i++) {
				if (s[i] != d[i]) {
					System.out.println("Not Anagram");
				} else {
					System.out.println("Anagram");
				}
			}
		}
	}
}
