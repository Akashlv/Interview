
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTwoUniqueIntegerLeadToSumAndStroreInTwoDifferentList {

	public static void main(String[] args) {

		int[] a = { 2, 4, 5, 3, 7, 8, 2, 5, 8, 9, 3, 4, 6, 7, 3, 8, 2, 6, 3, 9, 1, 1, 3, 3 };
		int sum = 10;
		HashSet<Integer> s1 = new HashSet<Integer>();
		HashSet<Integer> s2 = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == sum) {
					System.out.println(a[i] + " + " + a[j] + " = 10");
					s1.add(a[i]);
					s2.add(a[j]);
				}
			}
		}

		System.out.println(s2);
		List<Integer> l = new ArrayList<Integer>(s1);
		Collections.reverse(l);
		System.out.println(l);

	}
}
