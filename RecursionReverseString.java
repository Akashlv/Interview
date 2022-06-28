// Walmart
public class RecursionReverseString {

	static void reverse(String f) {

		if (f.length() > 0) {
			System.out.print(f.charAt(f.length() - 1));
			String j = f.substring(0, f.length() - 1);
			reverse(j);
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		reverse(s);
	}

}
