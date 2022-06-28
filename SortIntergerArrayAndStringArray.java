import java.util.ArrayList;
import java.util.TreeSet;

public class SortIntergerArrayAndStringArray {

	public static void main(String[] args) {

		int[] ar = { 2, 1, 4, 3, 6 };
		ArrayList<Integer> re = new ArrayList<Integer>();

		for (int i = 0; i < ar.length; i++) {
			int temp = 0;

			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;

				}
			}
			re.add(ar[i]);
		}
		System.out.println(re);

		String[] ar1 = { "junk", "akash", "aakas", };
		ArrayList<String> re1 = new ArrayList<String>();
		TreeSet<String> tr = new TreeSet<String>();

		for (int i = 0; i < ar1.length; i++) {
			String temp = null;
			for (int j = i + 1; j < ar1.length; j++) {
				if (ar1[i].compareTo(ar1[j]) > 0) {
					temp = ar1[i];
					ar1[i] = ar1[j];
					ar1[j] = temp;
				}
			}
			re1.add(ar1[i]);
		}

		System.out.println(re1);

		for (int i = 0; i < ar1.length; i++) {
			tr.add(ar1[i]);
		}

		System.out.println(tr);
	}
}
