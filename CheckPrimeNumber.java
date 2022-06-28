
public class CheckPrimeNumber {

	public static void main(String[] args) {

		boolean falg = true;
		int n = 4;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				falg = false;
			}
		}
		System.out.println(falg);
	}
}
