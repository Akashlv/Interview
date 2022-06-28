import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseIntegerArrayUsingCollection {

	public static void main(String[] args) {
		Integer[] i = { 1, 2, 3, 4 };

		List<Integer> a = Arrays.asList(i);
		Collections.reverse(a);
		System.out.println(a);
	}

}
