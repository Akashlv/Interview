import java.util.ArrayList;

// TCS
public class FabinocciSeries {

	public static ArrayList<Integer> fabinociSeries(int number) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(n1);

		for (int i = 1; i < number; i++) {
			n1 = n2;
			n2 = sum;
			sum = n1 + n2;
			ar.add(sum);
		}

		return ar;
	}

	public static void main(String[] args) {

		int number = 10;
		ArrayList<Integer> arr = fabinociSeries(number);
		System.out.println(arr);
	}

}
