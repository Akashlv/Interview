import java.util.HashMap;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {

		String str = "asakash";

		HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			if (charcount.containsKey(str.charAt(i))) {
				charcount.put(str.charAt(i), charcount.get(str.charAt(i)) + 1);
			} else {
				charcount.put(str.charAt(i), 1);
			}
		}

		System.out.println(charcount);

		for (int j = 0; j < str.length(); j++) {

			if (charcount.get(str.charAt(j)) == 1) {

				System.out.println("First non-repeated character is " + str.charAt(j));
				break;
			}
		}
	}

}
