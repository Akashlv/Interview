
// Neiman Marcus
public class MissingIntInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4 };
		int n = a.length;
		int sum = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < n; i++) {
			sum = sum - a[i];
		}
		System.out.println(sum);
	}
}
