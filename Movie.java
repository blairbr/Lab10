//BLAIR AND KRISTEN'S AWESOME PROJECT

public class Movie {

	// properties
	private String title;

	private String category;

	// GETTERS AND SETTERS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	// CONSTRUCTOR
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}
}

