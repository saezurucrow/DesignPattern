
public class IteratiorSample {
	public static void main(String[] args) {
		BookListAggregate BookListAggregate = new BookListAggregate();
		Iterator iterator = BookListAggregate.createIterator();
		BookListAggregate.add(new Book("たのしいRuby", 3700));
		BookListAggregate.add(new Book("Railsチュートリアル", 7300));
		BookListAggregate.add(new Book("勝ち続ける意志力", 5400));
		BookListAggregate.add(new Book("Pythonスタートブック", 5200));

		iterator.first();
		while ( ! iterator.isDone() ) { // まだある? まだあるよ!
			Book Book = (Book)iterator.getItem(); // はいどうぞ (と受取る)
			System.out.println(Book.getName());
			iterator.next(); // 次を頂戴
		}
	}
}

class Book {
	private String name;
	private int price;

	public Book(String name, int price) { // コンストラクタ
		this.name= name;
		this.price = price;
	}
	public String getName() { // 名称を取得
		return name;
		}
	public int getPrice() { // 価格を取得
		return price;
		}
}


interface Iterator{
	public void first();
	public void next();
	public boolean isDone();
	public Object getItem();
}

class BookListIterator implements Iterator{
	private BookListAggregate aggregate;
	private int current;

	public BookListIterator(BookListAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public void first() {
		current = 0;
	}

	@Override
	public void next() {
		current += 1;
	}

	@Override
	public boolean isDone() {
		if (current >= aggregate.getNumberOfStock()) {
		               return true;
		           }
		           else {
		               return false;
		}
	}

	@Override
	public Object getItem() {
		return aggregate.getAt(current);
	}
}

interface Aggregate{
	public Iterator createIterator();
}

class BookListAggregate implements Aggregate {
	private Book[] list = new Book[20];
	private int numberOfStock;

	@Override
	public Iterator createIterator() {
		return new BookListIterator(this);
	}

	public void add(Book Book) {
		list[numberOfStock] = Book; numberOfStock += 1;
	}

	public Object getAt(int number) {
		return list[number];
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}
}
