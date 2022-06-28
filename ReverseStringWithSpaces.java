
public class ReverseStringWithSpaces {

	public static void main(String[] args) {

		String s = "I am Akash";
		char[] input = s.toCharArray();
		char[] output = new char[input.length];

		for (int i = 0; i < input.length; i++) {
			if (input[i] == ' ') {
				output[i] = ' ';
			}
		}

		int j = output.length - 1;

		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ') {
				if (output[j] == ' ') {
					j--;
				}
				output[j] = input[i];
				j--;
			}
		}
		System.out.println(output);

		String s1 = "I am Akash";
		String reverse = null;

		for (int i = s1.length() - 1; i >= 0; i--) {

			if (s1.charAt(i) != ' ') {
				if (reverse == null) {
					reverse = Character.toString(s1.charAt(i));
				} else {
					reverse = reverse.concat(Character.toString(s1.charAt(i)));
				}
			}
		}

		System.out.println(reverse);

		StringBuffer sb = new StringBuffer(reverse);
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) == ' ') {
				sb.insert(i, ' ');
			}
		}
		System.out.println(sb);
	}
}
