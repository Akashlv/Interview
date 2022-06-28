
// Swiggy
public class RepeatNextCharactersWhenEncouterdTheVowels {

	public static void main(String[] args) {

		String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int i = 0;
//		String  = "ABCDEFFGGHHIJJJKKKLLL";

		for (int j = 0; j < input.length() - 1; j++) {

			System.out.print(Character.toString(input.charAt(j)));

			if (Character.toString(input.charAt(j)).equals("E")) {

				for (int k = j + 1; k < input.length() - 1; k++) {

					System.out.print(Character.toString(input.charAt(k)));

					if (Character.toString(input.charAt(k)).equals("I")) {

						for (int u = k + 1; u < input.length() - 1; u++) {

							System.out.print(Character.toString(input.charAt(u)));

							if (Character.toString(input.charAt(u)).equals("O")) {

								for (int w = u + 1; w < input.length() - 1; w++) {

									System.out.print(Character.toString(input.charAt(w)));

									if (Character.toString(input.charAt(w)).equals("U")) {

										for (int q = w + 1; q < input.length() - 1; q++) {

											System.out.print(Character.toString(input.charAt(q)));

											i = 4;
											while (i != 0) {
												System.out.print(Character.toString(input.charAt(q)));
												i--;
											}
										}
									}

									i = 3;
									while (i != 0) {
										System.out.print(Character.toString(input.charAt(w)));
										i--;
									}
								}
							}

							i = 2;
							while (i != 0) {
								System.out.print(Character.toString(input.charAt(u)));
								i--;
							}
						}
					}

					i = 1;
					while (i != 0) {
						System.out.print(Character.toString(input.charAt(k)));
						i--;
					}
				}
			}

		}
	}

}
