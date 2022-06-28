
public class swapTwoNumbers {

	int i, j;

	static void swapUsingTemp(int i, int j) {

		System.out.println("I before Swap - " + i + " J before Swap - " + j);
		int temp = i;
		i = j;
		j = temp;
		System.out.println("I Afert Swap - " + i + " J after Swap - " + j);
	}

	static void swapWithoutUsingTemp(int i, int j) {

		System.out.println("I before Swap - " + i + " J before Swap - " + j);
		i = i + j;
		j = i - j;
		i = j - i;
		System.out.println("I Afert Swap - " + i + " J after Swap - " + j);
	}

	public static void main(String[] args) {

		swapUsingTemp(10, 12);
		swapWithoutUsingTemp(10, 12);

	}
}
