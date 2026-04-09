package java_project;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bookObj = new Book();
		System.out.println(bookObj.getTitle() +" " + bookObj.getPrice());
		
		Book bookObj2 = new Book ("The old man and the sea", "Ernest Hemingway", 1050);
		System.out.println(bookObj2.getTitle());
	}

}
