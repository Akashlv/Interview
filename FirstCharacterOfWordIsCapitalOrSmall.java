
public class FirstCharacterOfWordIsCapitalOrSmall {

	public static void main(String[] args) {

		String i = "Information Technology";
		String[] s = i.split(" ");

		for (int j = 0; j < s.length; j++) {
			System.out.println(Character.toString(s[j].charAt(0)));
			System.out.println(Character.isUpperCase(s[j].charAt(0)));
		}

	}
}
