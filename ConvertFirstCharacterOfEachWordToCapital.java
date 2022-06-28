
// Airtel x Labs
public class ConvertFirstCharacterOfEachWordToCapital {

	public static void main(String[] args) {

		String s = "aIRTEL x lABS";
		String[] n = s.split(" ");

		for (int i = 0; i < n.length; i++) {

			String h = n[i].toLowerCase();
			char[] u = h.toCharArray();
			String f = Character.toString(u[0]).toUpperCase();
			System.out.print(f + h.substring(1) + " ");
		}

	}
}
