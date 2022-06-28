import java.util.Calendar;
import java.util.Date;

public class DiagnolElementsFrom2DArray {

	public static void main(String[] args) {

		int[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {

				if (i == j) {
					System.out.print(d[i][j] + " , ");
				}
			}
		}

		System.out.println();

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {

				if ((i + j) == (d.length - 1)) {
					System.out.print(d[i][j] + " , ");
				}
			}
		}

	}
}