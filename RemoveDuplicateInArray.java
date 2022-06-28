import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 20, 30, 30, 40, 50, 50, 20 };

		List<Integer> a = Arrays.asList(arr);
		a.stream().distinct().collect(Collectors.toList());
		System.out.println(a);
		int length = arr.length;

		int[] temp = new int[length];
		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}

		temp[j++] = arr[length - 1];

		for (int i = 0; i < j; i++) {
			System.out.print(temp[i] + " ");
		}
	}
}