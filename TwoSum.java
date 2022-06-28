
public class TwoSum {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 5 };
		int out = 5;

		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == out) {
					System.out.println("I is :" + i + " J is :" + j);
				}

				if (a[j] == out - a[i]) {
					System.out.println("I is :" + i + " J is :" + j);
				}
			}
	}

}
