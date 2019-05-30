
public class SingletonTest {
	public static void main(String[] args) {
		Renban c1 = Renban.getInstance();
		Renban c2 = Renban.getInstance();

		System.out.println(c1.getString() + "の製造番号: " + c1.getNumber());
		System.out.println(c2.getString() + "の製造番号: " + c2.getNumber());
	}
}


