
import java.util.Map.Entry;
import java.util.TreeMap;

// Airtel X Labs
public class SortStringInAlphabeticalOrder {

	public static void main(String[] args) {

		String s = "This is new";
		TreeMap<Integer, String> h = new TreeMap<Integer, String>();
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			h.put(a[i].length(), a[i]);
		}

		for (Entry<Integer, String> entry : h.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}
	}
}
