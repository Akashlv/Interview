
import java.util.HashMap;

public class CountOccuranceOfEachCharacterInString {

	public static void main(String[] args) {

		String s = "akashAADN1233452!! ";
		char[] c = s.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (c[i] != ' ') {
				if (hm.containsKey(c[i])) {
					hm.put(c[i], hm.get(c[i]) + 1);

				} else {
					hm.put(c[i], 1);
				}
			}
		}
		System.out.println(hm);
	}
}
