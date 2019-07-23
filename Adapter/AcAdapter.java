
class AcAdapter extends Dengen{

	private JapaneseConsent japaneseConsent;

	public AcAdapter(){
		this.japaneseConsent = new JapaneseConsent();
	}

	public int kyuuden() {
		return (int)(japaneseConsent.power() * 0.16);
	}
}
