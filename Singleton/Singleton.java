
public class Singleton {
	public static void main(String[] args) {
		SingletonTest c1 = SingletonTest.getInstance();
		SingletonTest c2 = SingletonTest.getInstance();

		System.out.println("c1 hashCode: " + c1.hashCode());
		System.out.println("c2 hashCode: " + c2.hashCode());
	}
}


