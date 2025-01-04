package collections.stack;

public class Book {
	private String title;
	private String release;

	public Book(String title, String release) {
		super();
		this.title = title;
		this.release = release;
	}

	public String getTitle() {
		return title;
	}

	public String getRelease() {
		return release;
	}

	@Override
	public String toString() {
		return "Book [title: " + title + ", release: " + release + "]";
	}

	
}
