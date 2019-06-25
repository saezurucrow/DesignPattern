
class Counter {

	private static int tvNum = 100;
	private static int radioNum = 76;

	public static int getTvNumber() {
		//製造番号を足して渡す
		return tvNum++;
	}

	public static int getRadioNumber() {
		//製造番号を足して渡す
		return radioNum++;
	}

}
