package java_project;

public class ArrayAsParameterMain {

    public static void main(String[] args) {

        Book[] books = new Book[5];

        Book bookObj1 = new Book("Clean Code", "Robert Martin", 1200);
        Book bookObj2 = new Book("The Old Man and the Sea", "Ernest Hemingway", 1050);
        Book bookObj3 = new Book("The Alchemist", "Paulo Coelho", 650);
        Book bookObj4 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 750);
        Book bookObj5 = new Book("Atomic Habits", "James Clear", 900);

        books[0] = bookObj1;
        books[1] = bookObj2;
        books[2] = bookObj3;
        books[3] = bookObj4;
        books[4] = bookObj5;

        String[] authorNames = getAuthorNames(books);

        for (String authorName : authorNames) {
            System.out.println(authorName.toUpperCase());
        }
    }

    private static String[] getAuthorNames(Book[] booksCopy) {

        int arraySize = booksCopy.length;

        String[] authors = new String[arraySize];
        

        int index = 0; 

        for (Book currentBook : booksCopy) { 
            String currentAuthor = currentBook.getAuthor();
            authors[index] = currentAuthor;
            index++;
        }

        return authors; 
    }
}