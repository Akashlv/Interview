
public class CountWordsInSentence {

	public static void main(String[] args) {

		String s = "aksd12334";
		int k = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (Character.isLetter(s.charAt(i))) {

			} else {
				k++;
			}
		}
		System.out.println(k);

		int count = 1;
		String str = "The sunset is beautiful";
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("The string is: " + str);
		System.out.println("No of words in the above string are: " + count);
	}
}
