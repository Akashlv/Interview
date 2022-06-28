import java.util.ArrayList;

public class ShiftAllZeroInArrayToLeft {

	public static void main(String args[]) {
		int arr[] = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int n = arr.length;
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				a.add(arr[i]);
			}
		}

		for (int i = a.size(); i < n; i++) {
			a.add(0);
		}
		System.out.println(a);
	}
}
