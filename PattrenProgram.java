
public class PattrenProgram {

	public static void main(String args[]) {
		int i, j, row = 6;

		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("--------------");

		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("--------------");

		for (i = row - 1; i >= 0; i--) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (i = 0; i < row; i++) {
			for (j = 2 * (row - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
