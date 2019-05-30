
public class Renban {

	private String str = "本棚";
	private static Renban instance = new Renban();
	private int i = 0;     //ポイント (I)

	private Renban() {                                           //ポイント (II)
		// Constructor
	}

	public static Renban getInstance() {                         //ポイント (III)
		return instance;
	}

	public void setString(String str) {
		this.str = str;
	}

	public String getString() {
		return str;
	}

	public int getNumber(){
		i++;
		return i;
	}
}