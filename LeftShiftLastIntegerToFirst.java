
// Neiman Marcus

public class LeftShiftLastIntegerToFirst {

	public static void main(String[] args) {

		int i = 12345;
		int n = 1;
		String f = Integer.toString(i);
		String t = f.substring(0, f.length() - n);
		System.out.println(t);
		String shift = f.charAt(f.length() - n) + t;
		System.out.println(shift);

	}

}
