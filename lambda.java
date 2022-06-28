
public class lambda {

	public static void main(String[] args) {
		finterface obj = (name) -> "hello " + name;
		System.out.println(obj.hi("Akash"));

	}

	@FunctionalInterface
	interface finterface {
		String hi(String name);
	}

}