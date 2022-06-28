
import java.util.ArrayList;
import java.util.List;

// MediBuddy
public class SplitList {

	public static List[] split(List<String> list) {

		List<String> first = new ArrayList<String>();
		List<String> second = new ArrayList<String>();

		int size = list.size();
		System.out.println(size);
		System.out.println(size / 2);

		for (int i = 0; i < size / 2; i++)
			first.add(list.get(i));

		for (int i = size / 2; i < size; i++)
			second.add(list.get(i));

		return new List[] { first, second };
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Medi");
		list.add("Buddy");
		list.add("Banglore");
		list.add("Karnataka");
		list.add("India");

		List[] lists = split(list);

		System.out.println(lists[0]);
		System.out.println(lists[1]);
	}
}
