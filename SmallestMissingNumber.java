import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Airtel X Labs
public class SmallestMissingNumber {

	public static void main(String[] args) {

		Integer[] u = { 0, 1, 3 };
		List<Integer> a = Arrays.asList(u);
		Collections.sort(a);
		System.out.println(a);
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) > 0) {
				if (a.get(i) + 1 != a.get(i + 1)) {
					System.out.println(a.get(i) + 1);
					break;
				}
			}
			if (i == a.size() - 2) {
				System.out.println(i);
				System.out.println(a.get(i + 1) + 1);
			}

		}
	}

}
