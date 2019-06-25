
public class Client {

	public static void main(String[] args) {
		//新規クラス作成
		Koujyou koujyou1 = new TvKoujyou();
		Koujyou koujyou2 = new RadioKoujyou();

		//商品の製造
		Seihin[] array = new Seihin[3];
		array[0] = koujyou1.create();
		array[1] = koujyou2.create();
		array[2] = koujyou1.create();

		for (int i = 0; i < array.length; ++i) {
			//情報を出力
			array[i].print();
		}

	}

}
