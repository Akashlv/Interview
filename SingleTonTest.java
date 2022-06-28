
public class SingleTonTest {
	
	public static void main(String[] args) {
		
		SingleTonClass l = SingleTonClass.getInstance();
		SingleTonClass j = SingleTonClass.getInstance();
		
		System.out.println(l);
		System.out.println(j);

	}
	

}
