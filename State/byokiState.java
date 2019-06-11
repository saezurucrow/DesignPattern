
class ByokiState extends DogState{

	private static ByokiState s = new ByokiState();
	private ByokiState() {}

	public static DogState getInstance() {
		return s;
	}

	public void tukareta(Dog moto) {
	// なにもしない
	}

	public void tabeta(Dog moto) {
		moto.changeState(FutsuuState.getInstance());
	}

	public String toString() {
	return "病気状態";
	}
}
