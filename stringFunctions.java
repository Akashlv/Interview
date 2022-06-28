
public class stringFunctions {

	public static void main(String[] args) {

		String s = "akash";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(1));
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(2));
		System.out.println(s.codePointCount(1, 3));
		System.out.println(s.hashCode());
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 4));
	}
}
