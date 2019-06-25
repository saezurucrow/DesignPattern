

class Television extends Seihin{
	private int tvSerialNumber;
	private String date;

	public void numberring() {
		//製造番号の取得
		tvSerialNumber = Counter.getTvNumber();
	}

	public void setDate(String date) {
		//製造年月日の取得
		this.date = date;
	}

	public void print() {
		System.out.println("このテレビに関する情報:");
		System.out.println(" 製造番号:" + tvSerialNumber);
		System.out.println(" 製造年月日:" + date);
	}
}
