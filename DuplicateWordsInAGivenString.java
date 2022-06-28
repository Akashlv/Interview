
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateWordsInAGivenString {

	public static void main(String[] args) {

		String s = "Hello Good Afternoon.Hello Good Eevning";
		String[] sc = s.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i < sc.length; i++) {

			if (hm.containsKey(sc[i])) {
				hm.put(sc[i], hm.get(sc[i]) + 1);
			} else {
				hm.put(sc[i], 1);
			}
		}

		System.out.println(hm);

		for (Entry<String, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
