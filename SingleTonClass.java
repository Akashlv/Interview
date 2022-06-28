
public class SingleTonClass {

	private static SingleTonClass sington = null;

	private SingleTonClass() {
	}

	public static SingleTonClass getInstance() {
		if (sington == null) {
			sington = new SingleTonClass();
			return sington;
		}
		return sington;
	}
}
