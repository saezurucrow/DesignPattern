
public class SingletonTest {

	private String str = "Hello";
	private static SingletonTest instance = new SingletonTest();     //ポイント (I)

	private SingletonTest() {                                           //ポイント (II)
		// Constructor
	}

	public static SingletonTest getInstance() {                         //ポイント (III)
		return instance;
	}

	public void setString(String str) {
		this.str = str;
	}

	public String getString() {
		return str;
	}
}