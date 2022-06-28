
// TCS
public class FactorialOfANumber {

	public static void main(String[] args) {
		int i = 23456;
		int f = 1;

		while (i > 0) {
			int rem = i % 10;
			f = f * rem;
			i = i / 10;
		}
		System.out.println(f);
	}

}
