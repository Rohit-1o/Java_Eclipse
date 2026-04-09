package java_project;

public class Book {
	private String title;
	private String author;
	private float price;
	
	//nor argument constuctor
	public Book() {
		title = "Harry Potter";
		author = "J.K. Rowling";
		price = 1200.50f;
	}

	
	//with argument Parameterized Constuctor
	/*public Book(String v_tittle, String v_author, float v_price) {
		title = v_tittle;
		author = v_author;
		price = v_price;
	}
	
	
	//Parameterized Constuctor => String, float, String
	public Book(String v_author, float v_price, String v_tittle) {
		title = v_tittle;
		author = v_author;
		price = v_price;
	}*/
	
	
	public Book(String title, String author, float price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	public Book(String author, float price, String title) {
		super();
		this.author = author;
		this.price = price;
		this.title = title;
	}

	
	
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
