
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

// Walmart
public class FindCommonElementInListOfIntegerArray {

	public static void main(String[] args) {
		int i1[] = { 1, 2, 3 };
		int i2[] = { 1, 2, 4 };
		int i3[] = { 1, 2, 5 };

		ArrayList<int[]> a = new ArrayList<>();
		a.add(i1);
		a.add(i2);
		a.add(i3);

		System.out.println(a.get(0).length);

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < a.get(i).length; j++) {
				if (hm.containsKey(a.get(i)[j])) {
					hm.put(a.get(i)[j], hm.get(a.get(i)[j]) + 1);
				} else {
					hm.put(a.get(i)[j], 1);
				}
			}
		}

		System.out.println(hm);
		for (Entry<Integer, Integer> e : hm.entrySet()) {
			if (e.getValue() == a.size()) {
				System.out.println(e.getKey());
			}
		}

	}
}
